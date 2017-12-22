package com.vicky7230.kosten.ui.home

import android.arch.lifecycle.ViewModelProviders
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.vicky7230.kosten.R
import com.vicky7230.kosten.ui.ViewModelFactory
import dagger.android.AndroidInjection
import javax.inject.Inject

class HomeActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private var homeActivityViewModel: HomeActivityViewModel? = null

    companion object {
        fun getStartIntent(context: Context): Intent {
            return Intent(context, HomeActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        homeActivityViewModel = ViewModelProviders.of(this, viewModelFactory).get(HomeActivityViewModel::class.java)
    }
}
