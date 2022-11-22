package android.realproject.converter.model.convertUnitType

data class ConvertFromData(
    val title: String,
    val icon: Int,
    val listConvertTo: MutableList<ConvertToData>
)
