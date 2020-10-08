package com.example.gitkraken_example_with_recep.ui.base

interface MvpPresenter<V:MvpView> {
    fun onAttact(mvpView: V)
    fun initPresenter()
}