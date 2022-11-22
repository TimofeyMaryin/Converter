package android.realproject.converter.ui.components.input_value_components

import android.realproject.converter.data.view_model.InputValueUserViewModel
import android.realproject.converter.model.convertUnitType.Conversion
import android.realproject.converter.utils.Const
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun AppDropDownMenu(
    viewModel: InputValueUserViewModel
) {
    var expanded by remember { mutableStateOf(false) }
    val items = Conversion.From.listConvert
    var selectedIndex by remember { mutableStateOf(-1) }

    Box(
        modifier = Modifier
            .clip(Const.RoundedCorner.LARGE)
            .fillMaxWidth()
            .fillMaxHeight(.1f)
            .clickable { expanded = true }
            .background(Color.Transparent)
            .border(BorderStroke(1.dp, Const.Gradient.LieDetector), Const.RoundedCorner.LARGE)
            .wrapContentSize(Alignment.Center),
    ) {
        Text(
            text = if (selectedIndex == -1) "Выбери единицу измерения" else items[selectedIndex].title,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.CenterEnd) {
            Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription = null)
        }

        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            modifier = Modifier.fillMaxWidth()
        ) {
            items.forEachIndexed { index, s ->
                DropdownMenuItem(onClick = {
                    selectedIndex = index
                    expanded = false
                    viewModel.changeUnitTypeIndex(selectedIndex)
                }) {
                    AppDropDownMenuItem(index = index)
                }
            }
        }
    }
}