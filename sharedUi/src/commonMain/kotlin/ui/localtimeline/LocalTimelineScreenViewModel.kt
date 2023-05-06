package ui.localtimeline

import com.rickclephas.kmm.viewmodel.KMMViewModel
import com.rickclephas.kmm.viewmodel.coroutineScope
import com.rickclephas.kmp.nativecoroutines.NativeCoroutinesState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import ui.localtimeline.models.PostUiModel

class LocalTimelineScreenViewModel : KMMViewModel() {

    @NativeCoroutinesState
    val posts: StateFlow<List<PostUiModel>>
        get() = _posts

    private val _posts = MutableStateFlow<List<PostUiModel>>(emptyList())

    init {
        viewModelScope.coroutineScope.launch {
            _posts.emit(List(30) {
                PostUiModel(
                    formattedCreatedAt = "1 d.",
                    repliesCount = 1,
                    reblogsCount = 0,
                    favouritesCount = 9,
                    content = "Transformer provides easy-to-use, reliable and efficient API for converting media files between formats and applying editing operations. Learn more about the API from this post",
                    ownerDisplayName = "Toto",
                    ownerAvatarUrl = "https://spin.atomicobject.com/wp-content/uploads/kotlin.png",
                )
            })
        }
    }
}