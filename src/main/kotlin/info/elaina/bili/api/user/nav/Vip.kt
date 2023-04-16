package info.elaina.bili.api.user.nav

data class Vip(
    val type: Int,
    val status: Int,
    val dueDate: Long,
    val vipPayType: Int,
    val themeType: Int,
    val label: Label,
    val avatarSubscript: Int,
    val nicknameColor: String,
    val role: Int,
    val avatarSubscriptUrl: String,
    val tvVipStatus: Int,
    val tvVipPayType: Int
)
