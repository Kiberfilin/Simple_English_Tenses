package ru.cyber_eagle_owl.core_api.clean.domain.boundaries.presenter.outputports

import ru.cyber_eagle_owl.core_api.clean.domain.entities.presentation.CardItem
@Deprecated("внедрить RxKotlin")
interface GetCardsOutputPort {
    fun onCardsHasGotten(cardsToShow: List<CardItem>)
}