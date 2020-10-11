package com.example.gitkraken_example_with_recep.ui.commandlist

import com.example.gitkraken_example_with_recep.data.ServiceCallback
import com.example.gitkraken_example_with_recep.data.apiServices.ApiServices
import com.example.gitkraken_example_with_recep.data.models.CommandModel
import com.example.gitkraken_example_with_recep.ui.base.BasePresenter
import com.example.gitkraken_example_with_recep.ui.base.MvpView
import javax.inject.Inject

class CommandListFragmentPresenter<V:CommandListMvpView>
@Inject
constructor(apiServices: ApiServices):BasePresenter<V>(apiServices), CommandListMvpPresenter<V>{
    override fun initPresenter() {
        getCommands(mvpView.takePosition())
    }

    override fun getCommands(position: String) {
        mvpView.showLoading()
        apiServices.getCommandsOfCategories(position,object :ServiceCallback<List<CommandModel>>{
            override fun onSuccess(response: List<CommandModel>?) {
                if (response!=null){
                    mvpView.loadDataToList(response)
                    mvpView.hideLoading()
                }
            }

            override fun onError(errorCode: Int, errorMessage: String) {
                mvpView.hideLoading()
                mvpView.showText(errorMessage)
            }

        })
    }


}