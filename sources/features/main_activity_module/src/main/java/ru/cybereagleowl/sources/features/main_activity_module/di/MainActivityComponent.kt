package ru.cybereagleowl.sources.features.main_activity_module.di

import dagger.Component
import ru.cyber_eagle_owl.core_api.di.ActivityScope
import ru.cyber_eagle_owl.core_api.providers.ProvidersFacade
import ru.cybereagleowl.sources.features.main_activity_module.MainActivity

@ActivityScope
@Component(
    modules = [MainActivityModule::class],
    dependencies = [ProvidersFacade::class]
)
interface MainActivityComponent {
    fun inject(newsActivity: MainActivity)

    companion object {
        fun create(providersFacade: ProvidersFacade): MainActivityComponent =
            DaggerMainActivityComponent.builder()
                .providersFacade(providersFacade)
                .build()
    }
}