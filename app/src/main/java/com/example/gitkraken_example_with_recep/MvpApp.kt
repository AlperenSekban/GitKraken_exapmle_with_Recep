package com.example.gitkraken_example_with_recep

import android.app.Application
import com.example.gitkraken_example_with_recep.di.DaggerViewComponents
import com.example.gitkraken_example_with_recep.di.DataModules
import com.example.gitkraken_example_with_recep.di.ViewComponents

//Alperen Sekban
class MvpApp : Application() {

    var viewComponents: ViewComponents? = null

    override fun onCreate() {
        super.onCreate()
        viewComponents = DaggerViewComponents
            .builder().dataModules(
                DataModules(
                    this
                )
            ).build()

    }
}