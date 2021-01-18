package ru.cyber_eagle_owl.core_api.clean.domain.boundaries.repository.inputports

import io.reactivex.Single
import ru.cyber_eagle_owl.core_api.clean.domain.entities.presentation.PlaceItem

interface PlacesRepositoryInputPort {
    fun getPlaces(): Single<ArrayList<PlaceItem>>
}