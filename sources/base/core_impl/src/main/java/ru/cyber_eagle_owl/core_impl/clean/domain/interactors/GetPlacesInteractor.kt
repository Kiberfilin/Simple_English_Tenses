package ru.cyber_eagle_owl.core_impl.clean.domain.interactors

import io.reactivex.Single
import ru.cyber_eagle_owl.core_api.clean.domain.boundaries.presenter.inputports.GetPlacesInputPort
import ru.cyber_eagle_owl.core_api.clean.domain.boundaries.repository.inputports.PlacesRepositoryInputPort
import ru.cyber_eagle_owl.core_api.clean.domain.entities.presentation.PlaceItem
import javax.inject.Inject

class GetPlacesInteractor @Inject constructor(
    private var dataInputPort: PlacesRepositoryInputPort
) : GetPlacesInputPort {
    override fun execute(): Single<ArrayList<PlaceItem>> {
        return dataInputPort.getPlaces()
    }
}