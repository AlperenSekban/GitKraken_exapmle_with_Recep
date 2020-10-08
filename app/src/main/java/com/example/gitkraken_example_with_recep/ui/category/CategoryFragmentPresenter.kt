package com.example.gitkraken_example_with_recep.ui.category

import android.content.Context
import com.example.gitkraken_example_with_recep.data.apiServices.ApiServices
import com.example.gitkraken_example_with_recep.ui.base.BasePresenter
import javax.inject.Inject

class CategoryFragmentPresenter<V : CategoryfragmentMvpView>
    @Inject
    constructor(apiServices: ApiServices) : BasePresenter<V>(apiServices),
    CategoryFragmentMvpPresenter<V>
{
    override fun getCategories() {
        TODO("Not yet implemented")
    }

    override fun setCommandListFragment(position: Int, requireContext: Context) {
        TODO("Not yet implemented")
    }

}