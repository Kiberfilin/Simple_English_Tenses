package ru.cyber_eagle_owl.core_api.mediators

import androidx.fragment.app.FragmentManager

interface ExercisesMediator {
    fun openExercises(fragmentManager: FragmentManager, containerId: Int)

    companion object {
        const val EXERCISES_FRAGMENT_TAG = "EXERCISES_FRAGMENT_TAG"
    }
}