package ru.cyber_eagle_owl.home.viper

import ru.cyber_eagle_owl.home.databinding.FragmentHomeBinding
import ru.cyber_eagle_owl.viper_core.blueprints.viper_parts.contracts.ViperPresenter
import ru.cyber_eagle_owl.viper_core.blueprints.viper_parts.contracts.ViperRouter
import ru.cyber_eagle_owl.viper_core.blueprints.viper_parts.contracts.ViperView
import ru.cyber_eagle_owl.viper_core.wrappers.RouterToolbox

interface HomeViperContract {
    interface HomeView : ViperView<HomePresenter, FragmentHomeBinding> {
        fun onFinishInflate(toolbox: RouterToolbox)
    }

    interface HomePresenter : ViperPresenter {
        var view: HomeView
        fun onFinishInflate(toolbox: RouterToolbox)
        fun onViewCreated(view: HomeView)
    }

    interface HomeRouter: ViperRouter {
        fun openExercises()
    }
}