package ru.cybereagleowl.sources.features.main_activity_module.viper.presentation

import android.content.Context
import android.widget.Toast
import ru.cybereagleowl.sources.features.main_activity_module.viper.MainActivityViperContract.*
import ru.cyber_eagle_owl.viper_core.blueprints.viper_parts.BaseView
import ru.cyber_eagle_owl.viper_core.wrappers.RouterToolbox
import ru.cybereagleowl.sources.features.main_activity_module.R
import ru.cybereagleowl.sources.features.main_activity_module.databinding.ActivityMainBinding
import timber.log.Timber
import java.lang.ref.WeakReference
import javax.inject.Inject

class MainActivityViewImpl @Inject constructor() :
    BaseView<MainActivityPresenter, ActivityMainBinding>(),
    MainActivityView {
    private var backPressed: Long = 0
    private var currentToast: Toast? = null
    private lateinit var contextWeak: WeakReference<Context>
    private var isActivityCreatedAtTheFirstTime: Boolean = true
    override fun onFinishInflate(toolbox: RouterToolbox, isActivityCreatedAtTheFirstTime: Boolean) {
        Timber.d("onFinishInflate")
        contextWeak = WeakReference(toolbox.activityContext())
        this.isActivityCreatedAtTheFirstTime = isActivityCreatedAtTheFirstTime
        initViews()
        insetsHandling()
        presenter.apply {
            onFinishInflate(toolbox)
            onViewCreated(this@MainActivityViewImpl, isActivityCreatedAtTheFirstTime)
        }
    }

    private fun initViews() {
        Timber.d("initViews()")
        viewBinding.bottomNavigationBar.apply {
            if (isActivityCreatedAtTheFirstTime) {
                setItemSelected(R.id.home_bottom_navigation_item, true)
            }
            setOnItemSelectedListener { id ->
                when (id) {
                    R.id.home_bottom_navigation_item -> {
                        presenter.onOptionHomeWasChosen()
                    }
                    R.id.exercises_bottom_navigation_item -> {
                        presenter.onOptionExercisesWasChosen()
                    }
                    R.id.tenses_table_bottom_navigation_item -> {
                        presenter.onOptionTensesTableWasChosen()
                    }
                    else -> throw IllegalArgumentException("There are no such ID in bottom navigation menu")
                }
            }
        }
    }

    private fun insetsHandling() {
        Timber.d("insetsHandling()")
        //TODO
    }

    private fun showToast(toastText: String) {
        contextWeak.get()?.let {
            currentToast?.let {
                currentToast!!.cancel()
            }
            currentToast = Toast.makeText(it, toastText, Toast.LENGTH_LONG)
            currentToast?.show()
        }
    }

    override fun onBackPressed(defaultSuper: () -> Unit) {
        contextWeak.get()?.let {
            if (backPressed + 2000 > System.currentTimeMillis()) {
                currentToast?.let {
                    currentToast!!.cancel()
                }
                defaultSuper.invoke()
            } else showToast(
                it.getString(R.string.double_back_notify)
            )
            backPressed = System.currentTimeMillis()
        }
    }

    override fun onStop() {
        currentToast?.let {
            currentToast!!.cancel()
        }
    }
}