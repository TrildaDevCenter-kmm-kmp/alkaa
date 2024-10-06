package com.escodro.navigation.destination

import kotlinx.serialization.Serializable

internal object TasksDestination {

    @Serializable
    data object Home : Destination

    @Serializable
    data class TaskDetail(val taskId: Long) : Destination

    @Serializable
    data object AddTaskBottomSheet : Destination
}
