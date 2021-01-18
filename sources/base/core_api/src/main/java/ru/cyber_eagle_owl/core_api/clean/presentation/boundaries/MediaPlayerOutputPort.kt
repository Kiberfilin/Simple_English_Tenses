package ru.cyber_eagle_owl.core_api.clean.presentation.boundaries

import android.view.View
import ru.cyber_eagle_owl.core_api.clean.domain.entities.presentation.MediaPlayerItem

interface MediaPlayerOutputPort {
    fun onStart(view: View, onNextStreamLambda: (String) -> Unit)
    fun onResume(onNextStreamLambda: (String) -> Unit)
    fun onPause()
    fun onStop()
    fun setPlayList(items: List<MediaPlayerItem>)
}