package com.example.wellnessapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.wellnessapp.R

// Set of Material typography styles to start with
val SrirachaRegular = FontFamily(
    Font(R.font.sriracha_regular)
)

val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = SrirachaRegular,
        fontWeight = FontWeight.Normal,
        fontSize = 30.sp
    ),
    displayMedium = TextStyle(
        fontFamily = SrirachaRegular,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    ),
    displaySmall = TextStyle(
        fontFamily = SrirachaRegular,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = SrirachaRegular,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    )
)