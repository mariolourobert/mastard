package ui.di

import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module
import ui.localtimeline.LocalTimelineScreenViewModel

actual val viewModelModule = module {
    factoryOf(::LocalTimelineScreenViewModel)
}