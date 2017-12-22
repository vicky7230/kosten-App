package com.vicky7230.kosten.ui.home

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import com.vicky7230.kosten.data.DataManager
import io.reactivex.disposables.CompositeDisposable

/**
 * Created by vicky on 21/12/17.
 */

class HomeActivityViewModel(application: Application, private val dataManager: DataManager, private val compositeDisposable: CompositeDisposable) : AndroidViewModel(application) {


}
