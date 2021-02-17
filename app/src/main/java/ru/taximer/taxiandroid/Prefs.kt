package ru.taximer.taxiandroid

import com.google.android.gms.maps.model.LatLng
import com.orhanobut.hawk.Hawk

object Prefs {
    private val GEO_LAT = "geo_lat"
    private val GEO_LON = "geo_lon"
    private val TOKEN = "token"

    private val NOTIFICATION = "notification"

    private val CAR_CLASS = "car_class"
    private val IS_CHILD = "is_child"
    private val CARD_PAY = "card_pay"
    private val CASH_PAY = "cash_pay"

    private val USR_STATUS = "geo_lat"
    private val USR_PHONE = "geo_lon"

    fun storeGeo(geo: LatLng) {
        Hawk.put(GEO_LAT, geo.latitude)
        Hawk.put(GEO_LON, geo.longitude)
    }

    fun readGeo(): LatLng {
        return LatLng(Hawk.get(GEO_LAT, 0.0), Hawk.get(GEO_LON, 0.0))
    }

    fun storeAuth(status: Int, phone: Long) {
        Hawk.put(USR_STATUS, status)
        Hawk.put(USR_PHONE, phone)
    }

    fun getAuth() {
        val get:Int = Hawk.get(USR_STATUS)
        if (get == 1) {
            return Hawk.get(USR_PHONE)
        }
    }

    fun storeToken(token: String) = Hawk.put(TOKEN, token)
    fun getToken() = Hawk.get(TOKEN, "")!!

    fun isNotification() = Hawk.get(NOTIFICATION, false)
    fun setNotification(isNotification: Boolean) = Hawk.put(NOTIFICATION, isNotification)

    fun storeCarClass(car: Int) = Hawk.put(CAR_CLASS, car)
    fun getCarClass() = Hawk.get(CAR_CLASS, 1)

    fun setIsChild(value: Boolean) = Hawk.put(IS_CHILD, value)
    fun isChild() = Hawk.get(IS_CHILD, false)

    fun setIsCard(value: Boolean) = Hawk.put(CARD_PAY, value)
    fun isCard() = Hawk.get(CARD_PAY, false)

    fun setIsCash(value: Boolean) = Hawk.put(CASH_PAY, value)
    fun isCash() = Hawk.get(CASH_PAY, false)

    fun clearSettings(){
        storeCarClass(1)
        setIsCash(false)
        setIsCard(false)
        setIsChild(false)
    }
}
