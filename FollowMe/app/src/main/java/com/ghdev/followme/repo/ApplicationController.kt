package com.ghdev.followme.repo

import android.app.Application
import com.kakao.auth.KakaoSDK
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
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

    //private -> 싱글톤 패턴? , 나중에 자동로그인 기능 고려하기
    //인증 방식 더 간단하게 사용하기 위해서 retrofit이랑 okhttp3 같이 사용
    private fun buildNetWork() {
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

        val okHttpClient : OkHttpClient = OkHttpClient().newBuilder().apply{ addInterceptor(httpLoggingInterceptor)
        }.build()

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