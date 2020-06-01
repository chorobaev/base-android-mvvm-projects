package io.aikosoft.base_mvvm_project.di.modules

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import io.aikosoft.base_mvvm_project.base.CommonViewModel
import io.aikosoft.base_mvvm_project.base.ViewModelFactory
import io.aikosoft.base_mvvm_project.ui.main.MainViewModel
import io.jachoteam.taxiappclient.di.util.ViewModelKey

@Module
interface ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(CommonViewModel::class)
    fun bindCommonViewModel(commonViewModel: CommonViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    fun bindMainViewModel(mainViewModel: MainViewModel): ViewModel

    @Binds
    fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}