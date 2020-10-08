package com.example.gitkraken_example_with_recep.data.apiServices

import com.example.gitkraken_example_with_recep.data.categoryServices.CategoryServices
import com.example.gitkraken_example_with_recep.data.ServiceCallback
import com.example.gitkraken_example_with_recep.data.commandServices.CommandServices
import com.example.gitkraken_example_with_recep.data.models.CategoriesModel
import com.example.gitkraken_example_with_recep.data.models.CommandModel
import javax.inject.Inject

class ApiServicesImp : ApiServices {
    var categoryServices: CategoryServices
    var commandServices: CommandServices

    @Inject
    constructor(categoryServices: CategoryServices, commandServices: CommandServices) {
        this.categoryServices = categoryServices
        this.commandServices =commandServices
    }

    override fun getCategories(serviceCallback: ServiceCallback<List<CategoriesModel>>) {
        categoryServices.getCategories(serviceCallback)
    }

    override fun getCommandsOfCategories(
        categoryid: String,
        serviceCallback: ServiceCallback<List<CommandModel>>
    ) {
        commandServices.getCommandsOfCategories(categoryid,serviceCallback)
    }

}