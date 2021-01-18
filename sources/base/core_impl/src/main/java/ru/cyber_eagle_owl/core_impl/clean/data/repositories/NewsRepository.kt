package ru.cyber_eagle_owl.core_impl.clean.data.repositories

import com.vk.api.sdk.VK
import com.vk.api.sdk.VKApiCallback
import io.reactivex.Single
import ru.cyber_eagle_owl.core_api.clean.domain.boundaries.repository.inputports.NewsRepositoryInputPort
import ru.cyber_eagle_owl.core_api.clean.domain.entities.data.Item
import ru.cyber_eagle_owl.core_api.clean.domain.entities.presentation.NewsItem
import ru.cyber_eagle_owl.core_impl.clean.data.web.NewsRequest
import ru.cyber_eagle_owl.core_impl.mappers.EntityMapper
import timber.log.Timber
import javax.inject.Inject

class NewsRepository @Inject constructor() : NewsRepositoryInputPort {

    override fun getNews(): Single<List<NewsItem>> {
        Timber.d("getNews(): Single<List<NewsItem>>")

        return Single.create { emitter ->
            VK.execute(NewsRequest(), object : VKApiCallback<List<Item?>?> {
                override fun fail(error: Exception) {
                    Timber.d(error)
                    emitter.onError(error)
                }

                override fun success(result: List<Item?>?) {
                    if (result != null) {
                        Timber.d(result.toString())
                        emitter.onSuccess(EntityMapper.mapToNewsItems(result))
                    } else {
                        emitter.onError(
                            Error("Result from wall.get in ${this@NewsRepository.javaClass.simpleName} is null!!!")
                        )
                    }
                }
            })
        }
    }
}