package ru.cyber_eagle_owl.core

import ru.cyber_eagle_owl.core_api.providers.AppProvider
import ru.cyber_eagle_owl.core_api.providers.UseCasesProvider
import ru.cyber_eagle_owl.core_api.providers.UtilsProvidersFacade
import ru.cyber_eagle_owl.core_impl.di.DaggerCleanComponent
import ru.cyber_eagle_owl.core_impl.di.DaggerUtilsComponent
import ru.cyber_eagle_owl.core_impl.di.UtilsModule

object CoreProvidersFactory {
    fun createUtilsProvider(appProvider: AppProvider): UtilsProvidersFacade {
        return DaggerUtilsComponent.builder()
            .appProvider(appProvider)
            .utilsModule(UtilsModule())
            .build()
    }

    fun createUseCasesProvider(appProvider: AppProvider): UseCasesProvider {
        return DaggerCleanComponent.builder()
            .utilsProvidersFacade(createUtilsProvider(appProvider))
            .build()
    }
}