package ru.cyber_eagle_owl.core_api.clean.domain.boundaries.presenter.inputports

import io.reactivex.Single
import ru.cyber_eagle_owl.core_api.clean.domain.entities.presentation.PlaceItem

interface GetPlacesInputPort {
    fun execute(): Single<ArrayList<PlaceItem>>
}