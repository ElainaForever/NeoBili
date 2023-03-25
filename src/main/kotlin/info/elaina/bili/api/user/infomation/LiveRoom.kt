package info.elaina.bili.api.user.infomation

data class LiveRoom(
    val roomStatus: Int,
    val liveStatus: Int,
    val url: String,
    val title: String,
    val cover: String,
    val roomid: Int,
    val roundStatus: Int,
    val broadcast_type: Int,
    val watched_show: info.elaina.bili.api.user.infomation.WatchedShow
)