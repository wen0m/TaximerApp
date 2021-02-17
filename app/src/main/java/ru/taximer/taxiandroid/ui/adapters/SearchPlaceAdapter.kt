package ru.taximer.taxiandroid.ui.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.google.android.gms.location.places.AutocompleteFilter
import com.google.android.gms.maps.model.LatLng
import io.reactivex.disposables.Disposable
import ru.taximer.taxiandroid.R
import ru.taximer.taxiandroid.TaximerApp
import ru.taximer.taxiandroid.network.models.PlaceLocationModel
import ru.taximer.taxiandroid.network.models.PlacePredictionModel
import ru.taximer.taxiandroid.network.models.emptyPrediction
import ru.taximer.taxiandroid.network.usecases.TaxiUsecases
import ru.taximer.taxiandroid.network.usecases.applyDefaultNetSchedulers
import ru.taximer.taxiandroid.ui.MainTaxiScreen
import ru.taximer.taxiandroid.utils.gms.GoogleApiPartial
import ru.taximer.taxiandroid.utils.gms.getPlace
import ru.taximer.taxiandroid.utils.gms.getPredictions
import com.google.android.gms.maps.model.LatLngBounds
import com.google.maps.android.SphericalUtil
import java.util.concurrent.TimeUnit

private val VIEW_TYPE_EMPTY_PLACEHOLDER = 0
private val VIEW_TYPE_OBJECTS_VIEW = 1

interface OnPlaceHolderListener {
    fun onPlaceSelect(place: PlacePredictionModel)
}

interface OnPlaceListener {
    fun onPlaceSelect(place: PlaceLocationModel, placeTypes: List<Int>?)
}

class SearchPlaceAdapter(val googleApiPartial: GoogleApiPartial<MainTaxiScreen>, val listener: OnPlaceListener): RecyclerView.Adapter<SearchPlaceViewHolder>(), OnPlaceHolderListener {
    private var query: String = ""
    private val data = ArrayList<PlacePredictionModel>()
    private val dataFrom = ArrayList<PlacePredictionModel>()
    private val dataTo = ArrayList<PlacePredictionModel>()
    private var suggestionSubscription: Disposable? = null
    private var placeSubscription: Disposable? = null

    val usecases: TaxiUsecases = TaximerApp.appComponent.baseUsecases()


    override fun getItemCount(): Int = data.size

    fun getPredicition(): PlacePredictionModel = data[0]

    fun setItems(data: List<PlacePredictionModel>) {
        this.data.clear()
        this.data.addAll(data)
        notifyDataSetChanged()
    }

    override fun getItemViewType(position: Int): Int {
        return if (itemCount == 0) {
            VIEW_TYPE_EMPTY_PLACEHOLDER
        } else {
            VIEW_TYPE_OBJECTS_VIEW
        }
    }

    override fun onBindViewHolder(holder: SearchPlaceViewHolder, position: Int) {
        holder.bind(data[position], this)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchPlaceViewHolder {
        return SearchPlaceViewHolder.create(LayoutInflater.from(parent.context), parent)
    }

    override fun onPlaceSelect(place: PlacePredictionModel) {
        placeSubscription?.dispose()

        place.let {
            if (place.historyId != null) {
                listener.onPlaceSelect(PlaceLocationModel(place.location!!, place.address, "history", place.historyId!!, ""), place.placeTypes)
            } else {
                placeSubscription = googleApiPartial.getPlace(place.placeId!!)
                        ?.applyDefaultNetSchedulers()
                        ?.subscribe(
                                {
                                    listener.onPlaceSelect(PlaceLocationModel(it.get(0), place.address, "google", 0, ""), it.get(0).placeTypes)
                                },
                                {
                                    error { it.toString() }
                                },
                                { })
            }
            return
        }
    }

    fun clear() {
        data.clear()
        notifyDataSetChanged()
    }

    @Synchronized
    fun getAutocomplete(constraint: String?, isStart: Boolean = false, point: LatLng? = null) {
        val HEADING_NORTH_EAST = 45.0
        val HEADING_SOUTH_WEST = 215.0
        val diagonalBoundsSize = 100.0 // 20km

        val northEast = SphericalUtil.computeOffset(point, diagonalBoundsSize / 2, HEADING_NORTH_EAST)
        val southWest = SphericalUtil.computeOffset(point, diagonalBoundsSize / 2, HEADING_SOUTH_WEST)
        val bounds = LatLngBounds(southWest, northEast)

        if (constraint.isNullOrEmpty()) {
            getHistoryPoints(isStart, point!!)
            notifyDataSetChanged()
            return
        }
        if (constraint!!.length <= 2) {
            getHistoryPoints(isStart, point!!)
            notifyDataSetChanged()
            return
        }
        if (query == constraint) {
            return
        }
        query = constraint!!
        if (query == "") {
            getHistoryPoints(isStart, point!!)
            notifyDataSetChanged()
            return
        }

        suggestionSubscription?.dispose()
        suggestionSubscription = googleApiPartial.getPredictions(
                query, bounds, AutocompleteFilter.Builder().setCountry("RU").setTypeFilter(AutocompleteFilter.TYPE_FILTER_GEOCODE)
                .build())
                ?.debounce(500, TimeUnit.MILLISECONDS)
                ?.distinctUntilChanged()
                ?.applyDefaultNetSchedulers()
                ?.subscribe(
                        { buffer ->
                            val res = buffer.map { PlacePredictionModel(it) }
                            setItems(res)
                        },
                        {
                            data.clear()
                            it.printStackTrace()
                        },
                        { notifyDataSetChanged() })
    }


    fun getHistoryPoints(isStart: Boolean, point: LatLng) {
        usecases.getHistory(isStart, point)
                .subscribe(
                        { buffer ->
                            val res = buffer.map { PlacePredictionModel(it) }
                            setItems(res)
                        },
                        {
                            data.clear()
                            it.printStackTrace()
                        },
                        { notifyDataSetChanged() })
    }

    fun getPredicions(constraint: String?, isStart: Boolean = false, point: LatLng? = null) {
        val HEADING_NORTH_EAST = 45.0
        val HEADING_SOUTH_WEST = 215.0
        val diagonalBoundsSize = 100.0 // 20km

        val northEast = SphericalUtil.computeOffset(point, diagonalBoundsSize / 2, HEADING_NORTH_EAST)
        val southWest = SphericalUtil.computeOffset(point, diagonalBoundsSize / 2, HEADING_SOUTH_WEST)
        val bounds = LatLngBounds(southWest, northEast)

        suggestionSubscription?.dispose()

        suggestionSubscription = googleApiPartial.getPredictions(
                query, bounds, AutocompleteFilter.Builder().setCountry("RU").setTypeFilter(AutocompleteFilter.TYPE_FILTER_GEOCODE)
                .build())
                ?.debounce(1, TimeUnit.SECONDS)
                ?.applyDefaultNetSchedulers()
                ?.subscribe(
                        { buffer ->
                            val res = buffer.map { PlacePredictionModel(it) }
                            setItems(res)
                        },
                        {
                            data.clear()
                            it.printStackTrace()
                        },
                        { notifyDataSetChanged() })
    }
}

class SearchPlaceViewHolder private constructor(root: View) : RecyclerView.ViewHolder(root) {
    companion object {
        fun create(inflater: LayoutInflater, parent: ViewGroup) =
                SearchPlaceViewHolder(inflater.inflate(R.layout.item_place, parent, false))
    }

    private var placeName: TextView = root.findViewById(R.id.place_name)
    private var placeAddress: TextView = root.findViewById(R.id.place_address)

    var model = emptyPrediction
    var listener: OnPlaceHolderListener? = null

    init {
        root.setOnClickListener { listener?.onPlaceSelect(model) }
    }

    fun bind(model: PlacePredictionModel, listener: OnPlaceHolderListener) {
        this.listener = listener
        this.model = model
        placeName.text = this.model.address
        placeAddress.text = this.model.fullAddress
    }

}
