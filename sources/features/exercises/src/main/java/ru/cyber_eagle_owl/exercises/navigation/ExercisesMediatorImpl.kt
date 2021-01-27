package ru.cyber_eagle_owl.exercises.navigation

import androidx.fragment.app.FragmentManager
import ru.cyber_eagle_owl.core_api.mediators.ExercisesMediator
import ru.cyber_eagle_owl.exercises.ExercisesFragment
import timber.log.Timber
import javax.inject.Inject

class ExercisesMediatorImpl @Inject constructor() : ExercisesMediator {

    override fun openExercises(fragmentManager: FragmentManager, containerId: Int) {
        Timber.d("openExercises(fragmentManager: FragmentManager)")
        val tmpFragment = fragmentManager.findFragmentByTag(ExercisesMediator.EXERCISES_FRAGMENT_TAG)
        fragmentManager.beginTransaction().apply {
            replace(containerId, tmpFragment ?: ExercisesFragment.newInstance(),
                ExercisesMediator.EXERCISES_FRAGMENT_TAG
            )
        }.commit()
    }
}