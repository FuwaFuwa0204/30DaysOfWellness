package com.example.wellnessapp.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Wellness(
    @StringRes val day : Int,
    @StringRes val day_title :Int,
    @StringRes val day_content: Int,
    @DrawableRes val day_image: Int
)
