import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import ui.localtimeline.LocalTimelineScreen

@Composable
fun App() {
    MaterialTheme {
        LocalTimelineScreen()
    }
}

expect fun getPlatformName(): String