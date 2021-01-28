package ru.cyber_eagle_owl.tenses_table.viper.presentation

import ru.cyber_eagle_owl.tenses_table.viper.TensesTableViperContract.*
import ru.cyber_eagle_owl.viper_core.blueprints.viper_parts.BasePresenter
import ru.cyber_eagle_owl.viper_core.wrappers.RouterToolbox
import java.lang.ref.WeakReference
import javax.inject.Inject

class TensesTablePresenterImpl @Inject constructor(private var router: TensesTableRouter) : BasePresenter(),
    TensesTablePresenter {
    override lateinit var view: TensesTableView
    private lateinit var routerToolBoxWeak: WeakReference<RouterToolbox>

    override fun onFinishInflate(toolbox: RouterToolbox) {
        routerToolBoxWeak = WeakReference(toolbox)
        router.setToolsForRouting(toolbox)
    }

    override fun onViewCreated(view: TensesTableView) {
        this.view = view
    }
}