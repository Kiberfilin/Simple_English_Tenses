package ru.cyber_eagle_owl.core_api.providers

import ru.cyber_eagle_owl.core_api.contracts.utils.SharedPreferencesHelper

interface SharedPreferencesHelperProvider {
    fun provideSharedPreferencesHelper(): SharedPreferencesHelper
}