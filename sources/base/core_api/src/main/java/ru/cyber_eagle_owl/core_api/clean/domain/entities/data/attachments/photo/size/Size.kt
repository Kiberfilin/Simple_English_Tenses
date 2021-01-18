package ru.cyber_eagle_owl.core_api.clean.domain.entities.data.attachments.photo.size

import org.json.JSONObject
import ru.cyber_eagle_owl.core_api.constants.VkConstants
import timber.log.Timber

class Size(
    var type: String?,
    var url: String?,
    var width: Int?,
    var height: Int?
) {

    companion object {

        fun parse(jsonObject: JSONObject?): Size? {
            Timber.d("Парсим ${Size::class.java.simpleName} Получили такой JSONObject $jsonObject")

            return if (jsonObject != null) {
                Size(
                    jsonObject.optString(VkConstants.VKAPI_CONST_TYPE),
                    jsonObject.optString(VkConstants.VKAPI_CONST_URL),
                    jsonObject.optInt(VkConstants.VKAPI_CONST_WIDTH),
                    jsonObject.optInt(VkConstants.VKAPI_CONST_HEIGHT)
                )
            } else {
                null
            }
        }
    }
}
