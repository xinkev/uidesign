package io.github.xinkev.uidesign.ui

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.skydoves.landscapist.glide.GlideImage
import io.github.xinkev.uidesign.ui.components.*
import io.github.xinkev.uidesign.ui.theme.UIDesignTheme

@Composable
fun Screen() {
    Column(Modifier.fillMaxSize()) {
        Toolbar()
        Headline()
        Address()
        Spacer(modifier = Modifier.height(16.dp))
        GlideImage(
            imageModel = "https://images.unsplash.com/photo-1648576975340-d40b5aef1bb4?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&dl=julia-koi-Dl9TURIRXb4-unsplash.jpg&w=640",
            modifier = Modifier.height(180.dp),
        )
        Spacer(modifier = Modifier.height(32.dp))
        Categories(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
        )
        Spacer(modifier = Modifier.height(28.dp))
        Tabs(
            modifier = Modifier.padding(horizontal = 16.dp),
            selected = TabItem.ByRoom,
            onSelect = { /*TODO*/ }
        )
        ByRoomItem()
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewScreen() {
    UIDesignTheme {
        Screen()
    }
}