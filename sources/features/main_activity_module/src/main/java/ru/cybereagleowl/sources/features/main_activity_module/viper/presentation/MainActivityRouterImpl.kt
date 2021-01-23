package ru.cybereagleowl.sources.features.main_activity_module.viper.presentation

import ru.cyber_eagle_owl.core_api.mediators.HomeMediator
import ru.cyber_eagle_owl.viper_core.blueprints.viper_parts.BaseRouter
import ru.cybereagleowl.sources.features.main_activity_module.R
import ru.cybereagleowl.sources.features.main_activity_module.viper.MainActivityViperContract.*
import javax.inject.Inject

class MainActivityRouterImpl @Inject constructor(
    private var homeMediator: HomeMediator
): BaseRouter(), MainActivityRouter{

    override fun openHome() {
        homeMediator.openHome(toolbox.fragmentManager(), R.id.mainFragmentContainer)
    }

    override fun openExercises() {
        //TODO("Not yet implemented")
    }

    override fun openTensesTable() {
        //TODO("Not yet implemented")
    }

}