package com.example.gitkraken_example_with_recep.ui.category

import com.example.gitkraken_example_with_recep.data.models.CategoriesModel
import com.example.gitkraken_example_with_recep.ui.base.MvpView

interface CategoryfragmentMvpView : MvpView {
    fun loadDataCategoryList(categorylist: List<CategoriesModel>)
    fun openCommandListFragment(key: String, id: String)
}