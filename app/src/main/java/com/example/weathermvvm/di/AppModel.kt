package com.example.weathermvvm.di

import com.example.weathermvvm.database.LocalDataSource
import com.example.weathermvvm.network.NetworkDataSource
import com.example.weathermvvm.ui.ViewModelManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewComponent
import javax.inject.Singleton

@Module
@InstallIn(ViewComponent::class)
object AppModel {
    @Provides
    @Singleton
    fun provideWeatherManager(
        networkDataSource: NetworkDataSource,
        localDataSource: LocalDataSource,
    ): ViewModelManager {
        return ViewModelManager(networkDataSource,localDataSource)
    }
}