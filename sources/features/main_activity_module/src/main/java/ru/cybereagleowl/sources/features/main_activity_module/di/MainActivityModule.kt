package ru.cybereagleowl.sources.features.main_activity_module.di

import dagger.Binds
import dagger.Module
import ru.cybereagleowl.sources.features.main_activity_module.viper.MainActivityViperContract.*
import ru.cyber_eagle_owl.core_api.di.ActivityScope
import ru.cybereagleowl.sources.features.main_activity_module.viper.presentation.*

@Module
abstract class MainActivityModule {
    @Binds
    @ActivityScope
    abstract fun mainActivityView(mainActivityViewImpl: MainActivityViewImpl): MainActivityView

    @Binds
    @ActivityScope
    abstract fun mainActivityPresenter(mainActivityPresenterImpl: MainActivityPresenterImpl): MainActivityPresenter

    @Binds
    @ActivityScope
    abstract fun mainActivityRouter(mainActivityRouterImpl: MainActivityRouterImpl): MainActivityRouter
}