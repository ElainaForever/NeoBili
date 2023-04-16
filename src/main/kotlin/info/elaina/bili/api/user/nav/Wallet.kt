package info.elaina.bili.api.user.nav

data class Wallet(
    val mid: Long,
    val bcoinBalance: Int,
    val couponBalance: Int,
    val couponDueTime: Long
)
