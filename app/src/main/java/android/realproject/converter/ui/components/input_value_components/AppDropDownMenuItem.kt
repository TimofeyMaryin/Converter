package android.realproject.converter.ui.components.input_value_components

import android.realproject.converter.model.convertUnitType.Conversion
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign

@Composable
fun AppDropDownMenuItem(
    index: Int
) {
    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.CenterStart) {
        Text(text = Conversion.From.listConvert[index].title, modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)
        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.CenterStart) {
            Icon(painter = painterResource(id = Conversion.From.listConvert[index].icon), contentDescription = null)
        }
    }
}