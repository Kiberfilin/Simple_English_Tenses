package ru.cyber_eagle_owl.tenses_table.di

import dagger.Component
import ru.cyber_eagle_owl.core_api.di.FragmentScope
import ru.cyber_eagle_owl.core_api.providers.ProvidersFacade
import ru.cyber_eagle_owl.tenses_table.TensesTableFragment

@FragmentScope
@Component(
    modules = [TensesTableModule::class],
    dependencies = [ProvidersFacade::class]
)
interface TensesTableComponent {
    companion object {
        fun create(providersFacade: ProvidersFacade): TensesTableComponent {
            return DaggerTensesTableComponent.builder()
                .providersFacade(providersFacade)
                .build()
        }
    }
    fun inject(TensesTableFragment: TensesTableFragment)
}