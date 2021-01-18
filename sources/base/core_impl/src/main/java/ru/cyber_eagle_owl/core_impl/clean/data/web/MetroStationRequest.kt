package ru.cyber_eagle_owl.core_impl.clean.data.web

import com.vk.api.sdk.requests.VKRequest
import org.json.JSONObject
import ru.cyber_eagle_owl.core_api.clean.domain.entities.data.database.MetroStation
import ru.cyber_eagle_owl.core_api.constants.VkConstants
import timber.log.Timber

class MetroStationRequest(stationId: Long) : VKRequest<MetroStation?>("database.getMetroStationsById") {

    init {
        addParam(VkConstants.VKAPI_CONST_STATION_IDS, stationId)
        //addParam(VkConstants.VKAPI_CONST_COUNT, VkConstants.VKAPI_DEFAULT_COUNT)
    }

    override fun parse(r: JSONObject): MetroStation? {
        Timber.d("parse(r: JSONObject): Response")

        val items = r.getJSONArray(VkConstants.VKAPI_CONST_RESPONSE)
        //Timber.d("Profiles JSONArray: ${r.getJSONObject(VkConstants.VKAPI_CONST_RESPONSE).getJSONArray(VkConstants.VKAPI_CONST_PROFILES)}")
        val result = ArrayList<MetroStation?>()
        for (i in 0 until items.length()) {
            result.add(MetroStation.parse(items.getJSONObject(i)))
        }
        return result.first()
    }


}