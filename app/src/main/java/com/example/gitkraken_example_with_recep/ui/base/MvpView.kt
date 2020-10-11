package com.example.gitkraken_example_with_recep.ui.base

import androidx.fragment.app.Fragment

interface MvpView {
    fun getInstance():Fragment
    fun showLoading()
    fun hideLoading()
    fun showText(string: String)
}