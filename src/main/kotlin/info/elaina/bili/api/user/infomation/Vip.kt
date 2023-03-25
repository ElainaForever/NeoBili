package info.elaina.bili.api.user.infomation

data class Vip(
    val type: Int,
    val status: Int,
    val due_date: Long,
    val vip_pay_type: Int,
    val theme_type: Int,
    val label: info.elaina.bili.api.user.infomation.Label,
    val avatar_subscript: Int,
    val nickname_color: String,
    val role: Int,
    val avatar_subscript_url: String,
    val tv_vip_status: Int,
    val tv_vip_pay_type: Int
)