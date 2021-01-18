package ru.cyber_eagle_owl.core_api.clean.domain.boundaries.repository.outputports

import ru.cyber_eagle_owl.core_api.clean.domain.entities.presentation.CardItem
@Deprecated("Заменить на RxKotlin")
interface CardsRepositoryOutputPort {
    fun onCardsHasGotten(cards: List<CardItem>)
}