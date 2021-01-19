package ru.cyber_eagle_owl.core_impl.di

import dagger.Binds
import dagger.Module
import dagger.Reusable
import ru.cyber_eagle_owl.core_api.clean.domain.boundaries.presenter.inputports.*
import ru.cyber_eagle_owl.core_impl.clean.domain.interactors.*

@Module
interface UseCasesBindingModule {
    /*
    @Binds
    @Reusable
    fun provideLogInInputPort(logInInteractor: LogInInteractor): LogInInputPort

    @Binds
    @Reusable
    fun provideGetPlacesInputPort(getPlacesInteractor: GetPlacesInteractor): GetPlacesInputPort

    @Binds
    @Reusable
    fun provideGetNewsInputPort(getNewsInteractor: GetNewsInteractor): GetNewsInputPort

    @Binds
    @Reusable
    fun provideGetCardsInputPort(getCardsInteractor: GetCardsInteractor): GetCardsInputPort

    @Binds
    @Reusable
    fun provideCheckIsLoggedInInputPort(checkIsLoggedInInteractor: CheckIsLoggedInInteractor): CheckIsLoggedInInputPort
*/
}