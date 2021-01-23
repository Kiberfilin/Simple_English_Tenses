package ru.cyber_eagle_owl.home.viper.presentation

import android.content.Context
import ru.cyber_eagle_owl.home.databinding.FragmentHomeBinding
import ru.cyber_eagle_owl.home.viper.HomeViperContract.*
import ru.cyber_eagle_owl.viper_core.blueprints.viper_parts.BaseView
import ru.cyber_eagle_owl.viper_core.wrappers.RouterToolbox
import timber.log.Timber
import java.lang.ref.WeakReference
import javax.inject.Inject

class HomeViewImpl @Inject constructor() : BaseView<HomePresenter, FragmentHomeBinding>(),
    HomeView {
    private lateinit var contextWeak: WeakReference<Context>

    override fun onFinishInflate(toolbox: RouterToolbox) {
        Timber.d("onFinishInflate")
        contextWeak = WeakReference(toolbox.activityContext())
        initViews()
        insetsHandling()
        presenter.apply {
            onFinishInflate(toolbox)
            onViewCreated(this@HomeViewImpl)
        }
    }

    private fun initViews() {
        //TODO("Not yet implemented")
    }

    private fun insetsHandling() {
        //TODO("Not yet implemented")
    }
}