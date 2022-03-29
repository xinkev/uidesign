package io.github.xinkev.uidesign.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import io.github.xinkev.uidesign.R

@Composable
fun Address() {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.Bottom
    ) {
        Text(text = "40S Havelock Road, Singapore 169633", modifier = Modifier.weight(.8f))
        Image(
            painter = painterResource(id = R.drawable.currentlocation),
            contentDescription = "Current Location",
            modifier = Modifier
                .padding(start = 16.dp)
                .size(32.dp)
                .weight(.2f)
        )
    }
}