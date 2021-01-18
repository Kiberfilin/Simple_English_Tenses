package ru.cyber_eagle_owl.core_api.clean.domain.boundaries.presenter.outputports

import ru.cyber_eagle_owl.core_api.clean.domain.entities.presentation.NewsItem
@Deprecated("внедрить RxKotlin")
interface GetNewsOutputPort {
    fun onNewsHasGotten(newsToShow: List<NewsItem>)
}