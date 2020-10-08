package com.example.gitkraken_example_with_recep.di

import android.app.Application
import android.content.Context
import com.example.gitkraken_example_with_recep.data.apiServices.ApiServices
import com.example.gitkraken_example_with_recep.data.apiServices.ApiServicesImp
import com.example.gitkraken_example_with_recep.data.apiServices.RetrofitClient
import com.example.gitkraken_example_with_recep.data.categoryServices.CategoryServices
import com.example.gitkraken_example_with_recep.data.categoryServices.CategoryServicesImp
import com.example.gitkraken_example_with_recep.ui.base.BasePresenter
import com.example.gitkraken_example_with_recep.ui.base.MvpView
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataModule(app: Application) {
    private val context: Context

    init {
        this.context = app
    }

    @Singleton
    @Provides
    fun provideContext(): Context {
        return context
    }

    @Singleton
    @Provides
    fun provideBasePresenter(apiServices: ApiServices): BasePresenter<MvpView> {
        return BasePresenter(apiServices)
    }

    @Singleton
    @Provides
    fun provideCategoryServices(retrofitClient: RetrofitClient): CategoryServices {
        return CategoryServicesImp(retrofitClient)
        
    }


}