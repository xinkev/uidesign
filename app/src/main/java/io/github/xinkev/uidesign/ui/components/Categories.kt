package io.github.xinkev.uidesign.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import io.github.xinkev.uidesign.R

@Composable
fun Categories(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        CategoryItem(text = "Amenities", icon = R.drawable.theme)
        CategoryItem(text = "Facilities", icon = R.drawable.workout)
        CategoryItem(text = "F&B", icon = R.drawable.fnb)
        CategoryItem(text = "Kids/Family", icon = R.drawable.workout)
        CategoryItem(text = "Wellness", icon = R.drawable.wellness)
    }
}