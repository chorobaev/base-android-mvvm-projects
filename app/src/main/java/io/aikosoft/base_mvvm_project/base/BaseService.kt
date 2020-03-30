package io.aikosoft.base_mvvm_project.base

import androidx.lifecycle.LifecycleService
import dagger.android.AndroidInjection

abstract class BaseService : LifecycleService() {

    override fun onCreate() {
        AndroidInjection.inject(this)
        super.onCreate()
    }

}