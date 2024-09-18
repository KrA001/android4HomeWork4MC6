package com.example.android4homework4mc6.di

import com.example.android4homework4mc6.data.remote.RetrofitClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object NetworkModule {

    @Singleton
    @Provides
    fun provideRetrofitClient() = RetrofitClient()

    @Singleton
    @Provides
    fun provideVideoCategory(retrofitClient: RetrofitClient) = retrofitClient.provideVideoCategoryApiService()

    @Singleton
    @Provides
    fun provideVideos(retrofitClient: RetrofitClient) = retrofitClient.provideVideoApiService()
}