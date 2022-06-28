package com.my.taskretrofit

import android.app.DownloadManager
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.*

interface APIInterface {

//    @POST("user/activity")
//    fun doList(@Header("Auth") token: String): Call<Response1?>?


    @POST("user/activity")
    fun getHistory(@Header("Auth") token: String): Call<ResponseBody?>?









}