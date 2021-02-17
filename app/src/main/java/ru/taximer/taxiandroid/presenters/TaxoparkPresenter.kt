package ru.taximer.taxiandroid.presenters

import android.provider.ContactsContract
import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import ru.taximer.taxiandroid.Prefs
import ru.taximer.taxiandroid.TaximerApp
import ru.taximer.taxiandroid.network.models.PlaceLocationModel
import ru.taximer.taxiandroid.network.models.TaxoparkResultModel
import ru.taximer.taxiandroid.network.usecases.TaxiUsecases
import ru.taximer.taxiandroid.network.usecases.UserUsecases
import ru.taximer.taxiandroid.presenters.base.BaseLoadingView
import ru.taximer.taxiandroid.presenters.base.BaseRxPresenter
import java.util.*
import kotlin.concurrent.schedule
import kotlin.concurrent.scheduleAtFixedRate


///////////////////////////////////////////////////////////////////////////
// Taxopark View
///////////////////////////////////////////////////////////////////////////

@StateStrategyType(AddToEndSingleStrategy::class)
interface TaxoparkView : BaseLoadingView {
    fun setTaxoparkPack(taxoparl: List<Long>, hash: String)
    fun refreshOrderStatus(description: String, orderId: Int)
}


///////////////////////////////////////////////////////////////////////////
// Taxopark Presenter
///////////////////////////////////////////////////////////////////////////

@InjectViewState
class TaxoparkPresenter : BaseRxPresenter<TaxoparkResultModel, TaxoparkView>() {

    val usecases: TaxiUsecases = TaximerApp.appComponent.baseUsecases()
    val usercases: UserUsecases = TaximerApp.appComponent.baseUsecases()

    var searchHash: String = ""

    fun sendAuthCode(code: String, phone: Long) {
        usercases.confirmPhone(code, phone).subscribe()
    }

    fun confirmPhone(code: String) {
        usercases.sendConfirmationCode(code).subscribe()
    }

    fun orderByPhone(taxoparkId: String, request_hash: String) {
        usercases.orderByPhone(taxoparkId, request_hash)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe {
                    if (it.description != null) {
                        viewState.refreshOrderStatus(it.description, it.id)
//                        refreshStatus(it.id)
                    }
        }
    }

    fun refreshStatus(orderId: Int) {

        val timer = Timer("refresh", true)
        timer.scheduleAtFixedRate(0, 10000) {
            refreshStatus(orderId)
        }
    }

    fun cancelOrder(orderId: Int) {
        usercases.cancelOrder(orderId).subscribe()
    }

    fun setPoints(start: PlaceLocationModel, end: PlaceLocationModel){
        viewState.showLoading()
        val carType = if(Prefs.getCarClass() == -1) null else Prefs.getCarClass()
        val isChild = if(Prefs.isChild()) true else null
        val isCard = if(Prefs.isCard()) true else null
        val isCash = if(Prefs.isCash()) true else null
        usecases.getTaxoparcks(start, end, carType, isChild, isCard, isCash, null).subscribe(this)
    }


    override fun onNext(t: TaxoparkResultModel) {
        searchHash = t.request_hash
        viewState.setTaxoparkPack(t.taxoparks.map { it.id }, t.request_hash)
    }

    override fun onComplete() {
        viewState?.hideLoading()
    }

    fun openEvent(taxoparkId: String){
        usecases.sendOpenEvent(searchHash, taxoparkId)
    }

    fun installEvent(taxoparkId: String){
        usecases.sendOpenEvent(searchHash, taxoparkId)
    }
}