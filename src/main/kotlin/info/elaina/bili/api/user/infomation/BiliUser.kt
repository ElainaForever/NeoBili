package info.elaina.bili.api.user.infomation

data class BiliUser (
    val code: Int,
    val message: String,
    val ttl: Int,
    val data: UserData
)