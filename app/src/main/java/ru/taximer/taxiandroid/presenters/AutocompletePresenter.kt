package ru.taximer.taxiandroid.presenters

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.google.android.gms.location.places.AutocompleteFilter
import com.google.android.gms.location.places.Places
import com.google.android.gms.maps.model.LatLng
import io.reactivex.BackpressureStrategy
import io.reactivex.Flowable
import io.reactivex.disposables.Disposable
import ru.taximer.taxiandroid.TaximerApp
import ru.taximer.taxiandroid.network.models.PlacePredictionModel
import ru.taximer.taxiandroid.network.usecases.TaxiUsecases
import ru.taximer.taxiandroid.network.usecases.applyDefaultNetSchedulers
import ru.taximer.taxiandroid.presenters.base.BaseLoadingView
import ru.taximer.taxiandroid.utils.gms.getPredictions


interface AutocompleteView : BaseLoadingView {
    fun showPredictions(word: String, point: LatLng)
    fun showHistory(history:ArrayList<PlacePredictionModel>)
}


@InjectViewState
class AutocompletePresenter: MvpPresenter<AutocompleteView>() {
    private val historyPoints = ArrayList<PlacePredictionModel>()

    private var suggestionSubscription: Disposable? = null
    private var placeSubscription: Disposable? = null

    val usecases: TaxiUsecases = TaximerApp.appComponent.baseUsecases()

    fun showHistory(isStart: Boolean, point: LatLng) {
        usecases.getHistory(isStart, point)                .subscribe(
                        { buffer ->
                            val res = buffer.map { PlacePredictionModel(it) }
                            historyPoints.addAll(res)
                            viewState.showHistory(historyPoints)
                        },
                        {
                            it.printStackTrace()
                        },
                        { }
                )
    }

    fun showPredictions(word: String, point: LatLng) {

    }

}