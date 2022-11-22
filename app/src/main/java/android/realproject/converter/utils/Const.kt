package android.realproject.converter.utils

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


object Const {
    object TextSize {
        val SMALL = 14.sp
        val NORMAL = 16.sp
        val LARGE = 20.sp
        val VERY_LARGE = 24.sp
    }

    object Padding {
        val SMALL = 5.dp
        val NORMAL = 10.dp
        val LARGE = 15.dp
        val VERY_LARGE = 20.dp
    }

    object RoundedCorner {
        val SMALL = RoundedCornerShape(5)
        val NORMAL = RoundedCornerShape(10)
        val LARGE = RoundedCornerShape(20)
        val VERY_LARGE = RoundedCornerShape(45)
    }

    object Gradient {
        val LieDetector = Brush.horizontalGradient(
            listOf(
                Color(0xFF2A5470),
                Color(0xFF4C4177)
            )
        )

        val NightClubVertical = Brush.verticalGradient(
            0.0f to Color(0xFF000000),
            0.2f to Color(0xFF2D3436),
            1.0f to Color(0xFF000000),

        )
        val NightClubVerticalResultFragment = Brush.verticalGradient(
            0.0f to Color(0xFF000000),
            0.4f to Color(0xFF2D3436),
            1.0f to Color(0xFF000000),
        )


        val FraudulentElectionVertical = Brush.verticalGradient(
            listOf(
                Color(0xFF0D324D),
                Color(0xFF7F5A83)
            )
        )
    }
}