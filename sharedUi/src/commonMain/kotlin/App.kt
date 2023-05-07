import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import org.koin.core.Koin
import ui.localtimeline.LocalTimelineScreen

@Composable
fun App(koin: Koin) {
    MaterialTheme {
        LocalTimelineScreen(viewModel = koin.get())
    }
}

expect fun getPlatformName(): String