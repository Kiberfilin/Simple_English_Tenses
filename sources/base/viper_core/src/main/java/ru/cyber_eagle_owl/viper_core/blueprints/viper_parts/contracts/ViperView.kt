package ru.cyber_eagle_owl.viper_core.blueprints.viper_parts.contracts

import androidx.viewbinding.ViewBinding

interface ViperView<P : ViperPresenter, VB: ViewBinding> {
    val viewBinding: VB
    val presenter: P
    fun setVBinding(viewBinding: VB)
}
