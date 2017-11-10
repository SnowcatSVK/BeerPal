package com.example.snowcat.beerpal.di

import com.example.snowcat.beerpal.App
import com.example.snowcat.beerpal.BaseApiModule
import com.example.snowcat.beerpal.MainActivity
import dagger.Component
import javax.inject.Singleton

/**
 * Created by snowcat on 10.11.2017.
 */
@Singleton
@Component(modules = arrayOf(BaseApiModule::class))
interface AppComponent {

    fun inject(application: App)
    fun inject(mainActivity: MainActivity)
}