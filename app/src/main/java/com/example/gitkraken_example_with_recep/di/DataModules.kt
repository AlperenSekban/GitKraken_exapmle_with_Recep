package com.example.gitkraken_example_with_recep.di

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataModule(app:Application) {
    private val context: Context

    init {
        this.context = app
    }
    @Singleton
    @Provides
    fun provideContext(): Context {
        return context
    }

    
}