import androidx.compose.ui.window.ComposeUIViewController
import org.koin.core.Koin

actual fun getPlatformName(): String = "iOS"

fun MainViewController(koin: Koin) = ComposeUIViewController { App(koin) }