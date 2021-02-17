package ru.taximer.taxiandroid.presenters.base

import com.arellomobile.mvp.MvpPresenter
import org.reactivestreams.Subscriber
import org.reactivestreams.Subscription
import java.net.UnknownHostException


///////////////////////////////////////////////////////////////////////////
// Base Rx Presenter
///////////////////////////////////////////////////////////////////////////

abstract class BaseRxPresenter<Model, View: BaseLoadingView> : MvpPresenter<View>(), Subscriber<Model> {
    override fun onError(t: Throwable?) {
        viewState?.hideLoading()
        t?.let {
            if (it !is UnknownHostException) {
                viewState?.showError(t.localizedMessage ?: "")
            }
            }
    }

    override fun onSubscribe(s: Subscription?) {
        s?.request(Long.MAX_VALUE)
    }
}