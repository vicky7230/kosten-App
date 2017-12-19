package com.vicky7230.kosten.di.component

import com.vicky7230.kosten.KostenApplication
import com.vicky7230.kosten.di.module.ApplicationModule
import com.vicky7230.kosten.di.module.NetworkModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Created by vicky on 19/12/17.
 */
@Singleton
@Component(modules = arrayOf(
        AndroidSupportInjectionModule::class,
        NetworkModule::class,
        ApplicationModule::class,
        ActivityBindingModule::class))
interface ApplicationComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(kostenApplication: KostenApplication): Builder

        fun build(): ApplicationComponent
    }

    fun inject(kostenApplication: KostenApplication)

}