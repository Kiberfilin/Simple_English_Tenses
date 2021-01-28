package ru.cyber_eagle_owl.tenses_table.viper.presentation

import android.content.Context
import ru.cyber_eagle_owl.tenses_table.databinding.FragmentTensesTableBinding
import ru.cyber_eagle_owl.tenses_table.viper.TensesTableViperContract.*
import ru.cyber_eagle_owl.viper_core.blueprints.viper_parts.BaseView
import ru.cyber_eagle_owl.viper_core.wrappers.RouterToolbox
import timber.log.Timber
import java.lang.ref.WeakReference
import javax.inject.Inject

class TensesTableViewImpl @Inject constructor() : BaseView<TensesTablePresenter, FragmentTensesTableBinding>(),
    TensesTableView {
    private lateinit var contextWeak: WeakReference<Context>

    override fun onFinishInflate(toolbox: RouterToolbox) {
        Timber.d("onFinishInflate")
        contextWeak = WeakReference(toolbox.activityContext())
        initViews()
        insetsHandling()
        presenter.apply {
            onFinishInflate(toolbox)
            onViewCreated(this@TensesTableViewImpl)
        }
    }

    private fun initViews() {
        //TODO("Not yet implemented")
    }

    private fun insetsHandling() {
        //TODO("Not yet implemented")
    }
}