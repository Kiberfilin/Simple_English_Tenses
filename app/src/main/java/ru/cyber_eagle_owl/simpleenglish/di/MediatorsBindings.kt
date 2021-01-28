package ru.cyber_eagle_owl.simpleenglish.di

import dagger.Binds
import dagger.Module
import dagger.Reusable
import ru.cyber_eagle_owl.core_api.mediators.*
import ru.cyber_eagle_owl.exercises.navigation.ExercisesMediatorImpl
import ru.cyber_eagle_owl.home.navigation.HomeMediatorImpl
import ru.cyber_eagle_owl.tenses_table.navigation.TensesTableMediatorImpl

@Module
interface MediatorsBindings {
    @Binds
    @Reusable
    fun bindsHomeMediator(homeMediatorImpl: HomeMediatorImpl): HomeMediator

    @Binds
    @Reusable
    fun bindsExercisesMediator(exercisesMediatorImpl: ExercisesMediatorImpl): ExercisesMediator

    @Binds
    @Reusable
    fun bindsTensesTableMediator(tensesTableMediatorImpl: TensesTableMediatorImpl): TensesTableMediator
}