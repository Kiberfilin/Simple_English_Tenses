package ru.cyber_eagle_owl.simpleenglish

import android.app.Application
import ru.cyber_eagle_owl.core_api.providers.AppWithFacade
import ru.cyber_eagle_owl.core_api.providers.ProvidersFacade
import ru.cyber_eagle_owl.simpleenglish.di.FacadeComponent
import timber.log.Timber
import javax.inject.Inject

class App : Application(), AppWithFacade {

    companion object {
        private var facadeComponent: FacadeComponent? = null
    }

    override fun getFacade(): ProvidersFacade {
        return facadeComponent ?: FacadeComponent.init(this).also {
            facadeComponent = it
        }
    }

    override fun onCreate() {
        super.onCreate()
        (getFacade() as FacadeComponent).inject(this)
        prepareTimber()
    }

    private fun prepareTimber() {
        Timber.plant(Timber.DebugTree())
    }
}