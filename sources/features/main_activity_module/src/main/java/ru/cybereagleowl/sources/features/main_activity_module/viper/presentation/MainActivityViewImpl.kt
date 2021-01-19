package ru.cybereagleowl.sources.features.main_activity_module.viper.presentation

import android.content.Context
import ru.cybereagleowl.sources.features.main_activity_module.viper.MainActivityViperContract.*
import ru.cyber_eagle_owl.viper_core.blueprints.BaseActivity
import ru.cyber_eagle_owl.viper_core.blueprints.viper_parts.BaseView
import ru.cyber_eagle_owl.viper_core.wrappers.RouterToolbox
import timber.log.Timber
import java.lang.ref.WeakReference
import javax.inject.Inject

class MainActivityViewImpl @Inject constructor() : BaseView<MainActivityPresenter>(),
    MainActivityView {
    private lateinit var contextWeak: WeakReference<Context>
    override fun onFinishInflate(toolbox: RouterToolbox, activity: BaseActivity) {
        Timber.d("onFinishInflate")
        contextWeak = WeakReference(toolbox.activityContext())
        initViews()
        insetsHandling()
        presenter.apply {
            onFinishInflate(toolbox)
            onViewCreated(this@MainActivityViewImpl)
        }
    }

    private fun initViews() {
        Timber.d("initViews()")
        //TODO
    }

    private fun insetsHandling() {
        Timber.d("insetsHandling()")
        //TODO
    }
}