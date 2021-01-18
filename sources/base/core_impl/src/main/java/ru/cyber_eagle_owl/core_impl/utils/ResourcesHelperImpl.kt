package ru.cyber_eagle_owl.core_impl.utils

import android.content.res.Resources
import ru.cyber_eagle_owl.core_api.contracts.utils.ResourcesHelper

class ResourcesHelperImpl(private val resources: Resources) : ResourcesHelper{
    override fun getStringArray(arrayId: Int): Array<String> {
        return resources.getStringArray(arrayId)
    }

    override fun getString(resId: Int): String {
        return resources.getString(resId)
    }
}