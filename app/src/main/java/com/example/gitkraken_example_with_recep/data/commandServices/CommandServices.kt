package com.example.gitkraken_example_with_recep.data.commandServices

import com.example.gitkraken_example_with_recep.data.ServiceCallback
import com.example.gitkraken_example_with_recep.data.models.CommandModel

interface CommandServices {
    fun getCommandsOfCategories(categoryid:String, serviceCallback:ServiceCallback<List<CommandModel>>)
}