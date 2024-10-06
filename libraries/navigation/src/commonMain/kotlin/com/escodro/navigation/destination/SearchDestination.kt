package com.escodro.navigation.destination

import kotlinx.serialization.Serializable

internal object SearchDestination {

    @Serializable
    data object Home : Destination
}
