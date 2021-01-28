package ru.cybereagleowl.sources.features.main_activity_module.viper.presentation

import ru.cyber_eagle_owl.core_api.mediators.*
import ru.cyber_eagle_owl.viper_core.blueprints.viper_parts.BaseRouter
import ru.cybereagleowl.sources.features.main_activity_module.R
import ru.cybereagleowl.sources.features.main_activity_module.viper.MainActivityViperContract.*
import javax.inject.Inject

class MainActivityRouterImpl @Inject constructor(
    private var homeMediator: HomeMediator,
    private var exercisesMediator: ExercisesMediator,
    private var tensesTableMediator: TensesTableMediator
) : BaseRouter(), MainActivityRouter {
    override fun openHome() {
        homeMediator.openHome(toolbox.fragmentManager(), R.id.mainFragmentContainer)
    }

    override fun openExercises() {
        exercisesMediator.openExercises(toolbox.fragmentManager(), R.id.mainFragmentContainer)
    }

    override fun openTensesTable() {
        tensesTableMediator.openTensesTable(toolbox.fragmentManager(), R.id.mainFragmentContainer)
    }
}