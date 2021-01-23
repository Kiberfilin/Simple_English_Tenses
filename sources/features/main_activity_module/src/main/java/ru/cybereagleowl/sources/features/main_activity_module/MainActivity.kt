package ru.cybereagleowl.sources.features.main_activity_module

import android.os.Bundle
import ru.cyber_eagle_owl.core_api.providers.AppWithFacade
import ru.cyber_eagle_owl.viper_core.blueprints.BaseActivity
import ru.cybereagleowl.sources.features.main_activity_module.databinding.ActivityMainBinding
import ru.cybereagleowl.sources.features.main_activity_module.di.MainActivityComponent
import ru.cybereagleowl.sources.features.main_activity_module.viper.MainActivityViperContract.*
import timber.log.Timber
import javax.inject.Inject

class MainActivity : BaseActivity() {
    private lateinit var binding: ActivityMainBinding
    private var component: MainActivityComponent? = null

    @Inject
    lateinit var mainActivityView: MainActivityView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.d("onCreate")
        binding = ActivityMainBinding.inflate(layoutInflater)
        prepareDagger()
        setContentView(binding.root)
        mainActivityView.apply {
            setVBinding(binding)
            onFinishInflate(getRouterToolbox(), savedInstanceState == null)
        }
    }

    private fun prepareDagger() {
        Timber.d("prepareDagger()")
        component = MainActivityComponent.create((application as AppWithFacade).getFacade())
        component!!.inject(this)
    }

    override fun onBackPressed() {
        mainActivityView.onBackPressed { super.onBackPressed() }
    }

    override fun onStop() {
        mainActivityView.onStop()
        super.onStop()
    }
}