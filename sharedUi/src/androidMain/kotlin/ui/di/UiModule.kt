package ui.di

import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module
import ui.localtimeline.LocalTimelineScreenViewModel

actual val viewModelModule = module {
    viewModelOf(::LocalTimelineScreenViewModel)
}