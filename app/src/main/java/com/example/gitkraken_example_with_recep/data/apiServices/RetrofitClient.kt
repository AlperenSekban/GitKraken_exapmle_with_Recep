package com.example.gitkraken_example_with_recep.data.apiServices

<<<<<<< Updated upstream
import com.example.gitkraken_example_with_recep.connectTimeout
import com.example.gitkraken_example_with_recep.readTimeout
import okhttp3.OkHttpClient

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class RetrofitClient @Inject constructor() {

    private val BaseUrl = "https://terminalcommands.herokuapp.com/"


    fun getClient(): Retrofit {
        val okHttpClient = OkHttpClient.Builder()
            .readTimeout(readTimeout, TimeUnit.SECONDS)
            .connectTimeout(connectTimeout, TimeUnit.SECONDS)
            .build()

        return Retrofit.Builder().baseUrl(BaseUrl).client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
=======
class RetrofitClient {
>>>>>>> Stashed changes
}