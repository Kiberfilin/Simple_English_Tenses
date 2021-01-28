package ru.cyber_eagle_owl.tenses_table.di

import dagger.Binds
import dagger.Module
import ru.cyber_eagle_owl.core_api.di.FragmentScope
import ru.cyber_eagle_owl.tenses_table.viper.TensesTableViperContract.*
import ru.cyber_eagle_owl.tenses_table.viper.presentation.*

@Module
abstract class TensesTableModule {
    @Binds
    @FragmentScope
    abstract fun TensesTableView(TensesTableViewImpl: TensesTableViewImpl): TensesTableView

    @Binds
    @FragmentScope
    abstract fun TensesTablePresenter(TensesTablePresenterImpl: TensesTablePresenterImpl): TensesTablePresenter

    @Binds
    @FragmentScope
    abstract fun TensesTableRouter(TensesTableRouterImpl: TensesTableRouterImpl): TensesTableRouter
}
