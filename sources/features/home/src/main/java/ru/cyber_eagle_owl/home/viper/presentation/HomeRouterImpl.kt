package ru.cyber_eagle_owl.home.viper.presentation

import ru.cyber_eagle_owl.home.viper.HomeViperContract.HomeRouter
import ru.cyber_eagle_owl.viper_core.blueprints.viper_parts.BaseRouter
import javax.inject.Inject

class HomeRouterImpl @Inject constructor(): BaseRouter(), HomeRouter{
    override fun openExercises() {
        TODO("Not yet implemented")
    }
}