package com.example.gitkraken_example_with_recep.ui.splashScreen

import com.example.gitkraken_example_with_recep.data.apiServices.ApiServices
import com.example.gitkraken_example_with_recep.splashScreenSleepTime
import com.example.gitkraken_example_with_recep.ui.base.BasePresenter
import com.example.gitkraken_example_with_recep.ui.base.MvpPresenter
import javax.inject.Inject

class SplashScreenPresenter<V : SplashScreenMvpView>
@Inject constructor(apiServices: ApiServices) : BasePresenter<V>(apiServices),
    SplashScreenMvpPresenter<V> {
    override fun initPresenter() {
        startWaiting()

    }

    override fun startWaiting() {
        val thread: Thread = object : Thread() {
            override fun run() {
                try {
                    sleep(splashScreenSleepTime)
                    mvpView.openCategoriesFragment()
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
            }

        }
        thread.start()
    }

}