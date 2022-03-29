package io.github.xinkev.uidesign.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.skydoves.landscapist.glide.GlideImage
import io.github.xinkev.uidesign.ui.components.*
import io.github.xinkev.uidesign.ui.theme.UIDesignTheme

@ExperimentalPagerApi
@Composable
fun Screen() {
    var currentTab by rememberSaveable { mutableStateOf(TabItem.ByRoom) }
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Toolbar()
        Headline()
        Address()
        Spacer(modifier = Modifier.height(16.dp))
        Banners()
        Spacer(modifier = Modifier.height(32.dp))
        Categories(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
        )
        Spacer(modifier = Modifier.height(28.dp))
        Tabs(
            modifier = Modifier.padding(horizontal = 16.dp),
            selected = currentTab,
            onSelect = { currentTab = it }
        )
        Spacer(modifier = Modifier.height(16.dp))
        if (currentTab == TabItem.ByRoom) {
            ByRoom()
        } else {

        }
    }
}

@ExperimentalPagerApi
@Preview(showSystemUi = true)
@Composable
fun PreviewScreen() {
    UIDesignTheme {
        Screen()
    }
}