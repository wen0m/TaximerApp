package ru.taximer.taxiandroid.network.models

import android.location.Address
import org.json.JSONArray
import org.json.JSONObject

data class Result(val addresess: List<Address>, val google_json: JSONObject) {
}