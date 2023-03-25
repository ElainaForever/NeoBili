package info.elaina.bili

import info.elaina.bili.utils.network.NetworkUtils


fun main() {
    val biliUser = NetworkUtils.getBiliUserByUID(1)
    println(biliUser.data.name)
}

