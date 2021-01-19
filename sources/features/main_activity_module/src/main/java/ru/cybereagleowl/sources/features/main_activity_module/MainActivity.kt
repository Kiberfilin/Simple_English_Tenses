package ru.cybereagleowl.sources.features.main_activity_module

import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import ru.cyber_eagle_owl.core_api.providers.AppWithFacade
import ru.cyber_eagle_owl.viper_core.blueprints.BaseActivity
import ru.cybereagleowl.sources.features.main_activity_module.di.MainActivityComponent
import ru.cybereagleowl.sources.features.main_activity_module.viper.MainActivityViperContract.*
import timber.log.Timber
import javax.inject.Inject

class MainActivity : BaseActivity() {
    private var component: MainActivityComponent? = null
    @Inject
    lateinit var mainActivityView: MainActivityView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.d("onCreate")
        prepareDagger()
        rootView = LayoutInflater.from(this).inflate(R.layout.activity_main, null)
        setContentView(rootView)
        mainActivityView.apply {
            setRootView(rootView)
            onFinishInflate(getRouterToolbox(), this@MainActivity)
        }
    }

    private fun prepareDagger() {
        Timber.d("prepareDagger()")
        component = MainActivityComponent.create((application as AppWithFacade).getFacade())
        component!!.inject(this)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item) //TODO
    }
}