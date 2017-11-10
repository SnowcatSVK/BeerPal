package com.example.snowcat.beerpal

import com.hannesdorfmann.mosby3.mvi.MviBasePresenter
import com.hannesdorfmann.mosby3.mvp.MvpView

/**
 * Created by snowcat on 10.11.2017.
 */
abstract class BasePresenter<V : MvpView, VS> : MviBasePresenter<V, VS>() {

    override fun attachView(view: V) {
        super.attachView(view)
        inject()
    }

    abstract fun inject()
}