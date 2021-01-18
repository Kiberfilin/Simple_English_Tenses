package ru.cyber_eagle_owl.core_api.clean.domain.entities.data

import org.json.JSONObject
import ru.cyber_eagle_owl.core_api.constants.VkConstants
import timber.log.Timber

class Reposts(var count: Long?, var userReposted: Int?) {

    companion object {

        fun parse(jsonObject: JSONObject?): Reposts? {
            Timber.d("Парсим ${Reposts::class.java.simpleName} Получили такой JSONObject $jsonObject")

            return if (jsonObject != null) {
                Reposts(
                    jsonObject.optLong(VkConstants.VKAPI_CONST_COUNT),
                    jsonObject.optInt(VkConstants.VKAPI_CONST_USER_REPOSTED)
                )
            } else {
                null
            }
        }
    }
}
