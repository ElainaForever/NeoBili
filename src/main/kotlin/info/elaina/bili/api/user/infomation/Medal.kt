package info.elaina.bili.api.user.infomation

data class Medal(
    val uid: Long,
    val target_id: Long,
    val medal_id: Int,
    val level: Int,
    val medal_name: String,
    val medal_color: Int,
    val intimacy: Int,
    val next_intimacy: Int,
    val day_limit: Int,
    val medal_color_start: Int,
    val medal_color_end: Int,
    val medal_color_border: Int,
    val is_lighted: Int,
    val light_status: Int,
    val wearing_status: Int,
    val score: Long
)