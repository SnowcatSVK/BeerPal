package com.example.snowcat.beerpal

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hannesdorfmann.mosby3.mvi.MviFragment
import com.hannesdorfmann.mosby3.mvp.MvpView

/**
 * Created by snowcat on 10.11.2017.
 */
abstract class BaseFragment<V : MvpView, P : BasePresenter<V, *>> : MviFragment<V, P>() {

    abstract fun init(savedInstanceState: Bundle?)

    abstract fun injectArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        injectArgs()
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(layoutId(), container, false);
    }

    abstract fun layoutId(): Int


}