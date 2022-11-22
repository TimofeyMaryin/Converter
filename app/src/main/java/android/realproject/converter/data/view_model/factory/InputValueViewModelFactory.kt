package android.realproject.converter.data.view_model.factory

import android.realproject.converter.data.view_model.InputValueUserViewModel
import android.realproject.converter.data.view_model.ResultViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController

@Suppress("UNCHECKED_CAST")
class InputValueViewModelFactory(
    private val navController: NavController
): ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return InputValueUserViewModel(navController = navController) as T
    }

}