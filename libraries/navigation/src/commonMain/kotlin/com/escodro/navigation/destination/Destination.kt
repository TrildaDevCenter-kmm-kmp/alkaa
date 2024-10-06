package com.escodro.navigation.destination

import kotlinx.serialization.Serializable

sealed interface Destination {

    @Serializable
    data object Back : Destination

    @Serializable
    data object TaskList : Destination

    @Serializable
    data object Search : Destination

    @Serializable
    data object CategoryList : Destination

    @Serializable
    data object Preferences : Destination
}
