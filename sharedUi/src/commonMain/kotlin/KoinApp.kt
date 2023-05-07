import org.koin.core.Koin
import org.koin.core.context.startKoin
import ui.di.viewModelModule

fun initKoin(): Koin =
    startKoin {
        modules(viewModelModule)
    }.koin