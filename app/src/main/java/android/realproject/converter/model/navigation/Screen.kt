package android.realproject.converter.model.navigation

sealed class Screen(val route: String) {
    object InputValueScreen: Screen("input_value")
    object ResultScreen: Screen("result_screen")
}
