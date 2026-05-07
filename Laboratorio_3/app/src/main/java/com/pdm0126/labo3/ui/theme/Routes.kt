package com.pdm0126.labo3.ui.theme

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

sealed class Routes : NavKey {

    @Serializable

    data object Home : Routes()

    @Serializable

    data object listView : Routes()

    @Serializable

    data object SensorsView : Routes()

}