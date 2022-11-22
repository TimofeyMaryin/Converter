package android.realproject.converter.ui.components.input_value_components

import android.realproject.converter.R
import android.realproject.converter.utils.Const
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@Composable
fun AppTextField(
    value: String,
    onChangeValue: (String) -> Unit,
    label: String,
) =
    TextField(
        value = value,
        onValueChange = {onChangeValue(it)},
        modifier = Modifier
            .fillMaxWidth()
            .border(
                BorderStroke(1.dp, Const.Gradient.LieDetector),
                Const.RoundedCorner.LARGE
            ),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        label = { Text(text = label) },
        trailingIcon = { Icon(painter = painterResource(id = R.drawable.ic_tf_trailing), contentDescription = null) },
        singleLine = true,
        shape = Const.RoundedCorner.LARGE,
        colors = TextFieldDefaults.textFieldColors(
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent,
            backgroundColor = Color.Transparent,
            disabledTrailingIconColor = Color.White,
            trailingIconColor = Color.White
        ),
    )