package ru.cyber_eagle_owl.viper_core.blueprints.viper_parts.contracts

import ru.cyber_eagle_owl.viper_core.wrappers.RouterToolbox

interface ViperRouter {
    val toolbox: RouterToolbox
    fun setToolsForRouting(toolbox: RouterToolbox)
}