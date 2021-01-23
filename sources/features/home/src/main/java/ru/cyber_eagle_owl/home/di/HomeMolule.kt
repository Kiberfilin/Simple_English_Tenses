package ru.cyber_eagle_owl.home.di

import dagger.Binds
import dagger.Module
import ru.cyber_eagle_owl.core_api.di.FragmentScope
import ru.cyber_eagle_owl.home.viper.HomeViperContract.*
import ru.cyber_eagle_owl.home.viper.presentation.HomePresenterImpl
import ru.cyber_eagle_owl.home.viper.presentation.HomeViewImpl
import ru.cyber_eagle_owl.home.viper.presentation.HomeRouterImpl

@Module
abstract class HomeMolule {
    @Binds
    @FragmentScope
    abstract fun homeView(homeViewImpl: HomeViewImpl): HomeView

    @Binds
    @FragmentScope
    abstract fun homePresenter(homePresenterImpl: HomePresenterImpl): HomePresenter

    @Binds
    @FragmentScope
    abstract fun homeRouter(homeRouterImpl: HomeRouterImpl): HomeRouter
}
