package ru.cyber_eagle_owl.simpleenglish.di

import dagger.Binds
import dagger.Module
import dagger.Reusable
import ru.cyber_eagle_owl.core_api.mediators.HomeMediator
import ru.cyber_eagle_owl.home.navigation.HomeMediatorImpl

@Module
interface MediatorsBindings {
    @Binds
    @Reusable
    fun bindsHomeMediator(welcomeMediatorImpl: HomeMediatorImpl): HomeMediator
}