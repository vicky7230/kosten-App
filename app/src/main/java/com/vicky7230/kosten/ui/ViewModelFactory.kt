package com.vicky7230.kosten.ui

/**
 * Created by vicky on 21/12/17.
 */


import android.annotation.SuppressLint
import android.app.Application
import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import android.support.annotation.VisibleForTesting

import com.vicky7230.kosten.data.DataManager
import com.vicky7230.kosten.ui.home.HomeActivityViewModel

import io.reactivex.disposables.CompositeDisposable

/**
 * A creator is used to inject dependencies into the ViewModel
 */
class ViewModelFactory private constructor(
        private val application: Application,
        private val dataManager: DataManager,
        private val compositeDisposable: CompositeDisposable
) : ViewModelProvider.NewInstanceFactory() {

    companion object {

        @SuppressLint("StaticFieldLeak")
        @Volatile private var INSTANCE: ViewModelFactory? = null

        fun getInstance(application: Application, dataManager: DataManager, compositeDisposable: CompositeDisposable) =
                INSTANCE ?: synchronized(ViewModelFactory::class.java) {
                    INSTANCE ?: ViewModelFactory(application, dataManager, compositeDisposable)
                            .also { INSTANCE = it }
                }

        @VisibleForTesting
        fun destroyInstance() {
            INSTANCE = null
        }
    }

    override fun <T : ViewModel> create(modelClass: Class<T>) =
            with(modelClass) {
                when {
                    isAssignableFrom(HomeActivityViewModel::class.java) ->
                        HomeActivityViewModel(application, dataManager, compositeDisposable)
                    else ->
                        throw IllegalArgumentException("Unknown ViewModel class: ${modelClass.name}")
                }
            } as T
}
