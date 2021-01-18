package ru.cyber_eagle_owl.core_impl.di

import dagger.Component
import ru.cyber_eagle_owl.core_api.di.ApplicationScope
import ru.cyber_eagle_owl.core_api.providers.AppProvider
import ru.cyber_eagle_owl.core_api.providers.UtilsProvidersFacade

@ApplicationScope
@Component(
    dependencies = [AppProvider::class],
    modules = [UtilsModule::class]
)
interface UtilsComponent : UtilsProvidersFacade