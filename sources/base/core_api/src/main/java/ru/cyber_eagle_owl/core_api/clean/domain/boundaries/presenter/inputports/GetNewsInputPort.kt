package ru.cyber_eagle_owl.core_api.clean.domain.boundaries.presenter.inputports

import io.reactivex.Single
import ru.cyber_eagle_owl.core_api.clean.domain.entities.presentation.NewsItem

interface GetNewsInputPort {
    fun execute(): Single<List<NewsItem>>
}