package com.example.wellnessapp.ui.theme

import Shapes
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable


private val DarkColorPalette = darkColorScheme(
    background = Cyan700,
    surface = Cyan900,
    onSurface = Grey100,
    primary = Grey50,
    onPrimary = Cyan900,
    secondary = Grey700
)

private val LightColorPalette = lightColorScheme(
    background = Green100,
    surface = Green50,
    onSurface = Grey900,
    primary = Grey50,
    onPrimary = Grey900,
    secondary = Grey700
)

@Composable
fun WellnessAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    content: @Composable () -> Unit
) {

    val colorScheme = if(darkTheme) DarkColorPalette else LightColorPalette

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}