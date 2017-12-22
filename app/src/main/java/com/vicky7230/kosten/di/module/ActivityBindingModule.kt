package com.vicky7230.kosten.di.module

import com.vicky7230.kosten.ui.home.HomeActivity
import com.vicky7230.kosten.ui.home.HomeActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by vicky on 21/12/17.
 */
@Module
abstract class ActivityBindingModule {

    @ContributesAndroidInjector(modules = [HomeActivityModule::class])
    abstract fun bindHomeActivity(): HomeActivity
}