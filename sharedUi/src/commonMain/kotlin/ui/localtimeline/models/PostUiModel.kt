package ui.localtimeline.models

data class PostUiModel(
    val formattedCreatedAt: String,
    val repliesCount: Int,
    val reblogsCount: Int,
    val favouritesCount: Int,
    val content: String,
    val ownerDisplayName: String,
    val ownerAvatarUrl: String,
)
