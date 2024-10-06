package com.escodro.navigation.destination

import kotlinx.serialization.Serializable

internal object PreferenceDestination {

    @Serializable
    data object Home : Destination

    @Serializable
    data object About : Destination

    @Serializable
    data object Licenses : Destination

    @Serializable
    data object Tracker : Destination
}
