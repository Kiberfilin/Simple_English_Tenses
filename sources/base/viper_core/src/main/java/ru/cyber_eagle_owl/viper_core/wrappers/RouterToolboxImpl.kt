package ru.cyber_eagle_owl.viper_core.wrappers

import android.content.Context
import ru.cyber_eagle_owl.viper_core.blueprints.BaseActivity

class RouterToolboxImpl(private val activity: BaseActivity):
    RouterToolbox {
    override fun fragmentManager() = activity.supportFragmentManager
    override fun activityContext(): Context = activity
}