package ru.taximer.taxiandroid.network

import okhttp3.HttpUrl
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

class CustomInterceptor: Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {

        val request: Request = chain.request()

        val newUrl: HttpUrl?
        newUrl = when {
//            host != "" -> request.url().newBuilder()
//                    .host(host)
//                    .build()
            else -> request.url().newBuilder()
                    .build()
        }

        return chain.proceed(request.newBuilder().url(newUrl).build())
    }
}