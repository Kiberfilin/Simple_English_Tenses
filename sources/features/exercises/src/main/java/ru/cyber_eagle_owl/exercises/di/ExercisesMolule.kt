package ru.cyber_eagle_owl.exercises.di

import dagger.Binds
import dagger.Module
import ru.cyber_eagle_owl.core_api.di.FragmentScope
import ru.cyber_eagle_owl.exercises.viper.ExercisesViperContract.*
import ru.cyber_eagle_owl.exercises.viper.presentation.*

@Module
abstract class ExercisesModule {
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
