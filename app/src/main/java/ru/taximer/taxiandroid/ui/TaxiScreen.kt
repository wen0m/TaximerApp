package ru.taximer.taxiandroid.ui

import android.app.Activity
import android.app.AlertDialog
import android.content.ActivityNotFoundException
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.PresenterType
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.ethanhua.skeleton.RecyclerViewSkeletonScreen
import com.ethanhua.skeleton.Skeleton
import com.google.android.gms.maps.model.LatLng
import com.google.firebase.analytics.FirebaseAnalytics
import kotlinx.android.synthetic.main.activity_applications.*
import org.jetbrains.anko.intentFor
import ru.taximer.taxiandroid.R
import ru.taximer.taxiandroid.network.models.PlaceLocationModel
import ru.taximer.taxiandroid.network.models.SearchTaxiModel
import ru.taximer.taxiandroid.presenters.*
import ru.taximer.taxiandroid.ui.adapters.OnTaxiHolderListener
import ru.taximer.taxiandroid.ui.adapters.TaxiAdapter
import ru.taximer.taxiandroid.ui.adapters.TaxiCallHolderListener
import ru.taximer.taxiandroid.ui.dialogs.ConfirmPhoneDialog
import ru.taximer.taxiandroid.ui.dialogs.OrderTaxiDialog
import java.util.*
import kotlin.concurrent.schedule
import kotlin.concurrent.scheduleAtFixedRate


private const val START_PLACE = "start_place"
private const val END_PLACE = "end_place"

class TaxiActivity :
        MvpAppCompatActivity(),
        TaxoparkView,
        GetTaxiView,
        GetBestTaxiView,
        OnTaxiHolderListener, TaxiCallHolderListener, ConfirmPhoneDialog.SendCode, OrderTaxiDialog.GetOrder {

    @InjectPresenter(type = PresenterType.LOCAL)
    lateinit var presenter: TaxoparkPresenter

    @ProvidePresenter(type = PresenterType.LOCAL)
    fun provideTaxoparkPresenter(): TaxoparkPresenter = TaxoparkPresenter()

    @InjectPresenter(type = PresenterType.LOCAL)
    lateinit var presenterTaxi: GetTaxiPresenter

    @ProvidePresenter(type = PresenterType.LOCAL)
    fun provideGetTaxiPresenter(): GetTaxiPresenter = GetTaxiPresenter()

    @InjectPresenter(type = PresenterType.LOCAL)
    lateinit var presenterBestTaxi: GetBestTaxiPresenter

    @ProvidePresenter(type = PresenterType.LOCAL)
    fun provideGetBestPresenter(): GetBestTaxiPresenter = GetBestTaxiPresenter()

    private var mAdapter: TaxiAdapter? = null
    private var skeletonScreen: RecyclerViewSkeletonScreen? = null
    private var mFirebaseAnalytics: FirebaseAnalytics? = null
    var hash: String = ""
    lateinit var startPoint : LatLng
    lateinit var endPoint : LatLng
    lateinit var start : PlaceLocationModel
    lateinit var end : PlaceLocationModel
    var taxId: String = ""
    var orderId: Int = 0


    companion object {
        fun launch(context: Activity, placeStart: PlaceLocationModel, placeEnd: PlaceLocationModel) {
            val intent = context.intentFor<TaxiActivity>(
                    START_PLACE to placeStart,
                    END_PLACE to placeEnd
            ).apply {
                addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP)
            }
            context.startActivityForResult(intent, 1)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_applications)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this)

        initList()
    }

    override fun onResume() {
        super.onResume()
        start = intent.getParcelableExtra(START_PLACE) as PlaceLocationModel
        end = intent.getParcelableExtra(END_PLACE) as PlaceLocationModel

        if (mAdapter?.itemCount == 0) {
            presenter.setPoints(start, end)
        }

        startPlace.text = start.address
        startPoint = LatLng(start.latitude, start.longitude)
        endPlace.text = end.address
        endPoint = LatLng(end.latitude, end.longitude)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.taxi_search, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            android.R.id.home -> {
                finish()
            }
//пока не используется
//            R.id.action_settings -> {
//                SettingsActivity.launch(this)
//            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun initList() {
        mAdapter = TaxiAdapter(this, this)
        applications.layoutManager = LinearLayoutManager(this)
        applications.adapter = mAdapter
        startPlace.setOnClickListener {
            mFirebaseAnalytics?.logEvent("fa_click_searchView_from", null )

            setResult(Activity.RESULT_OK, Intent().putExtra("case", true).putExtra("address", start.address))
            finish()
      }
        endPlace.setOnClickListener {
            mFirebaseAnalytics?.logEvent("fa_click_searchView_where", null )

            setResult(Activity.RESULT_OK, Intent().putExtra("case", false).putExtra("address", end.address))
            finish()
        }
    }


    override fun setTaxoparkPack(taxoparl: List<Long>, hash: String) {
        presenterTaxi.setTaxoparks(taxoparl, hash)
        //TODO переделать через rxstream event

        val handler = Handler()
        handler.postDelayed({
            presenterBestTaxi.setHash(hash)
            mFirebaseAnalytics?.logEvent("fa_marketplaceApp", null)
        }, 3000)

    }

    override fun addBestTaxi(taxi: SearchTaxiModel) {
        taxi.isBest = true
        mAdapter?.addItem(taxi)
    }

    override fun addTaxi(taxi: SearchTaxiModel) {
        if (mAdapter?.itemCount == 0) {
            skeletonScreen?.hide()
        }
        mAdapter?.addItem(taxi)
    }

    override fun showResults() {
        var count: Int
        count = mAdapter?.itemCount!!

    }

    override fun lastResultAdded() {
        Log.i("LASTITEM", "LASTITEM")
    }

    override fun showLoadingIndicator() {
        progressBar.visibility = View.VISIBLE
    }

    override fun hideLoadingIndicator() {
        progressBar.visibility = View.GONE
    }

    override fun hideLoading() {
//        loadingLbl.text = "Найдено "+ mAdapter?.itemCount + " вариантов"
    }

    override fun showLoading() {
        mAdapter?.clear()
        skeletonScreen = Skeleton.bind(applications)
                .adapter(mAdapter)
                .load(R.layout.item_skeleton_taxi)
                .show()
    }

    override fun showError(message: String) {
//         val snackbar = Snackbar.make(root_container, message, Snackbar.LENGTH_LONG)
//        snackbar.show()
    }

    override fun onAppSelect(type: Int, installUrl: String, openUrl: String, appId: String, taxoparkId: String, taxinameEng: String) {
        taxId = taxoparkId
        if (type==1) {
            //        try {
            mFirebaseAnalytics?.logEvent("fa_click_$taxinameEng", null )
            val intent: Intent? =
                    if (appInstalledOrNot(appId)) {
                        if (openUrl.isNotEmpty()) {
                            try {
                                presenter.openEvent(taxoparkId)
                                Intent(Intent.ACTION_VIEW, Uri.parse(openUrl))
                            }
                            catch (e: ActivityNotFoundException) {
                                if (installUrl.isNotEmpty()) {
                                    presenter.installEvent(taxoparkId)
                                    Intent(Intent.ACTION_VIEW, Uri.parse(installUrl))
                                } else {
                                    Log.e("ERR", e.localizedMessage)
                                    null
                                }
                            }
                        }else{
                            null
                        }
                    }
                    else {
                        if (installUrl.isNotEmpty()) {
                            presenter.installEvent(taxoparkId)
                            Intent(Intent.ACTION_VIEW, Uri.parse(installUrl))
                        }else {
                            null
                        }
                    }
            intent ?: return
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
//        } catch (e: Exception) {
//            val snackbar = Snackbar.make(root_container, getText(R.string.rationale_error), Snackbar.LENGTH_LONG)
//            snackbar.show()
//        }
        }
        if (type == 2) {

        var dialog = OrderTaxiDialog.newInstance("бла бла бла")
        dialog.show(fragmentManager, "TEST")

//            var dialog = ConfirmPhoneDialog()
//            dialog.show(fragmentManager, "TEST")
//            refreshOrderStatus("Таксопарк бла бла бла")
        }
    }

    override fun onSendCodeResult(result: String) {
        presenter.sendAuthCode("+7", result.toLong())
    }

    override fun onCodeConfirm(code: String) {
        presenter.confirmPhone(code)
    }

    override fun onOrderResult() {
    }

    override fun changeNumberResult() {
        Toast.makeText(this, "changeNumber_call", Toast.LENGTH_SHORT).show()

    }

    override fun refreshOrderStatus(description: String, orderId: Int) {
        this.orderId = orderId

    }

    override fun getOrder() {
        presenter.orderByPhone(taxId, presenter.searchHash)
    }

    override fun onCancel() {
        presenter.cancelOrder(this.orderId)
    }

    override fun onPhoneCall() {
        val builder = AlertDialog.Builder(this@TaxiActivity)
        builder.setTitle("Укажите свой номер телефона")
        builder.setMessage("и таксопарк вам перезвонит")
    }

    private fun appInstalledOrNot(uri: String): Boolean {
        val pm = packageManager
        try {
            pm.getPackageInfo(uri, PackageManager.GET_ACTIVITIES)
            return true
        }
        catch (e: PackageManager.NameNotFoundException) {
        }

        return false
    }

    override fun onBackPressed() {
        super.onBackPressed()
        presenter.onDestroy()
        finish()
    }

}
