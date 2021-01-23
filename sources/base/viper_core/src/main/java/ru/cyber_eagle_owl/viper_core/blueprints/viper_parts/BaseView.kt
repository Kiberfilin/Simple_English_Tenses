package ru.cyber_eagle_owl.viper_core.blueprints.viper_parts

import androidx.viewbinding.ViewBinding
import ru.cyber_eagle_owl.viper_core.blueprints.viper_parts.contracts.ViperPresenter
import ru.cyber_eagle_owl.viper_core.blueprints.viper_parts.contracts.ViperView
import javax.inject.Inject

abstract class BaseView<P : ViperPresenter, VB : ViewBinding> : ViperView<P, VB> {

    @Inject
    override lateinit var presenter: P

    override lateinit var viewBinding: VB

    override fun setVBinding(viewBinding: VB) {
        this.viewBinding = viewBinding
    }
}