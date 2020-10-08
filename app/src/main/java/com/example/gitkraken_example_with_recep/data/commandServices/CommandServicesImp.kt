package com.example.gitkraken_example_with_recep.data.commandServices

import com.example.gitkraken_example_with_recep.data.ServiceCallback
import com.example.gitkraken_example_with_recep.data.apiServices.RestApi
import com.example.gitkraken_example_with_recep.data.apiServices.RetrofitClient
import com.example.gitkraken_example_with_recep.data.models.CommandModel
import retrofit2.Call
import retrofit2.Response
import javax.inject.Inject

 class CommandServicesImp :CommandServices {
    var apiServices: RestApi
    @Inject
    constructor(retrofitClient: RetrofitClient) {
        apiServices=retrofitClient.getClient().create(RestApi::class.java)
    }

     override fun getCommandsOfCategories(
         categoryid: String,
         serviceCallback: ServiceCallback<List<CommandModel>>
     ) {
         var call =apiServices.getCategoryInfo(categoryid)

         call.enqueue(object : retrofit2.Callback<List<CommandModel>>{
             override fun onResponse(
                 call: Call<List<CommandModel>>,
                 response: Response<List<CommandModel>>
             ) {
                 serviceCallback.onSuccess(response.body())
             }

             override fun onFailure(call: Call<List<CommandModel>>, t: Throwable) {
                 serviceCallback.onError(500,t.message.toString())
             }

         })
     }


 }