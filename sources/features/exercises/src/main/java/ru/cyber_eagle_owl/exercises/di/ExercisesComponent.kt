package ru.cyber_eagle_owl.exercises.di

import dagger.Component
import ru.cyber_eagle_owl.core_api.di.FragmentScope
import ru.cyber_eagle_owl.core_api.providers.ProvidersFacade
import ru.cyber_eagle_owl.exercises.ExercisesFragment

@FragmentScope
@Component(
    modules = [ExercisesModule::class],
    dependencies = [ProvidersFacade::class]
)
interface ExercisesComponent {
    companion object {
        fun create(providersFacade: ProvidersFacade): ExercisesComponent {
            return DaggerExercisesComponent.builder()
                .providersFacade(providersFacade)
                .build()
        }
    }
    fun inject(ExercisesFragment: ExercisesFragment)
}