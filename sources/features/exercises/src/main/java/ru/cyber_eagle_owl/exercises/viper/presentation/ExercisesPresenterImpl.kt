package ru.cyber_eagle_owl.exercises.viper.presentation

import ru.cyber_eagle_owl.exercises.viper.ExercisesViperContract.*
import ru.cyber_eagle_owl.viper_core.blueprints.viper_parts.BasePresenter
import ru.cyber_eagle_owl.viper_core.wrappers.RouterToolbox
import java.lang.ref.WeakReference
import javax.inject.Inject

class ExercisesPresenterImpl @Inject constructor(private var router: ExercisesRouter) : BasePresenter(),
    ExercisesPresenter {
    override lateinit var view: ExercisesView
    private lateinit var routerToolBoxWeak: WeakReference<RouterToolbox>

    override fun onFinishInflate(toolbox: RouterToolbox) {
        routerToolBoxWeak = WeakReference(toolbox)
        router.setToolsForRouting(toolbox)
    }

    override fun onViewCreated(view: ExercisesView) {
        this.view = view
    }
}