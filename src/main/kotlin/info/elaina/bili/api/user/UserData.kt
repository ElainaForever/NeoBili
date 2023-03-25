package info.elaina.bili.api.user

data class UserData(
    val mid: Int,
    val name: String,
    val sex: String,
    val face: String,
    val face_nft: Int,
    val face_nft_type: Int,
    val sign: String,
    val rank: Int,
    val level: Int,
    val jointime: Int,
    val moral: Int,
    val silence: Int,
    val coins: Int,
    val fans_badge: Boolean,
    val fans_medal: FansMedal,
    val official: Official,
    val vip: Vip,
    val pendant: Pendant,
    val nameplate: Nameplate,
    val is_followed: Boolean,
    val top_photo: String,
    val theme: Theme,
    val sys_notice: SysNotice,
    val live_room: LiveRoom,
    val birthday: String,
    val school: School,
    val profession: Profession,
    val tags: Any?,
    val series: Series,
    val is_senior_member: Int,
    val mcn_info: Any?,
    val gaia_res_type: Int,
    val gaia_data: Any?,
    val is_risk: Boolean,
    val elec: Elec,
    val contract: Contract
)