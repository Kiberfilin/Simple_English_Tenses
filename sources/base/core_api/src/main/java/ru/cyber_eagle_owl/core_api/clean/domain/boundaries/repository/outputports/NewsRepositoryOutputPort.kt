package ru.cyber_eagle_owl.core_api.clean.domain.boundaries.repository.outputports

import ru.cyber_eagle_owl.core_api.clean.domain.entities.presentation.NewsItem

@Deprecated("Заменить на RxKotlin")
interface NewsRepositoryOutputPort {
    fun onNewsHasGotten(news: List<NewsItem>)
}