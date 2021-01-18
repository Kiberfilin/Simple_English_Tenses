package ru.cyber_eagle_owl.viper_core.blueprints.viper_parts

import ru.cyber_eagle_owl.viper_core.blueprints.viper_parts.contracts.ViperRouter
import ru.cyber_eagle_owl.viper_core.wrappers.RouterToolbox

abstract class BaseRouter :
    ViperRouter {

    override lateinit var toolbox: RouterToolbox

    override fun setToolsForRouting(toolbox: RouterToolbox) {
        this.toolbox = toolbox
    }
}