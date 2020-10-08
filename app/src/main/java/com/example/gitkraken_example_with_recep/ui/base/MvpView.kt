package com.example.gitkraken_example_with_recep.ui.base

interface MvpView {

    fun showLoading()
    fun hideLoading()
    fun showText(string: String)
}