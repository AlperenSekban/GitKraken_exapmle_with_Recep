package com.example.gitkraken_example_with_recep.di

import com.example.gitkraken_example_with_recep.ui.category.CategoryFragment
import com.example.gitkraken_example_with_recep.ui.commandlist.CommandListFragment

interface ViewComponents {
    fun injectCategoryFragment(categoryFragment: CategoryFragment)
    fun injectCommandListFragment(commandListFragment: CommandListFragment)

}