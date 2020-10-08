package com.example.gitkraken_example_with_recep.ui.category

import android.content.Context
import com.example.gitkraken_example_with_recep.ui.base.MvpPresenter

interface CategoryFragmentMvpPresenter<V:CategoryfragmentMvpView>:MvpPresenter<V>{
    fun getCategories()
    fun setCommandListFragment(position: Int, requireContext: Context)
}