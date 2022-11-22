package android.realproject.converter.ui.components.result_components

import android.realproject.converter.ui.theme.BgButton
import android.realproject.converter.utils.Const
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun ResultButton(
    onClick: () -> Unit,
    modifier: Modifier
) =
    Button(
        onClick = { onClick() },
        modifier = Modifier
            .fillMaxWidth()
            .then(modifier),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = BgButton
        )
    ) {
        Text(text = "Назад", fontSize = Const.TextSize.NORMAL, color = Color.White)
    }