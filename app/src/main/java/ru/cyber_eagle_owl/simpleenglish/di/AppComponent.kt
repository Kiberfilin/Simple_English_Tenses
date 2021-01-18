package ru.cyber_eagle_owl.simpleenglish.di

import android.app.Application
import android.content.Context
import dagger.BindsInstance
import dagger.Component
import ru.cyber_eagle_owl.core_api.di.ApplicationScope

@ApplicationScope
@Component
interface AppComponent : AppProvider {
    companion object {
        private var appComponent: AppProvider? = null
        fun create(application: Application): AppProvider {
            return appComponent ?: DaggerAppComponent
                .builder()
                .application(application.applicationContext)
                .build().also {
                    appComponent = it
                }
        }
    }

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(context: Context): Builder
        fun build(): AppComponent
    }
}