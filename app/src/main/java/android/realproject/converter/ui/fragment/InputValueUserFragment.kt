package android.realproject.converter.ui.fragment

import android.realproject.converter.data.view_model.InputValueUserViewModel
import android.realproject.converter.model.navigation.Screen
import android.realproject.converter.ui.components.input_value_components.AppDropDownMenu
import android.realproject.converter.ui.components.input_value_components.AppTextField
import android.realproject.converter.utils.Const
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun InputValueUserFragment(
    viewModel: InputValueUserViewModel
) {
    Box(
        modifier = Modifier
            .fillMaxSize().background(Const.Gradient.NightClubVertical),
        contentAlignment = Alignment.Center
    ) {

        Column(
            modifier = Modifier.fillMaxWidth(.85f),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Container {
                AppTextField(
                    value = viewModel.userValue,
                    onChangeValue = { viewModel.changeValue(it) },
                    label = "Введи числовое значние"
                )
            }
            Container { AppDropDownMenu(viewModel) }
            Container {
                if (viewModel.canUserCalculateData()) {
                    Button(
                        onClick = {
                            viewModel.changeValue(viewModel.validateDate(viewModel.userValue))
                            viewModel.navigate(Screen.ResultScreen.route, viewModel.unitTypeIndex)
                        },
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),
                        contentPadding = PaddingValues(),
                        modifier = Modifier.fillMaxWidth(),
                        shape = Const.RoundedCorner.LARGE
                    ) {
                        Box(
                            modifier = Modifier
                                .background(Const.Gradient.LieDetector)
                                .fillMaxWidth()
                                .wrapContentWidth()
                                .padding(vertical = Const.Padding.VERY_LARGE),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(text = "Вычислить")
                        }
                    }
                }

            }
        }

    }
}

@Composable
private fun Container(
    content: @Composable () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(Const.Padding.LARGE),
        contentAlignment = Alignment.Center
    ) {
        content()
    }
}