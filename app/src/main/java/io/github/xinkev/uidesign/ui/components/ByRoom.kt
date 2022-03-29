package io.github.xinkev.uidesign.ui.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ByRoom() {
    ByRoomItem(modifier = Modifier.padding(horizontal = 16.dp))
    Divider(thickness = 2.dp,modifier = Modifier.padding(horizontal = 16.dp))
    Spacer(modifier = Modifier.height(32.dp))
}