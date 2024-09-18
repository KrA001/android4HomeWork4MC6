package com.example.android4homework4mc6.data.remote.interceptors

import okhttp3.Interceptor
import okhttp3.Response

class ApiKeyInterceptor : Interceptor{

    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request()
        val url = request.url.newBuilder().addQueryParameter("key", "AIzaSyC_QCIcJA3WGPtPGyyrOJ_E_DhVgjgnpN4").build()
        request = request.newBuilder().url(url).build()
        return chain.proceed(request)
    }
}
