package info.elaina.bili.api.user.relation.follower

data class Followers(
    val code: Int,
    val message: String,
    val ttl: Int,
    val data: FollowersData
)
