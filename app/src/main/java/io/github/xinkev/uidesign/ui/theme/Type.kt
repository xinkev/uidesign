package io.github.xinkev.uidesign.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import io.github.xinkev.uidesign.R

val Typography = Typography(
    defaultFontFamily = FontFamily(
        Font(R.font.encode_sans_semi_condensed_black, FontWeight.Black),
        Font(R.font.encode_sans_semi_condensed_bold, FontWeight.SemiBold),
        Font(R.font.encode_sans_semi_condensed_bold, FontWeight.Bold),
        Font(R.font.encode_sans_semi_condensed_extra_bold, FontWeight.ExtraBold),
        Font(R.font.encode_sans_semi_condensed_thin, FontWeight.Thin),
        Font(R.font.encode_sans_semi_condensed_medium, FontWeight.Medium),
        Font(R.font.encode_sans_semi_condensed_light, FontWeight.Light),
        Font(R.font.encode_sans_semi_condensed_extra_light, FontWeight.ExtraLight),
        Font(R.font.encode_sans_semi_condensed_regular, FontWeight.Normal),
    ),
    h5 = TextStyle(
        fontWeight = FontWeight.SemiBold,
        letterSpacing = .5.sp,
        fontSize = 23.sp
    )
)
