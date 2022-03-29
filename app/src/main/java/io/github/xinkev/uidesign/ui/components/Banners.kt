package io.github.xinkev.uidesign.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import com.skydoves.landscapist.glide.GlideImage

@ExperimentalPagerApi
@Composable
fun Banners() {
    val images = remember {
        listOf(
            "https://images.unsplash.com/photo-1648576975340-d40b5aef1bb4?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&dl=julia-koi-Dl9TURIRXb4-unsplash.jpg&w=640",
            "https://images.unsplash.com/photo-1648576975340-d40b5aef1bb4?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&dl=julia-koi-Dl9TURIRXb4-unsplash.jpg&w=640",
            "https://images.unsplash.com/photo-1648576975340-d40b5aef1bb4?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&dl=julia-koi-Dl9TURIRXb4-unsplash.jpg&w=640",
            "https://images.unsplash.com/photo-1648576975340-d40b5aef1bb4?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&dl=julia-koi-Dl9TURIRXb4-unsplash.jpg&w=640"
        )
    }
    val state = rememberPagerState()
    Box {
        HorizontalPager(
            count = images.size,
            state = state,
            modifier = Modifier.padding(16.dp),
            itemSpacing = 8.dp
        ) { page ->
            GlideImage(
                imageModel = images[page],
                modifier = Modifier
                    .height(210.dp),
            )
        }

        Box(
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(end = 8.dp)
                .background(Color(0xB2000000))
        ) {
            Text(
                text = "See All ${state.currentPage + 1}/${state.pageCount}",
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}