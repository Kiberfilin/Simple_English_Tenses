package ru.cybereagleowl.sources.features.main_activity_module.viper.presentation

import ru.cyber_eagle_owl.viper_core.blueprints.viper_parts.BasePresenter
import ru.cyber_eagle_owl.viper_core.wrappers.RouterToolbox
import javax.inject.Inject
import ru.cybereagleowl.sources.features.main_activity_module.viper.MainActivityViperContract.*
import java.lang.ref.WeakReference

class MainActivityPresenterImpl @Inject constructor(private var router: MainActivityRouter) :
    BasePresenter(), MainActivityPresenter {
    override lateinit var view: MainActivityView
    private lateinit var routerToolBoxWeak: WeakReference<RouterToolbox>

    override fun onFinishInflate(toolbox: RouterToolbox) {
        routerToolBoxWeak = WeakReference(toolbox)
        router.setToolsForRouting(toolbox)
    }

    override fun onViewCreated(view: MainActivityView, isActivityCreatedAtTheFirstTime: Boolean) {
        this.view = view
        if (isActivityCreatedAtTheFirstTime) router.openHome()
    }

    override fun onOptionHomeWasChosen() {
        router.openHome()
    }

    override fun onOptionExercisesWasChosen() {
        router.openExercises()
    }

    override fun onOptionTensesTableWasChosen() {
        router.openTensesTable()
    }
}