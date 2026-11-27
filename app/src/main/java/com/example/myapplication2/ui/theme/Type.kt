package com.example.myapplication2.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// Set of Material typography styles to start with
val Typography = Typography(
    // Style untuk teks berukuran besar
    headlineMedium = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Bold,
        fontSize = 28.sp,
        LineHeight = 36.sp,
        LetterSpacing = (-0.5).sp),

// Style untuk judul di dalam Card atau TopAppBar
        titleLarge = TextStyle(
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight. SemiBold,
            fontSize = 22.sp,
            LineHeight = 28.sp,
            LetterSpacing = 0.sp),

// Style untuk teks paragraf utama
        bodyLarge = TextStyle(
            fontFamily = FontFamily. SansSerif,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp,
            LineHeight = 24.sp,
            LetterSpacing =0.5.sp),

    // Style untuk teks paragraf sekunder
    bodyMedium = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        LetterSpacing = 0.25.sp),

// Style untuk teks berukuran kecil seperti di dalam Button atau label input
        LabelLarge = TextStyle(
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Medium,
            fontSize = 14.sp,
            LineHeight = 20.sp,
            letterSpacing = 0.1.sp

    )
)