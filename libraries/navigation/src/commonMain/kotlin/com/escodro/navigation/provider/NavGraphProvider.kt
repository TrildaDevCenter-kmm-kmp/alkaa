package com.escodro.navigation.provider

import androidx.navigation.NavGraphBuilder
import com.escodro.navigation.controller.NavEventController

internal class NavGraphProvider(
    private val navEventController: NavEventController,
    private val graphs: List<Graph>,
) {

    val navigationGraph: NavGraphBuilder.() -> Unit = {
        graphs.forEach { graph ->
            graph.navGraph(this, navEventController)
        }
    }
}
