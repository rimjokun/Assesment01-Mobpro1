package org.d3if3032.assessment01.navigation

sealed class Screen(val route: String){
    data object Home: Screen("mainScreen")
    data object About: Screen("aboutScreen")
}