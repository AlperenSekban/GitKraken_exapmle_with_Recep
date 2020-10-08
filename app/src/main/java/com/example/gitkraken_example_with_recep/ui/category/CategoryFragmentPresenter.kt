package com.example.gitkraken_example_with_recep.ui.category

import android.content.Context
import com.example.gitkraken_example_with_recep.data.ServiceCallback
import com.example.gitkraken_example_with_recep.data.apiServices.ApiServices
import com.example.gitkraken_example_with_recep.data.models.CategoriesModel
import com.example.gitkraken_example_with_recep.ui.base.BasePresenter
import javax.inject.Inject

class CategoryFragmentPresenter<V : CategoryfragmentMvpView>
@Inject
constructor(apiServices: ApiServices) : BasePresenter<V>(apiServices),
    CategoryFragmentMvpPresenter<V> {
    var categoryList: List<CategoriesModel> = ArrayList()
    override fun initPresenter() {
        getCategories()
    }

    override fun getCategories() {
        mvpView.showLoading()
        apiServices.getCategories(object :ServiceCallback<List<CategoriesModel>>{
            override fun onSuccess(response: List<CategoriesModel>?) {
                categoryList = response!!
                mvpView.loadDataCategoryList(categoryList)
                mvpView.hideLoading()            }

            override fun onError(errorCode: Int, errorMessage: String) {
                mvpView.showText(errorMessage)
            }


        })

    }

    override fun setCommandListFragment(position: Int, requireContext: Context) {
        TODO("Not yet implemented")
    }

}