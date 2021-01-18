package ru.cyber_eagle_owl.core_api.clean.domain.boundaries.repository.inputports

import io.reactivex.Single
import ru.cyber_eagle_owl.core_api.clean.domain.entities.presentation.NewsItem

interface NewsRepositoryInputPort {
    fun getNews(): Single<List<NewsItem>>
}