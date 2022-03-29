package io.github.xinkev.uidesign.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.skydoves.landscapist.glide.GlideImage

@Composable
fun ByRoomItem(modifier: Modifier = Modifier) {
    Column(modifier) {
        GlideImage(
            imageModel = "https://images.unsplash.com/photo-1648576975340-d40b5aef1bb4?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&dl=julia-koi-Dl9TURIRXb4-unsplash.jpg&w=640",
            modifier = Modifier.height(180.dp),
        )

        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Column {
                Text(text = "Deluxe Twin", fontWeight = FontWeight.Black)
            }
        }
    }
}