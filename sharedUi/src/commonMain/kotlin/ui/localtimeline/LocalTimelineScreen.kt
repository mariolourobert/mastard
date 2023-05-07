package ui.localtimeline

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun LocalTimelineScreen(viewModel: LocalTimelineScreenViewModel) {
    val posts = viewModel.posts.collectAsState().value

    LazyColumn {
        items(posts) { post ->
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth().padding(all = 10.dp)
                ) {
                    Text(post.ownerDisplayName, fontWeight = FontWeight.Medium)
                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Text(post.content, fontWeight = FontWeight.Normal)
                }
                Divider()
            }
        }
    }
}