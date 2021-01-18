package ru.cyber_eagle_owl.core_impl.mappers

import android.annotation.SuppressLint
import ru.cyber_eagle_owl.core_api.clean.domain.entities.data.*
import ru.cyber_eagle_owl.core_api.clean.domain.entities.data.attachments.photo.Photo
import ru.cyber_eagle_owl.core_api.clean.domain.entities.data.database.*
import ru.cyber_eagle_owl.core_api.clean.domain.entities.presentation.*
import ru.cyber_eagle_owl.core_api.constants.VkConstants
import timber.log.Timber
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class EntityMapper {
    companion object {
        @SuppressLint("SimpleDateFormat")
        fun mapToNewsItems(items: List<Item?>?): List<NewsItem> {
            Timber.d("mapToNewsItems(items: List<Item?>?): List<NewsItem>")
            val newsItems: ArrayList<NewsItem> = ArrayList()
            items?.let { rawItems: List<Item?> ->
                for (i in rawItems.indices) {
                    var tmpNewsPictureUrl: String? = null
                    var tmpNewsText: String
                    var tmpIsRepost: Boolean
                    if (rawItems[i] == null) continue else {
                        tmpNewsText = if (rawItems[i]!!.text != null) rawItems[i]!!.text!! else ""
                        tmpIsRepost = rawItems[i]!!.copyHistory?.isNotEmpty() ?: false
                        rawItems[i]!!.attachments?.let {
                            for (attachmentItem in it) {
                                attachmentItem?.type?.let { type ->
                                    if (
                                        type == VkConstants.VKAPI_CONST_PHOTO
                                        && attachmentItem.attachment != null
                                        && (attachmentItem.attachment as Photo).sizes != null
                                        && (attachmentItem.attachment as Photo).sizes!!.isNotEmpty()
                                        && (attachmentItem.attachment as Photo).sizes!!.last() != null
                                    )
                                        tmpNewsPictureUrl =
                                            (attachmentItem.attachment as Photo).sizes!!.last()!!.url
                                }
                            }
                        }
                    }
                    //val sdf = SimpleDateFormat("kk:mm dd.MM.yyyy")
                    val sdf = SimpleDateFormat("d MMMM yyyy")
                    val tmpNewsDate = if (rawItems[i]!!.date != null) {
                        sdf.format(java.util.Date(rawItems[i]!!.date!! * 1000))
                    } else ""
                    newsItems.add(
                        NewsItem(
                            rawItems[i]?.id ?: 0,
                            tmpNewsText,
                            tmpNewsPictureUrl,
                            tmpNewsDate,
                            tmpIsRepost
                        )
                    )
                }
            }
            return newsItems
        }

        fun mapToPlaceItem(address: Address, metro: MetroStation? = null, city: City): PlaceItem {
            val tmpAddress = "${city.title},${
                if (metro != null) {
                    " метро ${metro.name},"
                } else {
                    ""
                }
            } ${address.address}"

            return if (metro == null) {
                PlaceItem(
                    address.title!!,
                    address.additional_address!!,
                    tmpAddress,
                    Coordinates(address.latitude!!, address.longitude!!)
                )
            } else {
                PlaceItem(
                    address.title!!,
                    address.additional_address!!,
                    tmpAddress,
                    Coordinates(address.latitude!!, address.longitude!!)
                )
            }
        }
    }
}