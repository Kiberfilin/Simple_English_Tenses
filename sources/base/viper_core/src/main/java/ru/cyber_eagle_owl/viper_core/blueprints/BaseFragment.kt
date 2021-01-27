package ru.cyber_eagle_owl.viper_core.blueprints

import androidx.fragment.app.Fragment

import androidx.viewbinding.ViewBinding
import ru.cyber_eagle_owl.viper_core.wrappers.RouterToolbox
import ru.cyber_eagle_owl.viper_core.wrappers.RouterToolboxImpl

abstract class BaseFragment<VB : ViewBinding> : Fragment() {
    private var _binding: VB? = null

    // This property is only valid between onCreateView and
// onDestroyView.
    protected val binding get() = _binding!!
    private lateinit var routerToolbox: RouterToolbox

    protected fun getRouterToolbox(): RouterToolbox {
        if (!::routerToolbox.isInitialized) routerToolbox =
            RouterToolboxImpl(activity as BaseActivity)
        return routerToolbox
    }

    protected fun initViewBinding(viewBinding: VB) {
        _binding = viewBinding
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}