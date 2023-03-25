package info.elaina.bili.api.user.infomation

data class ShowInfo(
    val show: Boolean,
    val state: Int,
    val title: String,
    val icon: String,
    val jump_url: String
)