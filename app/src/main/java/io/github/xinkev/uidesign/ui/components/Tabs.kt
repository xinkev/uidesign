package io.github.xinkev.uidesign.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Tabs(
    modifier: Modifier = Modifier,
    selected: TabItem,
    onSelect: (TabItem) -> Unit
) {
    Row(
        modifier = modifier.then(Modifier.height(45.dp)),
    ) {
        Tab(
            label = "By Room",
            isSelected = selected == TabItem.ByRoom,
            onClick = { onSelect(TabItem.ByRoom) },
        )
        Tab(
            label = "By Rates",
            isSelected = TabItem.ByRates == selected,
            onClick = { onSelect(TabItem.ByRates) },
        )
    }
}

@Composable
fun RowScope.Tab(
    label: String,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    val backgroundColor = if (isSelected) {
        MaterialTheme.colors.secondary
    } else Color.White
    Box(
        modifier = Modifier
            .background(backgroundColor)
            .border(width = 2.dp, color = MaterialTheme.colors.secondary)
            .clickable(onClick = onClick)
            .fillMaxSize()
            .weight(0.5f),
        contentAlignment = Alignment.Center
    ) {
        Text(text = label)
    }
}

enum class TabItem {
    ByRoom, ByRates
}