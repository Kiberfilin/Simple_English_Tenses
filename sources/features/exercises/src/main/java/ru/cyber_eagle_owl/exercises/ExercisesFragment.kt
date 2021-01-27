package ru.cyber_eagle_owl.exercises

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.cyber_eagle_owl.core_api.providers.AppWithFacade
import ru.cyber_eagle_owl.exercises.databinding.FragmentExercisesBinding
import ru.cyber_eagle_owl.exercises.di.ExercisesComponent
import ru.cyber_eagle_owl.exercises.viper.ExercisesViperContract
import ru.cyber_eagle_owl.viper_core.blueprints.BaseFragment
import timber.log.Timber
import javax.inject.Inject

class ExercisesFragment : BaseFragment<FragmentExercisesBinding>() {

    private var component: ExercisesComponent? = null

    @Inject
    lateinit var homeView: ExercisesViperContract.ExercisesView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Timber.d("onCreateView")
        prepareDagger()
        initViewBinding(FragmentExercisesBinding.inflate(inflater, container, false))
        homeView.apply {
            setVBinding(binding)
            onFinishInflate(getRouterToolbox())
        }
        return binding.root
    }

    private fun prepareDagger() {
        Timber.d("prepareDagger()")
        component = ExercisesComponent.create((activity?.application as AppWithFacade).getFacade())
        component!!.inject(this)
    }

    companion object {
        fun newInstance(): ExercisesFragment {
            Timber.d("newInstance()")
            return ExercisesFragment()
        }
    }
}