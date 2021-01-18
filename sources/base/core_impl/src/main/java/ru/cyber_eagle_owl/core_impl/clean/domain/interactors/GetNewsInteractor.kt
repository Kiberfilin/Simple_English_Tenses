package ru.cyber_eagle_owl.core_impl.clean.domain.interactors

import io.reactivex.Single
import ru.cyber_eagle_owl.core_api.clean.domain.boundaries.presenter.inputports.GetNewsInputPort
import ru.cyber_eagle_owl.core_api.clean.domain.entities.presentation.NewsItem
import ru.cyber_eagle_owl.core_api.clean.domain.boundaries.presenter.outputports.GetNewsOutputPort
import ru.cyber_eagle_owl.core_api.clean.domain.boundaries.repository.outputports.NewsRepositoryOutputPort
import ru.cyber_eagle_owl.core_api.clean.domain.boundaries.repository.inputports.*
import ru.cyber_eagle_owl.core_api.constants.VkConstants

import timber.log.Timber
import javax.inject.Inject

class GetNewsInteractor @Inject constructor(
    private val dataInputPort: NewsRepositoryInputPort
) : GetNewsInputPort {
    override fun execute(): Single<List<NewsItem>> {
        Timber.d("execute()")
        return dataInputPort.getNews()
            .map { news ->
                news.filterNot { it.isRepost }
            }
    }
}