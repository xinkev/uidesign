package io.github.xinkev.uidesign.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import io.github.xinkev.uidesign.R

@Composable
fun Toolbar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(
            imageVector = Icons.Default.ArrowBack,
            contentDescription = "Back button",
            tint = MaterialTheme.colors.primary
        )

        Row {
            Image(
                modifier = Modifier.size(28.dp),
                painter = painterResource(id = R.drawable.currency),
                contentDescription = "Currency icon"
            )
            Spacer(modifier = Modifier.width(16.dp))
            Image(
                modifier = Modifier.size(28.dp),
                painter = painterResource(id = R.drawable.chatactive),
                contentDescription = "Currency icon"
            )
        }
    }
}