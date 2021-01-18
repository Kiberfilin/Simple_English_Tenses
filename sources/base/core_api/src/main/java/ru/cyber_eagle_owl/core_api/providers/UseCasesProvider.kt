package ru.cyber_eagle_owl.core_api.providers

import ru.cyber_eagle_owl.core_api.clean.domain.boundaries.presenter.inputports.*

interface UseCasesProvider {
    fun provideLogInInputPort(): LogInInputPort
    fun provideGetPlacesInputPort(): GetPlacesInputPort
    fun provideGetNewsInputPort(): GetNewsInputPort
    fun provideGetCardsInputPort(): GetCardsInputPort
    fun provideCheckIsLoggedInInputPort(): CheckIsLoggedInInputPort
}