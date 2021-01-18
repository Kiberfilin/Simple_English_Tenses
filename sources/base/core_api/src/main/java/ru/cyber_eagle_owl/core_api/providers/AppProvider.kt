package ru.cyber_eagle_owl.core_api.providers

import android.content.Context

interface AppProvider {
    fun provideAppContext(): Context
}