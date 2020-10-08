package com.example.gitkraken_example_with_recep.ui.base

import com.example.gitkraken_example_with_recep.data.apiServices.ApiServices
import javax.inject.Inject

class BasePresenter<V : MvpView> constructor(apiServices: ApiServices) : MvpPresenter<V> {
    lateinit var mvpView: V
    var apiServices: ApiServices
        @Inject set
    init {
        this.apiServices=apiServices
    }

    override fun onAttact(mvpView: V) {
        this.mvpView=mvpView
    }

    override fun initPresenter() {

    }
}