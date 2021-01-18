package ru.cyber_eagle_owl.core_api.clean.domain.boundaries.repository.outputports
@Deprecated("Заменить на RxKotlin")
interface AuthorizationRepositoryOutputPort {
    fun isLoggedInResult(result: Boolean)
}