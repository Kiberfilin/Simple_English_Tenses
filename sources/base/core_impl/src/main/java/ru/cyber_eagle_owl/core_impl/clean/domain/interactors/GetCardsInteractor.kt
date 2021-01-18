package ru.cyber_eagle_owl.core_impl.clean.domain.interactors

import io.reactivex.Single
import ru.cyber_eagle_owl.core_api.clean.domain.boundaries.presenter.inputports.GetCardsInputPort
import ru.cyber_eagle_owl.core_api.clean.domain.entities.presentation.CardItem
import ru.cyber_eagle_owl.core_api.clean.domain.boundaries.presenter.outputports.GetCardsOutputPort
import ru.cyber_eagle_owl.core_api.clean.domain.boundaries.repository.inputports.CardsRepositoryInputPort
import ru.cyber_eagle_owl.core_api.clean.domain.boundaries.repository.outputports.CardsRepositoryOutputPort
import timber.log.Timber
import javax.inject.Inject

class GetCardsInteractor @Inject constructor(
    private val dataInputPort: CardsRepositoryInputPort
) : GetCardsInputPort {
    override fun execute(): Single<List<CardItem>> {
        Timber.d("execute()")
        return dataInputPort.getCards()
    }
}