package ru.cyber_eagle_owl.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.cyber_eagle_owl.core_api.providers.AppWithFacade
import ru.cyber_eagle_owl.home.databinding.FragmentHomeBinding
import ru.cyber_eagle_owl.home.di.HomeComponent
import ru.cyber_eagle_owl.home.viper.HomeViperContract.HomeView
import ru.cyber_eagle_owl.viper_core.blueprints.BaseFragment
import timber.log.Timber
import javax.inject.Inject

class HomeFragment : BaseFragment() {
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
// onDestroyView.
    private val binding get() = _binding!!
    private var component: HomeComponent? = null

    @Inject
    lateinit var homeView: HomeView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Timber.d("onCreateView")
        prepareDagger()
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        homeView.apply {
            setVBinding(binding)
            onFinishInflate(getRouterToolbox())
        }
        return binding.root
    }

    private fun prepareDagger() {
        Timber.d("prepareDagger()")
        component = HomeComponent.create((activity?.application as AppWithFacade).getFacade())
        component!!.inject(this)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        fun newInstance(): HomeFragment {
            Timber.d("newInstance()")
            return HomeFragment()
        }
    }
}