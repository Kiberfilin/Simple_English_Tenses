package ru.cyber_eagle_owl.core_api.clean.domain.boundaries.presenter.inputports

import ru.cyber_eagle_owl.viper_core.wrappers.RouterToolbox

interface LogInInputPort {
    fun execute(routerToolBox: RouterToolbox)
}