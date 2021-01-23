package ru.cybereagleowl.sources.features.main_activity_module.viper

import ru.cyber_eagle_owl.viper_core.blueprints.viper_parts.contracts.ViperPresenter
import ru.cyber_eagle_owl.viper_core.blueprints.viper_parts.contracts.ViperRouter
import ru.cyber_eagle_owl.viper_core.blueprints.viper_parts.contracts.ViperView
import ru.cyber_eagle_owl.viper_core.wrappers.RouterToolbox
import ru.cybereagleowl.sources.features.main_activity_module.databinding.ActivityMainBinding

interface MainActivityViperContract {
    interface MainActivityView : ViperView<MainActivityPresenter, ActivityMainBinding> {
        fun onFinishInflate(toolbox: RouterToolbox, isActivityCreatedAtTheFirstTime: Boolean)
        fun onBackPressed(defaultSuper: () -> Unit)
        fun onStop()
    }

    interface MainActivityPresenter : ViperPresenter {
        var view: MainActivityView
        fun onFinishInflate(toolbox: RouterToolbox)
        fun onViewCreated(view: MainActivityView)
        fun onOptionHomeWasChosen()
        fun onOptionExercisesWasChosen()
        fun onOptionTensesTableWasChosen()
    }

    interface MainActivityRouter : ViperRouter {
        fun openHome()
        fun openExercises()
        fun openTensesTable()
    }
}