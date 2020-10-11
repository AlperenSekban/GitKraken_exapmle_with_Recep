package com.example.gitkraken_example_with_recep.ui.splashScreen

import com.example.gitkraken_example_with_recep.ui.base.MvpPresenter

interface SplashScreenMvpPresenter<V:SplashScreenMvpView>:MvpPresenter<V> {
    fun startWaiting()
}