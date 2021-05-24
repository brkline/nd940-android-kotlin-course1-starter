package com.udacity.shoestore.utilities

import androidx.databinding.InverseMethod

// Code below based on information found here:
// https://developer.android.com/topic/libraries/data-binding/two-way#converters
object Converters {
    @InverseMethod("stringToDouble")
    @JvmStatic
    fun doubleToString(value: Double): String {
        return value.toString()
    }

    @JvmStatic
    fun stringToDouble(value: String): Double {
        return value.toDoubleOrNull() ?: 0.0
    }
}