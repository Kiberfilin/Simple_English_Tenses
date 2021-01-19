package ru.cybereagleowl.sources.features.main_activity_module.viper

import ru.cyber_eagle_owl.viper_core.blueprints.BaseActivity
import ru.cyber_eagle_owl.viper_core.blueprints.viper_parts.contracts.ViperPresenter
import ru.cyber_eagle_owl.viper_core.blueprints.viper_parts.contracts.ViperRouter
import ru.cyber_eagle_owl.viper_core.blueprints.viper_parts.contracts.ViperView
import ru.cyber_eagle_owl.viper_core.wrappers.RouterToolbox

interface MainActivityViperContract {
    interface MainActivityView : ViperView<MainActivityPresenter> {
        fun onFinishInflate(
            toolbox: RouterToolbox,
            activity: BaseActivity
        )
    }

    interface MainActivityPresenter : ViperPresenter {
        var view: MainActivityView
        fun onFinishInflate(toolbox: RouterToolbox)
        fun onViewCreated(view: MainActivityView)
    }

    interface MainActivityRouter : ViperRouter {
        fun openExercises()
    }
}