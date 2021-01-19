package ru.cyber_eagle_owl.simpleenglish.di

import android.app.Application
import dagger.Component
import ru.cyber_eagle_owl.core.CoreProvidersFactory
import ru.cyber_eagle_owl.core_api.di.ApplicationScope
import ru.cyber_eagle_owl.core_api.providers.AppProvider
import ru.cyber_eagle_owl.core_api.providers.ProvidersFacade
import ru.cyber_eagle_owl.core_api.providers.UseCasesProvider
import ru.cyber_eagle_owl.core_api.providers.UtilsProvidersFacade
import ru.cyber_eagle_owl.simpleenglish.App

@ApplicationScope
@Component(
    dependencies = [AppProvider::class, UtilsProvidersFacade::class, UseCasesProvider::class],
    modules = [MediatorsBindings::class]
)
interface FacadeComponent : ProvidersFacade {
    companion object {
        fun init(application: Application): FacadeComponent =
            DaggerFacadeComponent.builder()
                .appProvider(AppComponent.create(application))
                .utilsProvidersFacade(
                    CoreProvidersFactory.createUtilsProvider(
                        AppComponent.create(
                            application
                        )
                    )
                )
                .useCasesProvider(
                    CoreProvidersFactory.createUseCasesProvider(
                        AppComponent.create(
                            application
                        )
                    )
                )
                .build()
    }

    fun inject(app: App)
}