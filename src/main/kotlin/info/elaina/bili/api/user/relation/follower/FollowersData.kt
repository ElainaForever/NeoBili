package info.elaina.bili.api.user.relation.follower

data class FollowersData(
    val list: List<FollowersList>,
    val re_version: Int,
    val total: Int
)