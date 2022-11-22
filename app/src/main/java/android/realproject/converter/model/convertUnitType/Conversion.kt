package android.realproject.converter.model.convertUnitType

import android.realproject.converter.R

object Conversion {
    object From {
        val listConvert = mutableListOf(
            // время
            ConvertFromData("Секунда", R.drawable.ic_convert_time, To.convertToDataSec),
            ConvertFromData("Минута", R.drawable.ic_convert_to_time, To.convertToDataMin),
            ConvertFromData("Час", R.drawable.ic_convert_time, To.convertToDataHour),
            ConvertFromData("Сутки", R.drawable.ic_convert_to_time, To.convertToDataDay),

            // длинна
            ConvertFromData("Сантиметр", R.drawable.ic_foot, To.convertToDataCm),
            ConvertFromData("Метр", R.drawable.ic_convert_length, To.convertToDataM),
            ConvertFromData("Киллометр", R.drawable.ic_foot, To.convertToDataKm),
            ConvertFromData("Миля", R.drawable.ic_convert_length, To.convertToDataMile),

            // вес
            ConvertFromData("Карат", R.drawable.ic_anchor, To.convertToDataCarat),
            ConvertFromData("Тонна", R.drawable.ic_convert_weight, To.convertToDataTonn),
            ConvertFromData("Киллограм", R.drawable.ic_convert_weight, To.convertToDataKg),
            ConvertFromData("Американская тонна", R.drawable.ic_anchor, To.convertToDataAmerTon),
            ConvertFromData("Фунт", R.drawable.ic_convert_weight, To.convertToDataPound),
            ConvertFromData("Унция", R.drawable.ic_anchor, To.convertToDataOunce),
        )
    }

    object To {
        val convertToDataSec = mutableListOf(
            ConvertToData("Миллисекнуда", R.drawable.ic_convert_to_time),
            ConvertToData("Минут", R.drawable.ic_convert_to_time),
            ConvertToData("Час", R.drawable.ic_convert_to_time),
        )
        val convertToDataMin = mutableListOf(
            ConvertToData("Миллисекнуд", R.drawable.ic_convert_to_time),
            ConvertToData("Секунд", R.drawable.ic_convert_to_time),
            ConvertToData("Час", R.drawable.ic_convert_to_time),
            ConvertToData("Сутки", R.drawable.ic_convert_to_time),
        )
        val convertToDataHour = mutableListOf(
            ConvertToData("Секунд", R.drawable.ic_convert_to_time),
            ConvertToData("Минут", R.drawable.ic_convert_to_time),
            ConvertToData("Сутки", R.drawable.ic_convert_to_time),
            ConvertToData("Неделя", R.drawable.ic_convert_to_time),
        )
        val convertToDataDay = mutableListOf(
             ConvertToData("Минут", R.drawable.ic_convert_to_time),
             ConvertToData("Час", R.drawable.ic_convert_to_time),
             ConvertToData("Неделя", R.drawable.ic_convert_to_time),
         )

        val convertToDataCm = mutableListOf(
            ConvertToData("Миллиметров", R.drawable.ic_convert_to_length),
            ConvertToData("Метр", R.drawable.ic_convert_to_length),
            ConvertToData("Киллометр", R.drawable.ic_convert_to_length),
        )
        val convertToDataM = mutableListOf(
            ConvertToData("Миллиметров", R.drawable.ic_convert_to_length),
            ConvertToData("Сантиметр", R.drawable.ic_convert_to_length),
            ConvertToData("Киллометр", R.drawable.ic_convert_to_length),
            ConvertToData("Мил", R.drawable.ic_convert_to_length),
            ConvertToData("Фут", R.drawable.ic_convert_to_length),
            ConvertToData("Дюйм", R.drawable.ic_convert_to_length),
        )
        val convertToDataKm = mutableListOf(
            ConvertToData("Сантиметр", R.drawable.ic_convert_to_length),
            ConvertToData("Метр", R.drawable.ic_convert_to_length),
            ConvertToData("Мил", R.drawable.ic_convert_to_length),
            ConvertToData("Фут", R.drawable.ic_convert_to_length),
            ConvertToData("Ярд", R.drawable.ic_convert_to_length),
        )
        val convertToDataMile = mutableListOf(
            ConvertToData("Метр", R.drawable.ic_convert_to_length),
            ConvertToData("Километры", R.drawable.ic_convert_to_length),
            ConvertToData("Фут", R.drawable.ic_convert_to_length),
            ConvertToData("Ярд", R.drawable.ic_convert_to_length),
        )

        val convertToDataCarat = mutableListOf(
            ConvertToData("Килограмм", R.drawable.ic_convert_to_weigth_carat),
            ConvertToData("Грамм", R.drawable.ic_convert_to_weigth_carat),
            ConvertToData("Миллиграмм", R.drawable.ic_convert_to_weigth_carat),
        )
        val convertToDataTonn = mutableListOf(
            ConvertToData("Килограмм", R.drawable.ic_convert_to_weigth),
            ConvertToData("Английская тонна", R.drawable.ic_convert_to_weigth),
            ConvertToData("Американская тонна", R.drawable.ic_convert_to_weigth),
            ConvertToData("Стон", R.drawable.ic_convert_to_weigth),
            ConvertToData("Фунт", R.drawable.ic_convert_to_weigth),
            ConvertToData("Унция", R.drawable.ic_convert_to_weigth),
        )
        val convertToDataKg = mutableListOf(
            ConvertToData("Грамм", R.drawable.ic_convert_to_weigth),
            ConvertToData("Стон", R.drawable.ic_convert_to_weigth),
            ConvertToData("Фунт", R.drawable.ic_convert_to_weigth),
            ConvertToData("Унция", R.drawable.ic_convert_to_weigth),
        )
        val convertToDataAmerTon = mutableListOf(
            ConvertToData("Тона", R.drawable.ic_convert_to_weigth),
            ConvertToData("Килограмм", R.drawable.ic_convert_to_weigth),
            ConvertToData("Английская тонна", R.drawable.ic_convert_to_weigth),
            ConvertToData("Стон", R.drawable.ic_convert_to_weigth),
            ConvertToData("Фунт", R.drawable.ic_convert_to_weigth),
        )
        val convertToDataPound = mutableListOf( // Фунт
            ConvertToData("Карат", R.drawable.ic_convert_to_weigth),
            ConvertToData("Килограмм", R.drawable.ic_convert_to_weigth),
            ConvertToData("Грамм", R.drawable.ic_convert_to_weigth),
            ConvertToData("Стон", R.drawable.ic_convert_to_weigth),
            ConvertToData("Унция", R.drawable.ic_convert_to_weigth),
        )
        val convertToDataOunce = mutableListOf(
            ConvertToData("Карат", R.drawable.ic_convert_to_weigth),
            ConvertToData("Килограмм", R.drawable.ic_convert_to_weigth),
            ConvertToData("Грамм", R.drawable.ic_convert_to_weigth),
            ConvertToData("Фунт", R.drawable.ic_convert_to_weigth),
        )
    }
}