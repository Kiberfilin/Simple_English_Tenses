package ru.cyber_eagle_owl.core_api.clean.domain.entities.presentation

data class NewsItem(
    var newsId: Long?,
    var newsText: String,
    var newsPicture: String?,
    var newsDate: String,
    var isRepost: Boolean
)
