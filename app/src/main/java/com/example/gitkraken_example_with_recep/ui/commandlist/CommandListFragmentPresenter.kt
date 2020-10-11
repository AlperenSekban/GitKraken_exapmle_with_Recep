package com.example.gitkraken_example_with_recep.ui.commandlist

import com.example.gitkraken_example_with_recep.data.apiServices.ApiServices
import com.example.gitkraken_example_with_recep.ui.base.BasePresenter
import javax.inject.Inject

class CommandListFragmentPresenter<V:CommandListMvpView>
@Inject
constructor(apiServices: ApiServices):BasePresenter<V>(apiServices), CommandListMvpPresenter<V>{
    override fun initPresenter() {
        
    }
}