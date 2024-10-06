package com.escodro.navigation.provider

import androidx.navigation.NavGraphBuilder
import com.escodro.navigation.controller.NavEventController

interface Graph {

    val navGraph: NavGraphBuilder.(NavEventController) -> Unit
}
