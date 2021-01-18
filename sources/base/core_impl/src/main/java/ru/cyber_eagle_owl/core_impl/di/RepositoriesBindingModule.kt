package ru.cyber_eagle_owl.core_impl.di

import dagger.Binds
import dagger.Module
import dagger.Reusable
import ru.cyber_eagle_owl.core_api.clean.domain.boundaries.repository.inputports.*
import ru.cyber_eagle_owl.core_impl.clean.data.repositories.*

@Module
interface RepositoriesBindingModule {
    @Binds
    @Reusable
    fun provideVkAuthorizationRepositoryInputPort(vkAuthorizationRepository: VkAuthorizationRepository): AuthorizationRepositoryInputPort

    @Binds
    @Reusable
    fun providePlacesRepositoryInputPort(placesRepository: PlacesRepository): PlacesRepositoryInputPort

    @Binds
    @Reusable
    fun provideNewsRepositoryInputPort(newsRepository: NewsRepository): NewsRepositoryInputPort

    @Binds
    @Reusable
    fun provideCardsRepositoryInputPort(cardsRepository: CardsRepository): CardsRepositoryInputPort
}
