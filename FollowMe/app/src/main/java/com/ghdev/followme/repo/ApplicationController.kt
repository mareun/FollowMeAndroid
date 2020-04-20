package com.ghdev.followme.repo

import android.app.Application
import com.kakao.auth.KakaoSDK
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApplicationController : Application() {

    private val baseURL = "http://117.17.196.142:8008"
    lateinit var networkService: NetworkService

    companion object {
        lateinit var instance: ApplicationController
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        buildNetWork()
        KakaoSDK.init(KakaoSDKAdapter())
    }

    fun buildNetWork() {
        val retrofit: Retrofit = Retrofit.Builder().baseUrl(baseURL).addConverterFactory(
            GsonConverterFactory.create()
        ).build()
        networkService = retrofit . create (NetworkService::class.java)
    }

    override fun onTerminate() {
        super.onTerminate()
        //instance = null
    }

    fun getGlobalApplicationContext() : ApplicationController{
        checkNotNull(instance) { "this application does not inherit com.kakao.GlobalApplication" }
        return instance!!
    }
}