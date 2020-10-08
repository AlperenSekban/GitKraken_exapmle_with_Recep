package com.example.gitkraken_example_with_recep.data.categoryServices

import com.example.gitkraken_example_with_recep.data.ServiceCallback
import com.example.gitkraken_example_with_recep.data.apiServices.RestApi
import com.example.gitkraken_example_with_recep.data.apiServices.RetrofitClient
import com.example.gitkraken_example_with_recep.data.models.CategoriesModel
import retrofit2.Call
import retrofit2.Response
import javax.inject.Inject

class CategoryServicesImp : CategoryServices {
    var apiServices: RestApi

    @Inject
    constructor(retrofitClient: RetrofitClient) {
        apiServices = retrofitClient.getClient().create(RestApi::class.java)

    }


    override fun getCategories(serviceCallback: ServiceCallback<List<CategoriesModel>>) {
        var call = apiServices.bring()

        call.enqueue(object : retrofit2.Callback<List<CategoriesModel>> {
            override fun onFailure(call: Call<List<CategoriesModel>>, t: Throwable) {
                serviceCallback.onError(500, t.message.toString())
            }

            override fun onResponse(
                call: Call<List<CategoriesModel>>,
                response: Response<List<CategoriesModel>>
            ) {
                serviceCallback.onSuccess(response.body())
            }


        })


    }


}