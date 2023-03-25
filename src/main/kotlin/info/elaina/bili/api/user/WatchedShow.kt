package info.elaina.bili.api.user

data class WatchedShow(
    val switch: Boolean,
    val num: Int,
    val text_small: String,
    val text_large: String,
    val icon: String,
    val icon_location: String,
    val icon_web: String
)