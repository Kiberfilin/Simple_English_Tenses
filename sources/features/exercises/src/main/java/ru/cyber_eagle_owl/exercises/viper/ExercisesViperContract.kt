package ru.cyber_eagle_owl.exercises.viper

import ru.cyber_eagle_owl.exercises.databinding.FragmentExercisesBinding
import ru.cyber_eagle_owl.viper_core.blueprints.viper_parts.contracts.ViperPresenter
import ru.cyber_eagle_owl.viper_core.blueprints.viper_parts.contracts.ViperRouter
import ru.cyber_eagle_owl.viper_core.blueprints.viper_parts.contracts.ViperView
import ru.cyber_eagle_owl.viper_core.wrappers.RouterToolbox

interface ExercisesViperContract {
    interface ExercisesView : ViperView<ExercisesPresenter, FragmentExercisesBinding> {
        fun onFinishInflate(toolbox: RouterToolbox)
    }

    interface ExercisesPresenter : ViperPresenter {
        var view: ExercisesView
        fun onFinishInflate(toolbox: RouterToolbox)
        fun onViewCreated(view: ExercisesView)
    }

    interface ExercisesRouter: ViperRouter {

    }
}