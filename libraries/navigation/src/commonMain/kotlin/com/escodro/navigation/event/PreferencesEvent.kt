package com.escodro.navigation.event

import com.escodro.navigation.destination.Destination
import com.escodro.navigation.destination.PreferenceDestination

object PreferencesEvent {

    data object OnAboutClick : Event {
        override fun nextDestination(): Destination = PreferenceDestination.About
    }

    data object OnLicensesClick : Event {
        override fun nextDestination(): Destination = PreferenceDestination.Licenses
    }

    data object Tracker : Event {
        override fun nextDestination(): Destination = PreferenceDestination.Tracker
    }
}
