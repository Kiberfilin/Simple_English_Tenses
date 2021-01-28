package ru.cyber_eagle_owl.tenses_table.viper

import ru.cyber_eagle_owl.tenses_table.databinding.FragmentTensesTableBinding
import ru.cyber_eagle_owl.viper_core.blueprints.viper_parts.contracts.ViperPresenter
import ru.cyber_eagle_owl.viper_core.blueprints.viper_parts.contracts.ViperRouter
import ru.cyber_eagle_owl.viper_core.blueprints.viper_parts.contracts.ViperView
import ru.cyber_eagle_owl.viper_core.wrappers.RouterToolbox

interface TensesTableViperContract {
    interface TensesTableView : ViperView<TensesTablePresenter, FragmentTensesTableBinding> {
        fun onFinishInflate(toolbox: RouterToolbox)
    }

    interface TensesTablePresenter : ViperPresenter {
        var view: TensesTableView
        fun onFinishInflate(toolbox: RouterToolbox)
        fun onViewCreated(view: TensesTableView)
    }

    interface TensesTableRouter : ViperRouter {

    }
}