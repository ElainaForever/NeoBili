package info.elaina.bili

import info.elaina.bili.utils.network.NetworkUtils


fun main() {
    val biliUser = NetworkUtils.getBiliUserByUID(1)
    println(biliUser.data.name)
    val relation = NetworkUtils.getUserRelationByUID(1)
    println(relation.data.follower)
    val follower = NetworkUtils.getUserFollowersByUID(1)
    println(follower)
}

