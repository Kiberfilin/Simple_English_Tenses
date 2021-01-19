package ru.cyber_eagle_owl.core_impl.di

import android.content.Context
import dagger.Module
import dagger.Provides
import ru.cyber_eagle_owl.core_api.di.ApplicationScope
import ru.cyber_eagle_owl.core_api.contracts.utils.ResourcesHelper
import ru.cyber_eagle_owl.core_api.contracts.utils.SharedPreferencesHelper
import ru.cyber_eagle_owl.core_impl.utils.ResourcesHelperImpl
import ru.cyber_eagle_owl.core_impl.utils.SharedPreferencesHelperImpl
import timber.log.Timber

private const val SADDAY_APP_SHAREDPREF_NAME = "SIMPLE_ENGLISH_TENSES_APP"

@Module
class UtilsModule {
    @Provides
    @ApplicationScope
    fun provideSharedPreferencesHelper(context: Context): SharedPreferencesHelper {
        return SharedPreferencesHelperImpl(
            context.getSharedPreferences(
                SADDAY_APP_SHAREDPREF_NAME,
                Context.MODE_PRIVATE
            )
        )
    }
    @Provides
    @ApplicationScope
    fun provideResourcesHelper(context: Context): ResourcesHelper {
        Timber.d("***provideResourcesHelper(context: Context): ResourcesHelper***")
        return ResourcesHelperImpl(context.resources)
    }
}