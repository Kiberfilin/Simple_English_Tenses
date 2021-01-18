package ru.cyber_eagle_owl.ui_core

import android.view.View
import dev.chrisbanes.insetter.applySystemWindowInsetsToPadding
import dev.chrisbanes.insetter.setEdgeToEdgeSystemUiFlags
import timber.log.Timber

fun View.prepareScreen() {
    Timber.d("0=={=========>View.prepareScreen()")
    this.setEdgeToEdgeSystemUiFlags(true)
}

fun View.handleLeftRightTopInsets() {
    Timber.d("0=={=========>View.handleLeftRightTopInsets()")
    this.applySystemWindowInsetsToPadding(
        left = true,
        right = true,
        top = true,
        consume = false
    )
}

fun View.handleBottomInsets() {
    Timber.d("0=={=========>View.handleBottomInsets()")
    this.applySystemWindowInsetsToPadding(
        bottom = true,
        consume = true
    )
}

fun View.handleAllInsets() {
    Timber.d("0=={=========>View.handleAllInsets()")
    this.applySystemWindowInsetsToPadding(
        left = true,
        right = true,
        top = true,
        bottom = true,
        consume = true
    )
}

