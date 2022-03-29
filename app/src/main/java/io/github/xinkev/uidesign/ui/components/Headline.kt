package io.github.xinkev.uidesign.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import io.github.xinkev.uidesign.R

@Composable
fun Headline() {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        Text(
            text = "Furama Riverfront, Singapore",
            style = MaterialTheme.typography.h5,
            modifier = Modifier.weight(.8f)
        )
        Image(
            painter = painterResource(id = R.drawable.nextred),
            contentDescription = "Next red",
            modifier = Modifier
                .padding(start = 16.dp)
                .size(40.dp)
                .weight(.2f)
        )
    }
}