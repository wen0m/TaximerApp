package ru.taximer.taxiandroid.network.models

import org.json.JSONObject

data class TaxoparkModel(
        val id: Long,
        val name: String? = null,
        val name_en: String? = null,
        val about: String? = null,
        val email: String? = null,
        val phone_number: String? = null,
        val img_url: String? = null,
        var taxopark_type: Int
)

data class TaxoparkResultModel(
        val taxoparks: List<TaxoparkModel> = emptyList(),
        val request_hash: String = ""
)

data class GeoResultModel(
        val position: Position
)

data class Position(
        val  id: Int,
        val  lat: Double,
        val  lon: Double,
        val  name_ru: String,
        val  name_en: String
)

data class Order(
      val id: Int,
      val request_hash: String = "",
      val taxopark_id: Int,
      val status: Int,
      val status_text: String,
      val taxopark_price: String,
      val closable: Boolean,
      val description: String? = null,
      val phone: String,
      val driver_phone: String? = null
)

data class OrderResponse(
        val order: Order
)