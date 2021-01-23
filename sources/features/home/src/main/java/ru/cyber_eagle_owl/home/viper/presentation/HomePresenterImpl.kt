package ru.cyber_eagle_owl.home.viper.presentation

import ru.cyber_eagle_owl.home.viper.HomeViperContract.*
import ru.cyber_eagle_owl.viper_core.blueprints.viper_parts.BasePresenter
import ru.cyber_eagle_owl.viper_core.wrappers.RouterToolbox
import java.lang.ref.WeakReference
import javax.inject.Inject

class HomePresenterImpl @Inject constructor(private var router: HomeRouter) : BasePresenter(),
    HomePresenter {
    override lateinit var view: HomeView
    private lateinit var routerToolBoxWeak: WeakReference<RouterToolbox>

    override fun onFinishInflate(toolbox: RouterToolbox) {
        routerToolBoxWeak = WeakReference(toolbox)
        router.setToolsForRouting(toolbox)
    }

    override fun onViewCreated(view: HomeView) {
        this.view = view
    }
}