package ru.cyber_eagle_owl.core_api.clean.domain.boundaries.repository.inputports

import io.reactivex.Single
import ru.cyber_eagle_owl.core_api.clean.domain.entities.presentation.CardItem

interface CardsRepositoryInputPort {
    fun getCards(): Single<List<CardItem>>
}