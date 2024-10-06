package com.escodro.navigation.event

import com.escodro.navigation.destination.Destination

sealed interface Event {

    fun nextDestination(): Destination

    data object OnBack : Event {
        override fun nextDestination(): Destination = Destination.Back
    }

    data object OnTaskListClick : Event {
        override fun nextDestination(): Destination = Destination.TaskList
    }

    data object OnSearchClick : Event {
        override fun nextDestination(): Destination = Destination.Search
    }

    data object OnCategoryListClick : Event {
        override fun nextDestination(): Destination = Destination.CategoryList
    }

    data object OnPreferencesClick : Event {
        override fun nextDestination(): Destination = Destination.Preferences
    }
}
