package ru.cyber_eagle_owl.core_impl.utils

import android.content.SharedPreferences
import ru.cyber_eagle_owl.core_api.contracts.utils.SharedPreferencesHelper

class SharedPreferencesHelperImpl(private val sharedPreferences: SharedPreferences) :
    SharedPreferencesHelper {
    override fun saveStringData(key: String, data: String) {
        sharedPreferences.edit()
            .putString(key, data)
            .apply()
    }

    override fun getStringData(key: String): String? {
        return sharedPreferences.getString(key, "")
    }
}