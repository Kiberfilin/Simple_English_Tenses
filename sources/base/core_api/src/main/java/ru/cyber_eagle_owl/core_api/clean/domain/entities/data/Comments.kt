package ru.cyber_eagle_owl.core_api.clean.domain.entities.data

import org.json.JSONObject
import ru.cyber_eagle_owl.core_api.constants.VkConstants
import timber.log.Timber

class Comments(
    var count: Long?,
    var canPost: Int?,
    var groupsCanPost: Int?,
    var canClose: Boolean?,
    var canOpen: Boolean?
) {
    companion object {

        fun parse(jsonObject: JSONObject?): Comments? {
            Timber.d("Парсим ${Comments::class.java.simpleName} Получили такой JSONObject $jsonObject")

            return if (jsonObject != null) {
                Comments(
                    jsonObject.optLong(VkConstants.VKAPI_CONST_COUNT),
                    jsonObject.optInt(VkConstants.VKAPI_CONST_CAN_POST),
                    jsonObject.optInt(VkConstants.VKAPI_CONST_GROUPS_CAN_POST),
                    jsonObject.optBoolean(VkConstants.VKAPI_CONST_CAN_CLOSE),
                    jsonObject.optBoolean(VkConstants.VKAPI_CONST_CAN_OPEN)
                )
            } else {
                null
            }
        }
    }
}
