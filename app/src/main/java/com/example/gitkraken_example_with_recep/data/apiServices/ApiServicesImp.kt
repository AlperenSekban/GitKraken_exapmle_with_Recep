package com.example.gitkraken_example_with_recep.data.apiServices

import com.example.gitkraken_example_with_recep.data.categoryServices.CategoryServices
import com.example.gitkraken_example_with_recep.data.ServiceCallback
import com.example.gitkraken_example_with_recep.data.models.CategoriesModel
import javax.inject.Inject

class ApiServicesImp : ApiServices {
    var categoryServices: CategoryServices

    @Inject
    constructor(categoryServices: CategoryServices) {
        this.categoryServices = categoryServices
    }

    override fun getCategories(serviceCallback: ServiceCallback<List<CategoriesModel>>) {
        categoryServices.getCategories(serviceCallback)
    }

}