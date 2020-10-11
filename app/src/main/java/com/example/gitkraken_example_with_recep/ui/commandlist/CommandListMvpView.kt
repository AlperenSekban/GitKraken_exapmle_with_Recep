package com.example.gitkraken_example_with_recep.ui.commandlist

import com.example.gitkraken_example_with_recep.data.models.CommandModel
import com.example.gitkraken_example_with_recep.ui.base.MvpView

interface CommandListMvpView:MvpView {
    fun loadDataToList(response:List<CommandModel>)
}