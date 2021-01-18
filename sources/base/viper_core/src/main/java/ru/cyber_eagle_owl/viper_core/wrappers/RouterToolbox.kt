package ru.cyber_eagle_owl.viper_core.wrappers

import android.content.Context
import androidx.fragment.app.FragmentManager

interface RouterToolbox {
    fun fragmentManager(): FragmentManager
    fun activityContext(): Context
}