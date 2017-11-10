package com.example.snowcat.beerpal

import android.app.Activity
import android.app.Application
import android.content.Context
import android.os.Bundle
import android.support.multidex.MultiDex
import com.example.snowcat.beerpal.di.AppComponent

/**
 * Created by snowcat on 10.11.2017.
 */
class App : Application(), Application.ActivityLifecycleCallbacks {


    companion object {
        lateinit var graph: AppComponent
    }

    private lateinit var activity : Activity


    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

    override fun onCreate() {
        super.onCreate()
        registerActivityLifecycleCallbacks(this)
    }

    override fun onTerminate() {
        super.onTerminate()
        unregisterActivityLifecycleCallbacks(this)
    }

    override fun onActivityPaused(activity: Activity) {

    }

    override fun onActivityResumed(activity: Activity) {
        this.activity = activity
    }

    override fun onActivityStarted(activity: Activity) {

    }

    override fun onActivityDestroyed(activity: Activity) {

    }

    override fun onActivitySaveInstanceState(activity: Activity, p1: Bundle?) {

    }

    override fun onActivityStopped(activity: Activity) {

    }

    override fun onActivityCreated(activity: Activity, p1: Bundle?) {
        this.activity = activity
    }
}