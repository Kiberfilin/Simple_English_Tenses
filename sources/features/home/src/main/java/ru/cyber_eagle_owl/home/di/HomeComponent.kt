package ru.cyber_eagle_owl.home.di

import dagger.Component
import ru.cyber_eagle_owl.core_api.di.FragmentScope
import ru.cyber_eagle_owl.core_api.providers.ProvidersFacade
import ru.cyber_eagle_owl.home.HomeFragment

@FragmentScope
@Component(
    modules = [HomeModule::class],
    dependencies = [ProvidersFacade::class]
)
interface HomeComponent {
    companion object {
        fun create(providersFacade: ProvidersFacade): HomeComponent {
            return DaggerHomeComponent.builder()
                .providersFacade(providersFacade)
                .build()
        }
    }
    fun inject(homeFragment: HomeFragment)
}