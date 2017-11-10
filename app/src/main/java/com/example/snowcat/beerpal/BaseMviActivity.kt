package com.example.snowcat.beerpal

import android.os.Bundle
import android.view.WindowManager
import com.hannesdorfmann.mosby3.mvi.MviActivity
import com.hannesdorfmann.mosby3.mvp.MvpView

/**
 * Created by snowcat on 10.11.2017.
 */
abstract class BaseMviActivity<V : MvpView, P : BasePresenter<V, *>> : MviActivity<V, P>() {


    abstract fun init(savedInstanceState: Bundle?)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (!BuildConfig.DEBUG) {
            window.setFlags(WindowManager.LayoutParams.FLAG_SECURE,
                    WindowManager.LayoutParams.FLAG_SECURE)
        }

        setContentView(layoutId())
        init(savedInstanceState)

    }

    abstract fun layoutId(): Int
}