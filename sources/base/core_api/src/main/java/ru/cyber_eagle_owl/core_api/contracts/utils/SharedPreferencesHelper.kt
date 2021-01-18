package ru.cyber_eagle_owl.core_api.contracts.utils

interface SharedPreferencesHelper {
    fun saveStringData(key: String, data: String)
    fun getStringData(key: String): String?
}