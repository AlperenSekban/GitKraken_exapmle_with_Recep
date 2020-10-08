package com.example.gitkraken_example_with_recep

import android.app.Application
import com.example.gitkraken_example_with_recep.di.ViewComponents
import com.example.terminalcommand_dagger2.di.DaggerViewComponents
import com.example.terminalcommand_dagger2.di.DataModules
import com.example.terminalcommand_dagger2.di.ViewComponents

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