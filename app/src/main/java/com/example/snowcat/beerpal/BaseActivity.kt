package com.example.snowcat.beerpal

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.WindowManager

/**
 * Created by snowcat on 10.11.2017.
 */
abstract class BaseActivity : AppCompatActivity() {


    abstract fun init(savedInstanceState: Bundle?)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if(!BuildConfig.DEBUG){
            window.setFlags(WindowManager.LayoutParams.FLAG_SECURE,
                    WindowManager.LayoutParams.FLAG_SECURE)
        }

        setContentView(layoutId())
        init(savedInstanceState)

    }

    abstract fun layoutId(): Int
}