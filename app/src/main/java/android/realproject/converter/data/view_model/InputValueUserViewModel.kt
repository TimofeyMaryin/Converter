package android.realproject.converter.data.view_model

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController

class InputValueUserViewModel(
    private val navController: NavController
): ViewModel() {
    fun navigate(route: String, index: Int) { navController.navigate("$route/$index") }
    fun popBackStack() { navController.popBackStack() }

    var userValue by mutableStateOf("")
        private set
    var unitTypeIndex by mutableStateOf(-1)
        private set

    fun changeUnitTypeIndex(index: Int) = run { unitTypeIndex = index }
    fun changeValue(value:String) = run {
        if (value.length <= 5) {
            userValue = value
        }
    }
    fun canUserCalculateData(): Boolean {
        return userValue.isNotEmpty() && unitTypeIndex != -1
    }

    fun validateDate(value: String): String {
        var res = ""
        for (i in value.indices) {
            if (value[i].isDigit()) {
                res += value[i]
            }
        }

        return res
    }
}