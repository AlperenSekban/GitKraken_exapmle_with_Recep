package com.example.gitkraken_example_with_recep.data

import com.example.gitkraken_example_with_recep.data.apiServices.RestApi
import com.example.gitkraken_example_with_recep.data.apiServices.RetrofitClient
import com.example.gitkraken_example_with_recep.data.models.CategoriesModel
import javax.inject.Inject

class CategoryServicesImp:CategoryServices{
    var apiServices:RestApi
    @Inject
    constructor(retrofitClient: RetrofitClient){
        

    }



    override fun getCategories(serviceCallback: ServiceCallback<List<CategoriesModel>>) {
        TODO("Not yet implemented")
    }


}