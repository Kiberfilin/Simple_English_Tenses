package ru.cyber_eagle_owl.exercises.viper.presentation

import android.content.Context
import ru.cyber_eagle_owl.exercises.databinding.FragmentExercisesBinding
import ru.cyber_eagle_owl.exercises.viper.ExercisesViperContract.*
import ru.cyber_eagle_owl.viper_core.blueprints.viper_parts.BaseView
import ru.cyber_eagle_owl.viper_core.wrappers.RouterToolbox
import timber.log.Timber
import java.lang.ref.WeakReference
import javax.inject.Inject

class ExercisesViewImpl @Inject constructor() : BaseView<ExercisesPresenter, FragmentExercisesBinding>(),
    ExercisesView {
    private lateinit var contextWeak: WeakReference<Context>

    override fun onFinishInflate(toolbox: RouterToolbox) {
        Timber.d("onFinishInflate")
        contextWeak = WeakReference(toolbox.activityContext())
        initViews()
        insetsHandling()
        presenter.apply {
            onFinishInflate(toolbox)
            onViewCreated(this@ExercisesViewImpl)
        }
    }

    private fun initViews() {
        //TODO("Not yet implemented")
    }

    private fun insetsHandling() {
        //TODO("Not yet implemented")
    }
}
