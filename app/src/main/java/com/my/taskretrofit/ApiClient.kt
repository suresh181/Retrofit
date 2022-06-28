package com.my.taskretrofit

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.json.JSONObject
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import java.util.concurrent.TimeUnit

class ApiClient {
    private lateinit var apiService:APIInterface



    fun getClient(): APIInterface {

        val clientSetup = OkHttpClient.Builder()
            .connectTimeout(1, TimeUnit.MINUTES)
            .writeTimeout(1, TimeUnit.MINUTES)
            .readTimeout(1, TimeUnit.MINUTES)
            .build()

        if (!::apiService.isInitialized){
            val retrofit = Retrofit.Builder()
                .baseUrl("https://portal.blinkmobility.net/v5/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(clientSetup)
                .build()

            apiService = retrofit.create(APIInterface::class.java)
        }

        return apiService
    }

}