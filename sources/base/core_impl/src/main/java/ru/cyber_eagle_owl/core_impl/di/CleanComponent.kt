package ru.cyber_eagle_owl.core_impl.di

import dagger.Component
import ru.cyber_eagle_owl.core_api.di.ApplicationScope
import ru.cyber_eagle_owl.core_api.providers.UseCasesProvider
import ru.cyber_eagle_owl.core_api.providers.UtilsProvidersFacade


@ApplicationScope
@Component(
    dependencies = [UtilsProvidersFacade::class],
    modules = [UseCasesBindingModule::class, RepositoriesBindingModule::class]
)
interface CleanComponent: UseCasesProvider