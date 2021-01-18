package ru.cyber_eagle_owl.core_api.clean.domain.boundaries.presenter.inputports

import io.reactivex.Single
import ru.cyber_eagle_owl.core_api.clean.domain.entities.presentation.CardItem

interface GetCardsInputPort {
    fun execute(): Single<List<CardItem>>
}