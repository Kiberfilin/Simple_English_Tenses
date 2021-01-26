package ru.cyber_eagle_owl.exercises.di

import dagger.Binds
import dagger.Module
import ru.cyber_eagle_owl.core_api.di.FragmentScope
import ru.cyber_eagle_owl.Exercises.viper.ExercisesViperContract.*
import ru.cyber_eagle_owl.Exercises.viper.presentation.ExercisesPresenterImpl
import ru.cyber_eagle_owl.Exercises.viper.presentation.ExercisesViewImpl
import ru.cyber_eagle_owl.Exercises.viper.presentation.ExercisesRouterImpl

@Module
abstract class ExercisesMolule {
    @Binds
    @FragmentScope
    abstract fun ExercisesView(ExercisesViewImpl: ExercisesViewImpl): ExercisesView

    @Binds
    @FragmentScope
    abstract fun ExercisesPresenter(ExercisesPresenterImpl: ExercisesPresenterImpl): ExercisesPresenter

    @Binds
    @FragmentScope
    abstract fun ExercisesRouter(ExercisesRouterImpl: ExercisesRouterImpl): ExercisesRouter
}
