package ru.cyber_eagle_owl.home.navigation

import ru.cyber_eagle_owl.core_api.mediators.HomeMediator
import javax.inject.Inject
import androidx.fragment.app.FragmentManager
import ru.cyber_eagle_owl.home.HomeFragment
import timber.log.Timber

class HomeMediatorImpl @Inject constructor() : HomeMediator {
    private val HOME_FRAGMENT_TAG = "HOME_FRAGMENT_TAG"
    override fun openHome(fragmentManager: FragmentManager, containerId: Int) {
        Timber.d("openHome(fragmentManager: FragmentManager)")
        val tmpFragment = fragmentManager.findFragmentByTag(HOME_FRAGMENT_TAG)
        fragmentManager.beginTransaction().apply {
            replace(containerId, tmpFragment ?: HomeFragment.newInstance(), HOME_FRAGMENT_TAG)
        }.commit()
    }
}