package ru.cyber_eagle_owl.core_api.mediators

import androidx.fragment.app.FragmentManager

interface HomeMediator {
    fun openHome(fragmentManager: FragmentManager, containerId: Int)

    companion object {
        const val HOME_FRAGMENT_TAG = "HOME_FRAGMENT_TAG"
    }
}