package ru.cyber_eagle_owl.viper_core.blueprints.viper_parts

import android.view.View
import ru.cyber_eagle_owl.viper_core.blueprints.viper_parts.contracts.ViperPresenter
import ru.cyber_eagle_owl.viper_core.blueprints.viper_parts.contracts.ViperView
import javax.inject.Inject

abstract class BaseView<P : ViperPresenter> : ViperView<P> {

    @Inject
    override lateinit var presenter: P

    override lateinit var viperRootView: View

    override fun setRootView(rootView: View) {
        viperRootView = rootView
    }
}