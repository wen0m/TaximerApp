package ru.taximer.taxiandroid


import android.content.Context
import android.support.multidex.MultiDex
import android.support.multidex.MultiDexApplication
import com.crashlytics.android.Crashlytics
import com.crashlytics.android.answers.Answers
import com.flurry.android.FlurryAgent
import com.my.tracker.MyTracker
import com.orhanobut.hawk.Hawk
import com.treebo.internetavailabilitychecker.InternetAvailabilityChecker
import io.branch.referral.Branch
import io.fabric.sdk.android.Fabric
import ru.taximer.taxiandroid.di.AppModule
import ru.taximer.taxiandroid.di.DaggerTaxiAppComponent
import ru.taximer.taxiandroid.di.TaxiAppComponent
import ru.taximer.taxiandroid.network.Config
import kotlin.system.measureTimeMillis


class TaximerApp : MultiDexApplication() {

    companion object {
        private lateinit var _appModule: AppModule
        val appModule: AppModule
            get() = _appModule

        private val _appComponent: TaxiAppComponent by lazy {
            DaggerTaxiAppComponent.builder()
                    .appModule(appModule)
                    .build()
        }

        @JvmStatic
        val appComponent: TaxiAppComponent
            get() = _appComponent
    }

    override fun onCreate() {
        super.onCreate()
        initDagger()
        Hawk.init(this).build()
        InternetAvailabilityChecker.init(this)
        Fabric.with(this, Answers(), Crashlytics())
        FlurryAgent.Builder().withLogEnabled(true).build(this, "H675QDXTZZ9QM6FRB97T")
        MyTracker.createTracker("43752907061967474918", this)
        MyTracker.initTracker()
        Branch.getAutoInstance(this)
    }

    override fun attachBaseContext(context: Context) {
        super.attachBaseContext(context)
        MultiDex.install(this)
    }

    override fun onLowMemory() {
        super.onLowMemory()
        InternetAvailabilityChecker.getInstance().removeAllInternetConnectivityChangeListeners()
    }

    private fun initDagger() {
        measureTimeMillis {
            _appModule = AppModule(this, Config.DEV_URL)
        }
    }
}
