package ru.cyber_eagle_owl.core_api.mediators

import androidx.fragment.app.FragmentManager

interface TensesTableMediator {
    fun openTensesTable(fragmentManager: FragmentManager, containerId: Int)

    companion object {
        const val TENSES_TABLE_FRAGMENT_TAG = "TENSES_TABLE_FRAGMENT_TAG"
    }
}