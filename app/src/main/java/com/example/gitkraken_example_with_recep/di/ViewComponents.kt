package com.example.gitkraken_example_with_recep.di

import com.example.gitkraken_example_with_recep.ui.category.CategoryFragment
import com.example.gitkraken_example_with_recep.ui.commandlist.CommandListFragment
import com.example.gitkraken_example_with_recep.ui.splashScreen.SplashScreenFragment

interface ViewComponents {
    fun injectCategoryFragment(categoryFragment: CategoryFragment)
    fun injectCommandListFragment(commandListFragment: CommandListFragment)
    fun injectSplashFragment(splashScreenFragment: SplashScreenFragment)

}