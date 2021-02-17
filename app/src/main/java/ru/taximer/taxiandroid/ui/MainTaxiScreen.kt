package ru.taximer.taxiandroid.ui

import android.app.Activity
import android.content.Intent
import android.graphics.Point
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.os.SystemClock
import android.support.design.widget.BottomSheetBehavior
import android.support.design.widget.Snackbar
import android.support.v4.content.ContextCompat
import android.support.v4.content.res.ResourcesCompat
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.widget.LinearLayoutManager
import android.text.Editable
import android.text.TextWatcher
import android.view.KeyEvent
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.PresenterType
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.google.android.gms.location.places.Places
import com.google.android.gms.maps.model.LatLng
import com.google.firebase.analytics.FirebaseAnalytics
import com.treebo.internetavailabilitychecker.InternetAvailabilityChecker
import com.treebo.internetavailabilitychecker.InternetConnectivityListener
import kotlinx.android.synthetic.main.activity_main_taxi_screen.*
import kotlinx.android.synthetic.main.app_bar_main_taxi_screen.*
import kotlinx.android.synthetic.main.bottom_sheet.*
import kotlinx.android.synthetic.main.fragment_map.*
import org.jetbrains.anko.intentFor
import ru.taximer.taxiandroid.BuildConfig
import ru.taximer.taxiandroid.R
import ru.taximer.taxiandroid.network.models.PlaceLocationModel
import ru.taximer.taxiandroid.presenters.MainTaxiPresenter
import ru.taximer.taxiandroid.presenters.MainTaxiView
import ru.taximer.taxiandroid.presenters.UserSettingsPresenter
import ru.taximer.taxiandroid.presenters.base.BaseLoadingView
import ru.taximer.taxiandroid.ui.adapters.OnPlaceListener
import ru.taximer.taxiandroid.ui.adapters.SearchPlaceAdapter
import ru.taximer.taxiandroid.ui.widget.ClearableEditText
import ru.taximer.taxiandroid.utils.gms.GoogleApiPartial
import ru.taximer.taxiandroid.utils.gms.GoogleApiPartialActivityCallbacks
import ru.taximer.taxiandroid.utils.gms.GoogleApiPartialCallbacks
import ru.taximer.taxiandroid.utils.hideKeyboard
import ru.taximer.taxiandroid.utils.isNotNullOrEmpty
import ru.taximer.taxiandroid.utils.showKeyboard
import javax.inject.Inject


class MainTaxiScreen :
        MvpAppCompatActivity(),
        MainTaxiView,
        TextWatcher,
        GoogleApiPartialCallbacks,
        GoogleApiPartialActivityCallbacks,
        OnPlaceListener,
        BaseLoadingView,
        View.OnFocusChangeListener,
        InternetConnectivityListener {

    @InjectPresenter(type = PresenterType.GLOBAL)
    lateinit var presenter: MainTaxiPresenter

    @ProvidePresenter(type = PresenterType.GLOBAL)
    fun provideMainTaxiPresenter(): MainTaxiPresenter = MainTaxiPresenter()

    @InjectPresenter(type = PresenterType.LOCAL)
    lateinit var userSettingsPresenter: UserSettingsPresenter

    @ProvidePresenter(type = PresenterType.LOCAL)
    fun provideUserSettingsPresenter(): UserSettingsPresenter = UserSettingsPresenter()


    private var adapter: SearchPlaceAdapter? = null
    private lateinit var googleApiPartial: GoogleApiPartial<MainTaxiScreen>
    private var mFirebaseAnalytics: FirebaseAnalytics? = null
    val handler = Handler()
    lateinit var snackbar: Snackbar
    var delayMilliseconds : Long = 600
    private var mInternetAvailabilityChecker: InternetAvailabilityChecker? = null
    var completeAddr: String = ""
    lateinit var toggle: ActionBarDrawerToggle
    var click: Int = 0
    var devClicker = 0
    var ignoreChange = false
    val tmpHandler = Handler()


    companion object {
        fun launch(context: Activity) {
            val intent = context.intentFor<MainTaxiScreen>().apply {
                addFlags(
                        Intent.FLAG_ACTIVITY_CLEAR_TOP
                                or Intent.FLAG_ACTIVITY_SINGLE_TOP)
            }
            context.startActivity(intent)
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        if (Build.VERSION.SDK_INT < 16) {
//            window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                    WindowManager.LayoutParams.FLAG_FULLSCREEN)
//        }

        setContentView(R.layout.activity_main_taxi_screen)
        setSupportActionBar(toolbar)
        snackbar = Snackbar.make(rootContainer, getText(R.string.rationale_o_internet_off), Snackbar.LENGTH_INDEFINITE)

        mInternetAvailabilityChecker = InternetAvailabilityChecker.getInstance()
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this)
        googleApiPartial = GoogleApiPartial(
                this,
                this,
                Places.GEO_DATA_API,
                Places.PLACE_DETECTION_API)
        googleApiPartial.restoreState(savedInstanceState)
        googleApiPartial.start()

        toggle = object : ActionBarDrawerToggle(
                this,
                drawer_layout,
                toolbar,
                R.string.navigation_drawer_open,
                R.string.navigation_drawer_close
        ) {override fun onDrawerOpened(drawerView: View) {
            super.onDrawerOpened(drawer_layout)
            mFirebaseAnalytics?.logEvent("fa_click_services", null)
        }}
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        appVersionView.text = BuildConfig.VERSION_NAME

        adapter = SearchPlaceAdapter(googleApiPartial, this)

        autocompleteAddresses.layoutManager = LinearLayoutManager(this)
//        autocompleteAddresses.setEmptyView(list_empty)
        autocompleteAddresses.adapter = adapter

        goBar.setOnClickListener { _ ->
            adapter?.getAutocomplete(
                    "",
                    false,
                    presenter.getSearchLocation()
            )
            openEndSearch()
        }

        val task = Runnable {
            goBar.visibility = View.VISIBLE
        }
        tmpHandler.postDelayed({
            task.run()
        }, 2000)

        goButton.setOnClickListener {
            mFirebaseAnalytics?.logEvent("fa_click_button_go", null)
            presenter.onSearch()
        }

        manualSelectBtn.setOnClickListener {
            setEditState(false, false, null)
            if (presenter.isStartEdit) {
                mFirebaseAnalytics?.logEvent("fa_click_point_on_map_from", null)
            }
            if(presenter.isEndEdit) {
                mFirebaseAnalytics?.logEvent("fa_click_point_on_map_where", null)
            }
            hidePanel(false)
        }

        fromBar.addTextChangedListener(this)
        fromBar.onFocusChangeListener = this
        fromBar.setOnClickListener { _ ->
//            adapter?.getAutocomplete(
//                    fromBar.text.toString(),
//                    true,
//                    presenter.getSearchLocation()
//            )
        }

        toBar.addTextChangedListener(this)
        toBar.onFocusChangeListener = this
        toBar.setOnKeyListener(View.OnKeyListener { v, keyCode, event ->
            if (keyCode == KeyEvent.KEYCODE_ENTER && event.action == KeyEvent.ACTION_UP) {
                if (adapter?.itemCount != 0) {
                    toBar.text.insert(0, adapter?.getPredicition()?.address)
                    adapter?.onPlaceSelect(adapter?.getPredicition()!!)
                }
                return@OnKeyListener true
            }
            false
        })

        changeAddress.setOnClickListener {
            openStartSearch()
        }

        addressText.setOnClickListener {
            if (presenter.isStartEdit) {
                openStartSearch()
            }
            if (presenter.isEndEdit) {
                openEndSearch()
            }
        }

        closePopupBtn.setOnClickListener {
            hidePanel(presenter.isBothLocationSelected())
            if (presenter.isBothLocationSelected()) {
                presenter.setReady()
            }
        }


        imageView.setOnClickListener {
            devClicker ++
            if (devClicker.equals(5)) {
//                TaximerApp.appModule.host = Config.DEV_URL
                Toast.makeText(applicationContext,"clicked count is"+devClicker, Toast.LENGTH_LONG).show()
            }
        }

        notificationSwitch.setOnCheckedChangeListener { _, value ->
            userSettingsPresenter.changeNotifications(value)
        }

        markAppView.setOnClickListener {
            mFirebaseAnalytics?.logEvent("fa_click_button_rating", null)
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=ru.taximer.taxiandroid")))
        }

        shareAppView.setOnClickListener {
            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "https://play.google.com/store/apps/details?id=ru.taximer.taxiandroid")
                type = "text/plain"
            }
            mFirebaseAnalytics?.logEvent("fa_click_button_sharing", null)
            startActivity(sendIntent)
        }

        setFeedBack()

        val bottomSheetBehavior = BottomSheetBehavior.from(bottomSheet)
        bottomSheetBehavior.setBottomSheetCallback(BottomCallbck())

        fromBar.addTextChangedListener(this)
        toBar.addTextChangedListener(this)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1) {
            if (data != null) {

                hidePanel(false)
                val case = data?.getBooleanExtra("case", false)
                completeAddr = data?.getStringExtra("address")
//                adapter?.getAutocomplete(
//                        completeAddr,
//                        presenter.isStartEdit,
//                        presenter.getSearchLocation())
                if (case!!) {
                    openStartSearch()
                } else {
                    openEndSearch()
                }
            }
        }
    }


    override fun onResume() {
        super.onResume()
        mInternetAvailabilityChecker?.addInternetConnectivityListener(this)
        googleApiPartial.reconnect()
    }

    override fun onStop() {
        super.onStop()
        presenter.onDestroy()
    }

    override fun onDestroy() {
        super.onDestroy()

        googleApiPartial.destroy()
        mInternetAvailabilityChecker?.removeInternetConnectivityChangeListener(this)
        toBar.addTextChangedListener(null)
        toBar.onFocusChangeListener = null
    }

    override fun onKeyDown(keycode: Int, event: KeyEvent): Boolean {
        if (keycode == KeyEvent.KEYCODE_BACK) {
            moveTaskToBack(true)
        }
        return super.onKeyDown(keycode, event)
    }

    override fun onBackPressed() = when {
        drawer_layout.isDrawerOpen(GravityCompat.START) ->
            drawer_layout.closeDrawer(GravityCompat.START)
        else -> {
            val bottomSheetBehavior = BottomSheetBehavior.from(bottomSheet)
            when {
                bottomSheetBehavior.state == BottomSheetBehavior.STATE_EXPANDED -> {
                    mFirebaseAnalytics?.logEvent("fa_click_button_back", null)
                    hidePanel(presenter.isBothLocationSelected())
                }
                else -> {
                    super.onBackPressed()
                }
            }
        }
    }

    override fun onGoogleApiClientErrorResolved() {
        googleApiPartial.onErrorResolved()
    }

    private fun setFeedBack() {
        feedback.setOnClickListener { }
    }

    override fun startSearch(start: PlaceLocationModel, end: PlaceLocationModel) {
        TaxiActivity.launch(this, start, end)
        mFirebaseAnalytics?.logEvent("fa_click_button_go", null)
    }


    //region Autocomplete Changing flow

    fun EditText.onChange(cb: (String) -> Unit) {
        this.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(s: Editable?) { cb(s.toString()) }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })
    }

    override fun onFocusChange(p0: View?, value: Boolean) {
        when (p0?.id) {
            R.id.fromBar -> {
                if (value) {
                    presenter.editStart()
                    p0.setBackgroundResource(R.color.grey_400)
                    toBar.setBackgroundColor(resources.getColor(R.color.white))
                    toBar.clearFocus()
                    manualSelectBtn.setCompoundDrawablesWithIntrinsicBounds(ResourcesCompat.getDrawable(resources,
                            R.drawable.ic_icon_pickup_small, null), null, null, null)
                    manualSelectBtn.setOnClickListener {
                        presenter.setManual()
                        setEditState(true, false, presenter.getSearchLocation())
                        hidePanel(false)
                    }
                }
            }
            R.id.toBar -> {
                if (value) {
                    presenter.editEnd()
                    p0.setBackgroundResource(R.color.grey_400)
                    fromBar.clearFocus()
                    fromBar.setBackgroundColor(resources.getColor(R.color.white))
                    manualSelectBtn.setCompoundDrawablesWithIntrinsicBounds(ResourcesCompat.getDrawable(resources,
                            R.drawable.ic_icon_marker_yellow, null), null, null, null)
                    manualSelectBtn.setOnClickListener {
                        presenter.setManual()
                        setEditState(false, false, presenter.getSearchLocation())
                        hidePanel(false)
                    }
                }
            }
        }
//        openPanel()
    }

    override fun setManual() {
    }

    override fun afterTextChanged(p0: Editable?) {
        handler.removeCallbacksAndMessages(null)

        if (p0!!.length >= 3) {
            val runnable = Runnable {
                adapter?.getAutocomplete(
                        p0?.toString(),
                        presenter.isStartEdit,
                        presenter.getSearchLocation())}
            handler.postDelayed(runnable, delayMilliseconds)

        } else {
            adapter?.getAutocomplete(
                    p0?.toString(),
                    presenter.isStartEdit,
                    presenter.getSearchLocation())
        }
//        if (!ignoreChange) {
//            ignoreChange = !ignoreChange
//            if (p0!!.length >= 3) {
//                handler.removeCallbacksAndMessages(null)
//                adapter?.getAutocomplete(
//                        p0?.toString(),
//                        presenter.isStartEdit,
//                        presenter.getSearchLocation())
//            }
//        }
    }

    override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
//        adapter?.clear()
//
//        adapter?.getAutocomplete(
//                p0?.toString(),
//                presenter.isStartEdit,
//                presenter.getSearchLocation())

    }

    override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        if (!ignoreChange) {
            ignoreChange = !ignoreChange
            if (p0!!.length >= 3 && p3 > 4) {
                handler.removeCallbacksAndMessages(null)
                adapter?.getAutocomplete(
                        p0?.toString(),
                        presenter.isStartEdit,
                        presenter.getSearchLocation())
            }
        }


    }

    //endregion


    //region Presenter States

    override fun setBeginState(pos: PlaceLocationModel?) {

    }

    override fun setManualSelectionState(isStart: Boolean, position: LatLng?) {
        goButton.visibility = View.GONE
    }


    override fun onPlaceSelect(place: PlaceLocationModel, placeTypes: List<Int>?) {
        var editText: ClearableEditText = ClearableEditText(this)

        if (presenter.isStartEdit) {
            mFirebaseAnalytics?.logEvent("fa_history_map_from_go", null)
            editText = fromBar
        }
        if (presenter.isEndEdit) {
            mFirebaseAnalytics?.logEvent("fa_history_where_go", null)
            editText = toBar
        }

        if (placeTypes.isNotNullOrEmpty()) {
            if (click == 0) {
                if (placeTypes!!.contains(1021) or placeTypes.contains(34)) {
                    presenter.setLocation(place)
                    hidePanel(presenter.isBothLocationSelected())
                    presenter.setReady()
                }
                else {
                    val text = place.address.plus(", ")
                    editText.setText(text)
                    editText.setSelection(text.length)
                    click ++
//                    presenter.setReady()
//                    hidePanel(presenter.isBothLocationSelected())

                }
            } else {
                presenter.getGeoCodeResult(place.latitude, place.longitude, "autocomplete",0, 0)
                click = 0
                presenter.setLocation(place)
                hidePanel(presenter.isBothLocationSelected())
                presenter.setReady()
            }

        } else editText.setText(place.address)
            editText.setSelection(editText.text.length)
    }



    override fun setStart(location: PlaceLocationModel?) {
//        fromBar.editableText.clear()
        if (location != null) {
            fromBar.setText(location.address)
        }
    }

    fun openStartSearch() {
//        goBar.visibility = View.VISIBLE
        cardView2.visibility = View.GONE
        imageView4.visibility = View.GONE
        cardView.visibility = View.VISIBLE
        imageView3.visibility = View.VISIBLE
        if (presenter.isBothLocationSelected()) {
            goButton.visibility = View.VISIBLE
        }
        presenter.editStart()
        adapter?.getAutocomplete(
                "",
                false,
                presenter.getSearchLocation()
        )
        openPanel()

        mFirebaseAnalytics?.logEvent("fa_click_map_from_go", null)

    }

    override fun setEnd(location: PlaceLocationModel?) {
        if (location != null) {
            if(!toBar.text.equals(location.address)) {
                toBar.setText(location.address)
            }
        }
    }

    fun openEndSearch() {
        goBar.visibility = View.GONE
        cardView.visibility = View.GONE
        imageView3.visibility = View.GONE
        cardView2.visibility = View.VISIBLE
        imageView4.visibility = View.VISIBLE

        presenter.editEnd()
        adapter?.getAutocomplete(
                "",
                false,
                presenter.getSearchLocation())
        openPanel()

        mFirebaseAnalytics?.logEvent("fa_click_where_go", null)
    }



    override fun setReadyState() {
        if (presenter.isBothLocationSelected()) {
            goButton.visibility = View.VISIBLE
            goBar.visibility = View.GONE
        } else {
            goBar.visibility = View.VISIBLE
            goButton.visibility = View.GONE
        }
    }

    override fun setEditState(isStartEdit: Boolean, isBothLocationContaints: Boolean, position: LatLng?) {
//        if (isStartEdit) {
//            presenter.editStart()
//        } else {
//            presenter.editEnd()
//        }
    }

    //endregion

    fun openPanel() {
        bottomSheet.visibility = View.VISIBLE

        val bottomSheetBehavior = BottomSheetBehavior.from(bottomSheet)
        if (bottomSheetBehavior.state != BottomSheetBehavior.STATE_EXPANDED) {
            bottomSheetBehavior.state = BottomSheetBehavior.STATE_EXPANDED
        }


    }

    fun hidePanel(isBothLocationContaints: Boolean) {

        val bottomSheetBehavior = BottomSheetBehavior.from(bottomSheet)
        adapter?.clear()
        if (isBothLocationContaints) {
            bottomSheetBehavior.isHideable = true
            toggle.isDrawerIndicatorEnabled = false
            drawer_layout.removeDrawerListener(toggle)
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            supportActionBar?.setHomeButtonEnabled(true)

            toggle.setToolbarNavigationClickListener {
                cardView.visibility = View.VISIBLE
                imageView3.visibility = View.VISIBLE
                cardView2.visibility = View.VISIBLE
                imageView4.visibility = View.VISIBLE

                openPanel()
            }

            bottomSheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED
        }
        else {
            bottomSheetBehavior.isHideable = false
            bottomSheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED
        }
    }



    inner class BottomCallbck : BottomSheetBehavior.BottomSheetCallback(){
        override fun onStateChanged(bottomSheet: View, newState: Int) {
            when(newState) {
                BottomSheetBehavior.STATE_EXPANDED ->{
                    if (presenter.isStartEdit) {
                        fromBar.setSelection(fromBar.text.length)
                        fromBar.showKeyboard()
                    } else {
                        toBar.setSelection(toBar.text.length)
                        toBar.showKeyboard()
                    }
                    coloredContainer.setBackgroundColor(ContextCompat.getColor(applicationContext, R.color.white))
                }
                BottomSheetBehavior.STATE_COLLAPSED ->{
                    toBar.hideKeyboard()
                    toBar.showSoftInputOnFocus = false
                    fromBar.hideKeyboard()
                    fromBar.showSoftInputOnFocus = false
                    coloredContainer.setBackgroundResource(R.drawable.rounded_bottom_dialog)
//                    presenter.setManual()
//                    setEditState(true, false, presenter.getSearchLocation())
//                    hidePanel(false)
                }
                BottomSheetBehavior.STATE_DRAGGING -> {
                    BottomSheetBehavior.from(bottomSheet).state = BottomSheetBehavior.STATE_EXPANDED
                }
            }
        }

        override fun onSlide(bottomSheet: View, slideOffset: Float) {
            //nope
       }
    }

    override fun onInternetConnectivityChanged(isConnected: Boolean) {
        if (isConnected) {
            goButton.isEnabled = true
            snackbar.dismiss()
        } else {
            goButton.isEnabled = false
            snackbar.show()
        }
    }

    override fun hideLoading() {
        //nope
    }

    override fun showError(message: String) {
        //nope
    }

    override fun showLoading() {
        //nope
    }
}
