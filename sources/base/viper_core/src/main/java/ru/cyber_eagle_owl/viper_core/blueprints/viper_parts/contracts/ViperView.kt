package ru.cyber_eagle_owl.viper_core.blueprints.viper_parts.contracts

import android.view.View

interface ViperView<P : ViperPresenter> {
    val viperRootView: View
    val presenter: P
    fun setRootView(rootView: View)
}
