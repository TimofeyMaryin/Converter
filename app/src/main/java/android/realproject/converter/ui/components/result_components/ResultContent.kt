package android.realproject.converter.ui.components.result_components

import android.realproject.converter.data.view_model.InputValueUserViewModel
import android.realproject.converter.data.view_model.ResultViewModel
import android.realproject.converter.model.convertUnitType.Conversion
import android.realproject.converter.utils.Const
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign

@Composable
fun ResultContent(
    index: Int,
    viewModel: ResultViewModel,
    inputValueUserViewModel: InputValueUserViewModel,
    modifier: Modifier
) {
    LazyColumn(modifier = Modifier.fillMaxWidth().then(modifier)) {
        item {
            Text(
                text = "${inputValueUserViewModel.userValue} ${Conversion.From.listConvert[index].title} - это ни что иное как:",
                fontSize = Const.TextSize.LARGE,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = Const.Padding.VERY_LARGE),
                textAlign = TextAlign.Center
            )
        }
        items(Conversion.From.listConvert[index].listConvertTo.size) {
            val currentText = Conversion.From.listConvert[index].listConvertTo
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = Const.Padding.LARGE),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Box(modifier = Modifier.weight(1f), contentAlignment = Alignment.CenterStart) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Start
                    ) {
                        Icon(painter = painterResource(id = Conversion.From.listConvert[index].icon), contentDescription = null)
                        Text(
                            text = viewModel
                                .calculateData(
                                    type = index,
                                    index = it,
                                    value = inputValueUserViewModel.userValue.toInt()
                                ),
                            fontSize = Const.TextSize.LARGE,
                            modifier = Modifier.padding(start = Const.Padding.LARGE)
                        )
                    }
                }
                Box(modifier = Modifier.weight(1f), contentAlignment = Alignment.CenterEnd) {
                    Text(
                        text = currentText[it].title,
                        modifier = Modifier.padding(vertical = Const.Padding.LARGE),
                        color = Color.Gray
                    )
                }
            }
        }
    }
}