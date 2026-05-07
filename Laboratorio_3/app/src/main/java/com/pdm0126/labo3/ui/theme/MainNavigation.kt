package com.pdm0126.labo3.ui.theme


import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.pdm0126.labo3.ui.theme.screens.Home
import com.pdm0126.labo3.ui.theme.screens.ListView
import com.pdm0126.labo3.ui.theme.screens.SensorsView


@Composable
fun MainNavigation() {

    val backStack = rememberNavBackStack(Routes.Home)


    NavDisplay(
        backStack = backStack,
        onBack = { backStack.removeLastOrNull() },

        entryProvider = entryProvider {

            entry<Routes.Home>{
                Home(
                    navigateToList = { backStack.add(Routes.listView)},
                    navigateToSensors = { backStack.add(Routes.SensorsView)}
                )
            }

            entry<Routes.listView>{
                ListView(
                    navigateToBack = { backStack.removeLastOrNull() }
                )
            }

            entry<Routes.SensorsView>{
                SensorsView(
                    navigateToBack = { backStack.removeLastOrNull() }
                )
            }





        },

        )
}