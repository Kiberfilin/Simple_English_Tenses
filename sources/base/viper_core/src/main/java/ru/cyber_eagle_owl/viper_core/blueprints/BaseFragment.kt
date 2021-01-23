package ru.cyber_eagle_owl.viper_core.blueprints

import androidx.fragment.app.Fragment
import ru.cyber_eagle_owl.viper_core.wrappers.RouterToolbox
import ru.cyber_eagle_owl.viper_core.wrappers.RouterToolboxImpl

abstract class BaseFragment : Fragment() {
    private lateinit var routerToolbox: RouterToolbox

    protected fun getRouterToolbox(): RouterToolbox {
        if (!::routerToolbox.isInitialized) routerToolbox =
            RouterToolboxImpl(activity as BaseActivity)
        return routerToolbox
    }
}