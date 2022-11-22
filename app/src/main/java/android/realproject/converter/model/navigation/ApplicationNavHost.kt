package android.realproject.converter.model.navigation

import android.realproject.converter.data.view_model.InputValueUserViewModel
import android.realproject.converter.data.view_model.ResultViewModel
import android.realproject.converter.ui.fragment.InputValueUserFragment
import android.realproject.converter.ui.fragment.ResultFragment
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun ApplicationNavHost(
    navController: NavHostController,
    inputValueUserViewModel: InputValueUserViewModel,
    resultViewModel: ResultViewModel
) {
    NavHost(navController = navController, startDestination = Screen.InputValueScreen.route ) {
        composable(Screen.InputValueScreen.route) {
            InputValueUserFragment(viewModel = inputValueUserViewModel)
        }

        composable("${Screen.ResultScreen.route}/{index}") {
            val index = it.arguments?.getString("index")!!
            ResultFragment(index = index.toInt(), viewModel = resultViewModel, inputValueUserViewModel)
        }
    }
}