package io.github.xinkev.uidesign.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.skydoves.landscapist.glide.GlideImage

@Composable
fun ByRoomItem(modifier: Modifier = Modifier) {
    Column(modifier) {
        GlideImage(
            imageModel = "https://images.unsplash.com/photo-1648576975340-d40b5aef1bb4?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&dl=julia-koi-Dl9TURIRXb4-unsplash.jpg&w=640",
            modifier = Modifier.height(180.dp),
        )
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(Modifier.weight(.62f)) {
                Text(text = "Deluxe Twin", fontWeight = FontWeight.Black, fontSize = 20.sp)
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "Twin Single Bed, Cable TV, Free Wifi, Breakfast",
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 1,
                )
            }
            OutlinedButton(
                modifier = Modifier
                    .height(65.dp)
                    .weight(.38f),
                onClick = { /*TODO*/ },
                border = BorderStroke(width = 2.dp, color = MaterialTheme.colors.primary)
            ) {
                Text(text = "View Rates", fontSize = 18.sp)
            }
        }
        Spacer(modifier = Modifier.height(32.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Avg. Nightly / Room From",
                fontSize = 18.sp,
                letterSpacing = .1.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = buildAnnotatedString {
                    withStyle(SpanStyle(fontSize = 16.sp)) { append("SGD") }
                    withStyle(SpanStyle(fontSize = 30.sp)) { append("161.42") }
                },
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier.padding(bottom = 8.dp)
            )
        }
    }
}