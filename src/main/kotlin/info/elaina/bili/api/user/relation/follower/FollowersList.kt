package info.elaina.bili.api.user.relation.follower

data class FollowersList(
    val mid: Long,
    val attribute: Int,
    val mtime: Int,
    val tag: List<Any>,
    val special: Int,
    val contract_info: ContractInfo,
    val uname: String,
    val face: String,
    val sign: String,
    val face_nft: Int,
    val official_verify: OfficialVerify,
    val vip: Vip,
    val nft_icon: String,
    val rec_reason: String,
    val track_id: String
)