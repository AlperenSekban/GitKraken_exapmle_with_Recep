package com.example.gitkraken_example_with_recep.data.apiServices

import com.example.gitkraken_example_with_recep.data.models.CategoriesModel
import retrofit2.Call
import retrofit2.http.GET

interface RestApi {

    @GET("/api/categories?language=TR")
    fun bring(): Call<List<CategoriesModel>>
}