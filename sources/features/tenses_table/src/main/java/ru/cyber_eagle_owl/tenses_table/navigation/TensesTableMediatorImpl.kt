package ru.cyber_eagle_owl.tenses_table.navigation

import ru.cyber_eagle_owl.core_api.mediators.TensesTableMediator
import javax.inject.Inject
import androidx.fragment.app.FragmentManager
import ru.cyber_eagle_owl.core_api.mediators.TensesTableMediator.Companion.TENSES_TABLE_FRAGMENT_TAG
import ru.cyber_eagle_owl.tenses_table.TensesTableFragment
import timber.log.Timber

class TensesTableMediatorImpl @Inject constructor() : TensesTableMediator {

    override fun openTensesTable(fragmentManager: FragmentManager, containerId: Int) {
        Timber.d("openTensesTable(fragmentManager: FragmentManager)")
        val tmpFragment = fragmentManager.findFragmentByTag(TENSES_TABLE_FRAGMENT_TAG)
        fragmentManager.beginTransaction().apply {
            replace(
                containerId, tmpFragment ?: TensesTableFragment.newInstance(),
                TENSES_TABLE_FRAGMENT_TAG
            )
        }.commit()
    }
}