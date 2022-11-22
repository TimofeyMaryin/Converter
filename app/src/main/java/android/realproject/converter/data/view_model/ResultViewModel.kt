package android.realproject.converter.data.view_model

import androidx.lifecycle.ViewModel
import java.math.RoundingMode
import java.text.DecimalFormat

class ResultViewModel: ViewModel() {

    private val formatDec = DecimalFormat("#.##").apply {
        roundingMode = RoundingMode.HALF_UP
    }

    fun calculateData(type: Int, index: Int, value: Int): String {
        return when(type) {
            0 -> { calculateTimeSec(index, value) }
            1 -> { calculateTimeMin(index, value) }
            2 -> { calculateTimeHour(index, value) }
            3 -> { calculateTimeDay(index, value) }
            4 -> { calculateLengthCm(index, value) }
            5 -> { calculateLengthM(index, value) }
            6 -> { calculateLengthKm(index, value) }
            7 -> { calculateLengthMile(index, value) }
            8 -> { calculateWeighCt(index, value) }
            9 -> { calculateWeighTon(index, value) }
            10 -> { calculateWeighKg(index, value) }
            11 -> { calculateWeighAmTon(index, value) }
            12 -> { calculateWeighPound(index, value) }
            13 -> { calculateWeighOunce(index, value) }
            else -> { "Иди нах" }
        }
    }

    private fun calculateWeighOunce(index: Int, value: Int): String {
        return when(index) {
            0 -> { formatDec.format(value.toFloat() * 141.7f).toString() }
            1 -> { formatDec.format(value.toFloat() / 35.274f).toString() }
            2 -> { formatDec.format(value.toFloat() * 28.35f) .toString()}
            3 -> { formatDec.format(value.toFloat() / 16f ).toString() }
            else -> { "Nun" }
        }
    }

    private fun calculateWeighPound(index: Int, value: Int): String {
        return when(index) {
            0 -> { formatDec.format(value.toFloat() * 2268f).toString() }
            1 -> { formatDec.format(value.toFloat() / 2.205f).toString() }
            2 -> { formatDec.format(value.toFloat() * 453.6f) .toString()}
            3 -> { formatDec.format(value.toFloat() / 14f ).toString() }
            4 -> { formatDec.format(value.toFloat() * 16f).toString() }
            else -> { "Nun" }
        }
    }

    private fun calculateWeighAmTon(index: Int, value: Int): String {
        return when(index) {
            0 -> { formatDec.format((value.toFloat() / 1.102f)).toString() }
            1 -> { formatDec.format((value.toFloat() * 907.2f)).toString() }
            2 -> { formatDec.format(value.toFloat() / 1.12f) .toString()}
            3 -> { formatDec.format(value.toFloat() * 142.9f ).toString() }
            4 -> { formatDec.format(value.toFloat() * 2000).toString() }
            else -> { "Nun" }
        }
    }

    private fun calculateWeighKg(index: Int, value: Int): String {
        return when(index) {
            0 -> { formatDec.format(value * 1000).toString() }
            1 -> { formatDec.format(value.toFloat() / 6.35f).toString() }
            2 -> { formatDec.format(value.toFloat() * 2.205f) .toString()}
            3 -> { formatDec.format(value.toFloat() * 35.274f).toString() }
            else -> { "Nun" }
        }
    }

    private fun calculateWeighTon(index: Int, value: Int): String {
        return when(index) {
            0 -> { formatDec.format(value * 1000).toString() }
            1 -> { formatDec.format(value.toFloat() / 1.016f).toString() }
            2 -> { formatDec.format(value.toFloat() * 1.102f) .toString()}
            3 -> { formatDec.format(value.toFloat() * 157.5 ).toString() }
            4 -> { formatDec.format(value.toFloat() * 2205).toString() }
            5 -> { formatDec.format(value.toFloat() * 35270 ).toString() }
            else -> { "Nun" }
        }
    }

    private fun calculateWeighCt(index: Int, value: Int): String {
        return when(index) {
            0 -> { formatDec.format(value.toFloat() / 5000f).toString() }
            1 -> { formatDec.format(value.toFloat() / 5).toString() }
            2 -> { formatDec.format(value.toFloat() * 200) .toString()}
            else -> { "Nun" }
        }
    }

    private fun calculateLengthMile(index: Int, value: Int): String {
        return when(index) {
            0 -> { formatDec.format(value * 1609).toString() }
            1 -> { formatDec.format(value.toFloat() * 1.609f).toString() }
            2 -> { formatDec.format(value.toFloat() / 1.609f) .toString()}
            3 -> { formatDec.format(value.toFloat() * 5280).toString() }
            4 -> { formatDec.format(value.toFloat() * 1760).toString() }
            else -> { "Nun" }
        }
    }

    private fun calculateLengthKm(index: Int, value: Int): String {
        return when(index) {
            0 -> { formatDec.format(value * 100000).toString() }
            1 -> { formatDec.format(value.toFloat() * 1000).toString() }
            2 -> { formatDec.format(value.toFloat() / 1.609f) .toString()}
            3 -> { formatDec.format(value.toFloat() * 3281).toString() }
            4 -> { formatDec.format(value.toFloat() * 1094).toString() }
            else -> { "Nun" }
        }
    }

    private fun calculateLengthM(index: Int, value: Int): String {
        return when(index) {
            0 -> { formatDec.format(value * 1000f).toString() }
            1 -> { formatDec.format(value * 100f).toString() }
            2 -> { formatDec.format(value.toFloat() * .001f) .toString()}
            3 -> { formatDec.format(value.toFloat() / (1609f)).toString() }
            4 -> { formatDec.format(value.toFloat() * 3.281f).toString() }
            5 -> { formatDec.format(value.toFloat() * 39.37f).toString() }
            else -> { "Nun" }
        }
    }

    private fun calculateLengthCm(index: Int, value: Int): String {
        return when(index) {
            0 -> { formatDec.format(value * 10).toString() }
            1 -> { formatDec.format(value.toFloat() * .01f).toString() }
            2 -> { formatDec.format(value.toFloat() * .001f) .toString()}
            else -> { "Nun" }
        }
    }

    private fun calculateTimeDay(index: Int, value: Int): String {
        return when(index) {
            0 -> { formatDec.format(value * 24 * 60).toString() }
            1 -> { formatDec.format(value * 24f).toString() }
            2 -> { formatDec.format(value.toFloat() / 7f) .toString()}
            else -> { "Nun" }
        }
    }

    private fun calculateTimeHour(index: Int, value: Int): String {
        return when(index) {
            0 -> { formatDec.format(value * 3600).toString() }
            1 -> { formatDec.format(value * 60f).toString() }
            2 -> { formatDec.format(value.toFloat() / 24f) .toString()}
            3 -> { formatDec.format(value.toFloat() / (24f*7f)).toString() }
            else -> { "Nun" }
        }
    }

    private fun calculateTimeMin(index: Int, value: Int): String {
        return when(index) {
            0 -> { formatDec.format(value * 1000 * 60).toString() }
            1 -> { formatDec.format(value * 60f).toString() }
            2 -> { formatDec.format(value.toFloat() / 60f) .toString()}
            3 -> { formatDec.format(value.toFloat() / (60f*24f)).toString() }
            else -> { "Nun" }
        }
    }

    private fun calculateTimeSec(index: Int, value: Int): String {
        return when(index) {
            0 -> { formatDec.format(value * 1000).toString() }
            1 -> { formatDec.format(value * .06f).toString() }
            2 -> { formatDec.format(value.toFloat() / 3600f) .toString()}
            else -> { "Nun" }
        }
    }

}