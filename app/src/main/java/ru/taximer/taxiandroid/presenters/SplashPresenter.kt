package ru.taximer.taxiandroid.presenters

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import com.google.android.gms.maps.model.LatLng
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import ru.taximer.taxiandroid.Prefs
import ru.taximer.taxiandroid.TaximerApp
import ru.taximer.taxiandroid.network.usecases.UserUsecases
import ru.taximer.taxiandroid.presenters.base.BaseLoadingView
import ru.taximer.taxiandroid.presenters.base.BaseRxPresenter


///////////////////////////////////////////////////////////////////////////
// Splash View
///////////////////////////////////////////////////////////////////////////

@StateStrategyType(AddToEndSingleStrategy::class)
interface SplashView : BaseLoadingView {
    fun goToMainScreen()
}


///////////////////////////////////////////////////////////////////////////
// Splash Presenter
///////////////////////////////////////////////////////////////////////////

@InjectViewState
class SplashPresenter : BaseRxPresenter<Unit, SplashView>(){

    val usecases: UserUsecases = TaximerApp.appComponent.baseUsecases()

    fun openApp(hash: String){
        usecases.openApp(hash).subscribe(this)
    }

    fun askGeoposition() {
        usecases.askGeoposition()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe ({
                    Prefs.storeGeo(LatLng(it.position.lat, it.position.lon))
                    viewState.goToMainScreen()
                }, {
                    viewState.showError("")
                })
    }

    override fun onNext(t: Unit?) {
        //nope
    }

    override fun onComplete() {
        viewState?.hideLoading()
        viewState?.goToMainScreen()
    }
}