package ru.cyber_eagle_owl.core_api.contracts.utils

interface ResourcesHelper {
    fun getStringArray(arrayId: Int): Array<String>
    fun getString(resId: Int): String
}