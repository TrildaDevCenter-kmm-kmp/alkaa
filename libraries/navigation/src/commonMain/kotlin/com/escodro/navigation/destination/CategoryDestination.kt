package com.escodro.navigation.destination

import kotlinx.serialization.Serializable

internal object CategoryDestination {

    @Serializable
    data object Home : Destination

    @Serializable
    data class CategoryBottomSheet(val categoryId: Long?) : Destination
}
