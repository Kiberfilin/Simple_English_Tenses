package ru.cyber_eagle_owl.core_api.clean.domain.boundaries.repository.inputports

import io.reactivex.Single
import ru.cyber_eagle_owl.viper_core.wrappers.RouterToolbox

interface AuthorizationRepositoryInputPort {
    fun isLoggedIn(): Single<Boolean>
    fun login(routerToolBox: RouterToolbox)
}