package ru.cyber_eagle_owl.tenses_table

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.cyber_eagle_owl.core_api.providers.AppWithFacade
import ru.cyber_eagle_owl.tenses_table.databinding.FragmentTensesTableBinding
import ru.cyber_eagle_owl.tenses_table.di.TensesTableComponent
import ru.cyber_eagle_owl.tenses_table.viper.TensesTableViperContract.TensesTableView
import ru.cyber_eagle_owl.viper_core.blueprints.BaseFragment
import timber.log.Timber
import javax.inject.Inject

class TensesTableFragment : BaseFragment<FragmentTensesTableBinding>() {

    private var component: TensesTableComponent? = null

    @Inject
    lateinit var tensesTableView: TensesTableView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Timber.d("onCreateView")
        prepareDagger()
        initViewBinding(FragmentTensesTableBinding.inflate(inflater, container, false))
        tensesTableView.apply {
            setVBinding(binding)
            onFinishInflate(getRouterToolbox())
        }
        return binding.root
    }

    private fun prepareDagger() {
        Timber.d("prepareDagger()")
        component = TensesTableComponent.create((activity?.application as AppWithFacade).getFacade())
        component!!.inject(this)
    }

    companion object {
        fun newInstance(): TensesTableFragment {
            Timber.d("newInstance()")
            return TensesTableFragment()
        }
    }
}