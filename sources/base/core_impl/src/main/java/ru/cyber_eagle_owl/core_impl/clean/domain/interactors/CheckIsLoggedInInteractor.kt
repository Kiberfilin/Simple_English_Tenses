package ru.cyber_eagle_owl.core_impl.clean.domain.interactors

import io.reactivex.Single
import ru.cyber_eagle_owl.core_api.clean.domain.boundaries.presenter.inputports.CheckIsLoggedInInputPort
import ru.cyber_eagle_owl.core_api.clean.domain.boundaries.repository.inputports.AuthorizationRepositoryInputPort
import timber.log.Timber
import javax.inject.Inject

class CheckIsLoggedInInteractor @Inject constructor(
    private var dataInputPort: AuthorizationRepositoryInputPort
) : CheckIsLoggedInInputPort {
    override fun execute(): Single<Boolean> {
        Timber.d("execute(): Single<Boolean>")
        return dataInputPort.isLoggedIn()
    }
}