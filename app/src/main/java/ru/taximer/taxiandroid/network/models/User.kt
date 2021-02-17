package ru.taximer.taxiandroid.network.models

data class User(
    var api_token: String?,
    var id: Int?,
    var auth_status: Int,
    var phone_number: Long

)

data class UserResponse(
        val user: User
)
