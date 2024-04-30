package com.kolee.mycomposechatapp.ui.theme

import androidx.compose.material.Colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)

val RoyalBlue = Color(0xFF4169E1)
val LightBlack = Color(0xFF272727)

val OrangeColor = Color(0xFFFFAB00)
val SkyColor = Color(0xFF00B8D4)
val DarkOrangeColor = Color(0xFFFB8C00)

val ColorTest = Color(0xFFFB8C00)

val Colors.TopBarColor: Color
    @Composable get() = if (isLight) Color(0xFF4169E1) else Color(0xFF2B2B2B)
val Colors.TextDefaultColor: Color
    @Composable get() = if (isLight) Color(0xFF2B2B2B) else Color(0xFFCECECE)
val Colors.HintTextColor: Color
    @Composable get() = if (isLight) Color(0xFF737373) else Color(0xFFB7B6B6)
val Colors.IconColor: Color
    @Composable get() = if (isLight) Color(0xFF737373) else Color(0xFFB7B6B6)
val Colors.IconBorderColor: Color
    @Composable get() = if (isLight) Color(0xFFB6B6B6) else Color(0xFFCECECE)
val Colors.ErrorColor: Color
    @Composable get() = if (isLight) Color(0xFF9C1616) else Color(0xFF910505)
