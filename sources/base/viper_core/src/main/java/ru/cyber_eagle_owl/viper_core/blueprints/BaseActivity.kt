package ru.cyber_eagle_owl.viper_core.blueprints

import androidx.appcompat.app.AppCompatActivity
import ru.cyber_eagle_owl.viper_core.wrappers.RouterToolboxImpl
import ru.cyber_eagle_owl.viper_core.wrappers.RouterToolbox

abstract class BaseActivity : AppCompatActivity() {

    private lateinit var routerToolbox: RouterToolbox

    protected fun getRouterToolbox(): RouterToolbox {
        if (!::routerToolbox.isInitialized) routerToolbox =
            RouterToolboxImpl(this)
        return routerToolbox
    }
}