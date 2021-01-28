package ru.cyber_eagle_owl.core_api.providers

import ru.cyber_eagle_owl.core_api.mediators.*

interface MediatorsProvider {
    fun provideHomeMediator(): HomeMediator
    fun provideExercisesMediator(): ExercisesMediator
    fun provideTensesTableMediator(): TensesTableMediator
}