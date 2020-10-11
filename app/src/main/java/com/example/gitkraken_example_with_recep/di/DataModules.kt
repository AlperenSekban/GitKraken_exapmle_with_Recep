package com.example.gitkraken_example_with_recep.di

import android.app.Application
import android.content.Context
import com.example.gitkraken_example_with_recep.data.apiServices.ApiServices
import com.example.gitkraken_example_with_recep.data.apiServices.ApiServicesImp
import com.example.gitkraken_example_with_recep.data.apiServices.RetrofitClient
import com.example.gitkraken_example_with_recep.data.categoryServices.CategoryServices
import com.example.gitkraken_example_with_recep.data.categoryServices.CategoryServicesImp
import com.example.gitkraken_example_with_recep.data.commandServices.CommandServices
import com.example.gitkraken_example_with_recep.data.commandServices.CommandServicesImp
import com.example.gitkraken_example_with_recep.ui.base.BasePresenter
import com.example.gitkraken_example_with_recep.ui.base.MvpView
import com.example.gitkraken_example_with_recep.ui.category.CategoryFragmentMvpPresenter
import com.example.gitkraken_example_with_recep.ui.category.CategoryFragmentPresenter
import com.example.gitkraken_example_with_recep.ui.category.CategoryfragmentMvpView
import com.example.gitkraken_example_with_recep.ui.commandlist.CommandListFragmentPresenter
import com.example.gitkraken_example_with_recep.ui.commandlist.CommandListMvpPresenter
import com.example.gitkraken_example_with_recep.ui.commandlist.CommandListMvpView
import com.example.gitkraken_example_with_recep.ui.splashScreen.SplashScreenMvpPresenter
import com.example.gitkraken_example_with_recep.ui.splashScreen.SplashScreenMvpView
import com.example.gitkraken_example_with_recep.ui.splashScreen.SplashScreenPresenter
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataModules(app: Application) {
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
    fun provideApiServices(
        categoryServices: CategoryServices,
        commandServices: CommandServices
    ): ApiServices {
        return ApiServicesImp(categoryServices, commandServices)
    }

    @Singleton
    @Provides
    fun provideCommadServices(retrofitClient: RetrofitClient): CommandServices {
        return CommandServicesImp(retrofitClient)
    }

    @Singleton
    @Provides
    fun provideRetrofitClient(): RetrofitClient {
        return RetrofitClient()
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

    @Singleton
    @Provides
    fun provideCommandPresenter(apiServices: ApiServices): CommandListMvpPresenter<CommandListMvpView> {
        return CommandListFragmentPresenter(apiServices)
    }

    @Singleton
    @Provides
    fun provideCategoryPresenter(apiServices: ApiServices): CategoryFragmentMvpPresenter<CategoryfragmentMvpView> {
        return CategoryFragmentPresenter(apiServices)
    }

    @Singleton
    @Provides
    fun provideSlpashScreenPresenter(apiServices: ApiServices): SplashScreenMvpPresenter<SplashScreenMvpView> {
        return SplashScreenPresenter(apiServices)
    }
}