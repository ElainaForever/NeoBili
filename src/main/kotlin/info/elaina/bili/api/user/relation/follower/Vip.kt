package info.elaina.bili.api.user.relation.follower

data class Vip(
    val vipType: Int,
    val vipDueDate: Long,
    val dueRemark: String,
    val accessStatus: Int,
    val vipStatus: Int,
    val vipStatusWarn: String,
    val themeType: Int,
    val label: Label,
    val avatar_subscript: Int,
    val nickname_color: String,
    val avatar_subscript_url: String
)