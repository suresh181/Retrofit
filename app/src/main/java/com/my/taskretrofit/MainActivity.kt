package com.my.taskretrofit

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import okhttp3.ResponseBody
import org.json.JSONArray
import org.json.JSONObject
import org.json.JSONTokener
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {
    private lateinit var apiClient: ApiClient
    private val data = ArrayList<ItemViewHistory>()
    private var recyclerView:RecyclerView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        apiClient = ApiClient()
        recyclerView = findViewById(R.id.recyclerview)





        callRestApi()
//        callRestApiWithModel()
//        getCurrent()

    }

    private fun callRestApi(){
        apiClient.getClient().getHistory("eyJ0eXAiOiJqd3QiLCJhbGciOiJIUzI1NiIsImNydCI6IjE2NTEyMjg4NTgifQ==.eyJ1c2VyX2lkIjoiNjIwM2MyODEyNzdhZGY1N2MyMjQ0ZTIyIiwiYWNjZXNzIjoidXNlciIsImxpZmV0aW1lIjoiNDgifQ==.OWUxZjRlYWZkZjdkODc1OTNlYjU0ZDMzYWUwNzY4OTA5NjdjYTA1NzE5N2JjZTFlMjAwMjE5YzEzMjAxN2UzOQ==")?.enqueue(object :Callback<ResponseBody?>{

            override fun onResponse(call: Call<ResponseBody?>, response: Response<ResponseBody?>) {
                val resp = response.body()?.string()
                val obj = JSONObject(resp)
                val status = obj.getString("status")
                    if (status.equals("1")){
                        if (obj.has("content")){
                            val content = obj.getJSONObject("content")
                            if (content.has("response")) {
                                val response = content.getJSONObject("response")
                                if (response.has("history")){
                                  val historyStr = response.getString("history")
                                    val json = JSONTokener(historyStr).nextValue()
                                    if (json is JSONArray){
//                                        val history = JSONArray(json)
                                        for(i in 0 until json.length()){
                                            val historyItem = json.getJSONObject(i)
                                            val id = historyItem.get("rental_id")
                                            val vehicle = historyItem.getJSONObject("vehicle")
                                            val name = vehicle.get("info")
                                            val date = historyItem.get("started_at")
                                            val fareDetails = historyItem.getJSONObject("fare_details")
                                            val time = fareDetails.get("total_time")
                                            val cost = fareDetails.get("total_cost")

                                            data.add(ItemViewHistory( id.toString(),name.toString(),date.toString(),time.toString(),cost.toString()))

                                        }
                                        recyclerView?.layoutManager = LinearLayoutManager(this@MainActivity,LinearLayoutManager.VERTICAL,false)
                                        val adapter = RecyclerViewAdapter(this@MainActivity, data)
                                        recyclerView?.adapter = adapter
                                    }
                                }
                            }
                        }

                    }




            }


            override fun onFailure(call: Call<ResponseBody?>, t: Throwable) {
                call.cancel()
                Toast.makeText(this@MainActivity, "error in Oncreate", Toast.LENGTH_SHORT).show()
                Log.d("TAG",t.message.toString())

            }


        })
    }

//    private fun callRestApiWithModel(){
//        apiClient.getClient().doList("eyJ0eXAiOiJqd3QiLCJhbGciOiJIUzI1NiIsImNydCI6IjE2NTEyMjg4NTgifQ==.eyJ1c2VyX2lkIjoiNjIwM2MyODEyNzdhZGY1N2MyMjQ0ZTIyIiwiYWNjZXNzIjoidXNlciIsImxpZmV0aW1lIjoiNDgifQ==.OWUxZjRlYWZkZjdkODc1OTNlYjU0ZDMzYWUwNzY4OTA5NjdjYTA1NzE5N2JjZTFlMjAwMjE5YzEzMjAxN2UzOQ==")?.enqueue(object :Callback<Response1?>{
//
//            override fun onResponse(call: Call<Response1?>, response: Response<Response1?>) {
//                val gson = Gson()
//                val json = gson.toJson(response.body())
//                val responce = gson.fromJson(json, Response1::class.java)
//                if (responce.message.equals("success")) {
//                    for (i in responce.content?.response?.history!!.indices) {
//                        val name = responce.content.response.history[i]?.vehicle!!.info
//                        val id = responce.content.response.history[i]?.rentalId
//                        val date = responce.content.response.history[i]?.startedAt
//                        val time = responce.content.response.history[i]?.fareDetails!!.totalTime
//                        val cost = responce.content.response.history[i]?.fareDetails!!.totalCost
//
//                        println("------->response "+name)
//                        println("------->response "+id)
//                        println("------->response "+date)
//
//                        data.add(ItemViewHistory(id.toString(),name.toString(),date.toString(),time.toString(),cost.toString()))
//
//                    }
//
//                    recyclerView?.layoutManager = LinearLayoutManager(this@MainActivity,LinearLayoutManager.VERTICAL,false)
//                    val adapter = RecyclerViewAdapter(this@MainActivity, data)
//                    recyclerView?.adapter = adapter
//                }
//            }
//
//
//            override fun onFailure(call: Call<Response1?>, t: Throwable) {
//                call.cancel()
//                Toast.makeText(this@MainActivity, t.message, Toast.LENGTH_SHORT).show()
//                Log.d("TAG",t.message.toString())
//
//            }
//
//        })
//    }





//    private fun getCurrent(){
//
//        apiClient.getClient().getCurrent("eyJ0eXAiOiJqd3QiLCJhbGciOiJIUzI1NiIsImNydCI6IjE2NTEwNTM0NjgifQ==.eyJ1c2VyX2lkIjoiNjEyNWRjMDYzOTE3N2IyYmYxNzVjOGEyIiwiYWNjZXNzIjoidXNlciIsImxpZmV0aW1lIjoiNDgifQ==.MjYzM2NhYWVhNGIwYzMyNGU1NDZhODkzNWRlNzA0M2ExZDk1YmJmZmY0OWQ4MDE0ZWEwMjllYjdiN2I1OTgxYg==")?.enqueue(object :Callback<Content?>{
//            override fun onResponse(call: Call<Content?>, response: Response<Content?>) {
//                val resp = response.body()
////                val response = resp?.response
////                val history: List<HistoryItem?>? = response?.history
////                val historyItem =
////                val historyItem:HistoryItem = HistoryItem()
//                println("----->>> resp "+resp.toString())
//
//                Toast.makeText(this@MainActivity, resp.toString(), Toast.LENGTH_SHORT).show()
//
//
//            }
//
//            override fun onFailure(call: Call<Content?>, t: Throwable) {
//                call.cancel()
//                Toast.makeText(this@MainActivity, "error in Current", Toast.LENGTH_SHORT).show()
//            }
//
//        })
//
////    private fun fetchToken(){
////        sessionManager = SessionManager(this)
////
////        sessionManager.fetchAuthToken()?.let { apiClient.getClient().fetchPosts(it) }?.enqueue(object :Callback<ResponsePojo?>{
////            override fun onResponse(call: Call<ResponsePojo?>, response: Response<ResponsePojo?>) {
////                val statusResponse = response.body()
////
////                if (statusResponse?.responseCode=="200"){
////                    statusResponse.message?.let { sessionManager.saveAuthToken(it) }
////                    Toast.makeText(this@MainActivity, "Success", Toast.LENGTH_SHORT).show()
////                }else
////                Toast.makeText(this@MainActivity, "error" +
////                        "", Toast.LENGTH_SHORT).show()
////
////            }
////
////            override fun onFailure(call: Call<ResponsePojo?>, t: Throwable) {
////                call.cancel()
////                Toast.makeText(this@MainActivity, t.message, Toast.LENGTH_SHORT).show()
////            }
////
////        })
////
////    }
//}
}