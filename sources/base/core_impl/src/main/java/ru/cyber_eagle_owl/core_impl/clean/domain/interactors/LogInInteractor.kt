package ru.cyber_eagle_owl.core_impl.clean.domain.interactors

import ru.cyber_eagle_owl.core_api.clean.domain.boundaries.presenter.inputports.LogInInputPort
import ru.cyber_eagle_owl.core_api.clean.domain.boundaries.repository.inputports.AuthorizationRepositoryInputPort
import ru.cyber_eagle_owl.viper_core.wrappers.RouterToolbox
import timber.log.Timber
import javax.inject.Inject

class LogInInteractor @Inject constructor(
    private var dataInputPort: AuthorizationRepositoryInputPort
) : LogInInputPort {
    override fun execute(routerToolBox: RouterToolbox) {
        Timber.d("execute(routerToolBox: RouterToolbox)")
        dataInputPort.login(routerToolBox)
    }
}