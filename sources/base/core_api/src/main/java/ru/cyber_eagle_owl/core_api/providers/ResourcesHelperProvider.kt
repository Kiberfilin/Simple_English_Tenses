package ru.cyber_eagle_owl.core_api.providers

import ru.cyber_eagle_owl.core_api.contracts.utils.ResourcesHelper

interface ResourcesHelperProvider {
    fun provideResourcesHelper(): ResourcesHelper
}