package android.realproject.converter.ui.fragment

import android.realproject.converter.data.view_model.InputValueUserViewModel
import android.realproject.converter.data.view_model.ResultViewModel
import android.realproject.converter.model.convertUnitType.Conversion
import android.realproject.converter.ui.components.result_components.ResultButton
import android.realproject.converter.ui.components.result_components.ResultContent
import android.realproject.converter.utils.Const
import androidx.compose.foundation.background
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
import androidx.constraintlayout.compose.ConstraintLayout
import kotlin.reflect.typeOf

@Composable
fun ResultFragment(
    index: Int,
    viewModel: ResultViewModel,
    inputValueUserViewModel: InputValueUserViewModel
) {

    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {
        val (content, buttonSave) = createRefs()
        ResultContent(
            index = index,
            viewModel = viewModel,
            inputValueUserViewModel = inputValueUserViewModel,
            modifier = Modifier.constrainAs(content) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }
        )

        ResultButton(
            onClick = { inputValueUserViewModel.popBackStack() },
            modifier = Modifier.constrainAs(buttonSave) {
                bottom.linkTo(parent.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            },
        )

    }

}