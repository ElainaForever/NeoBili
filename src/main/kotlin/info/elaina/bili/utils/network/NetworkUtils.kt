package info.elaina.bili.utils.network

import com.google.gson.Gson
import info.elaina.bili.api.user.relation.Relation
import info.elaina.bili.api.user.infomation.BiliUser
import info.elaina.bili.api.user.nav.NavLogin
import info.elaina.bili.api.user.relation.follower.Followers
import info.elaina.bili.exception.relation.PageOutOfRangeException
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response

class NetworkUtils {

    companion object {
        fun getBiliUserByUID(uid: Int): info.elaina.bili.api.user.infomation.BiliUser {
            val response = HttpUtils.get("https://api.bilibili.com/x/space/acc/info?mid=$uid")
            val gson = Gson()
            return gson.fromJson(response, info.elaina.bili.api.user.infomation.BiliUser::class.java)
        }

        fun getUserRelationByUID(uid: Int): Relation {
            val response = HttpUtils.get("https://api.bilibili.com/x/relation/stat?vmid=$uid")
            val gson = Gson()
            return gson.fromJson(response, Relation::class.java)
        }

        fun getUserFollowersByUID(uid: Int, show: Int = 50, page: Int = 1): Followers {
            if (page > 5) {
                throw PageOutOfRangeException("Page number cannot be greater than 5")
            }
            val response = HttpUtils.get("https://api.bilibili.com/x/relation/followers?vmid=$uid&ps=$show&pn=$page")
            val gson = Gson()
            return gson.fromJson(response, Followers::class.java)
        }

        fun getUserDataByToken(token: String): NavLogin {
            val response = HttpUtils.get("https://api.bilibili.com/nav?SESSDATA=$token", token)
            val gson = Gson()
            return gson.fromJson(response, NavLogin::class.java)
        }
    }

}