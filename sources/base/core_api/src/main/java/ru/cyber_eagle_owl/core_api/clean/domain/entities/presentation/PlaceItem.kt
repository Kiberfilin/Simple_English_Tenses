package ru.cyber_eagle_owl.core_api.clean.domain.entities.presentation

data class PlaceItem(
    var title: String = "",
    var information: String = "",
    var address: String = "",
    var coordinates: Coordinates
)

data class Coordinates(
    var latitude: Double = 0.0,
    var longitude: Double = 0.0
)
