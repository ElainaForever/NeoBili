package info.elaina.bili.utils.network

import com.google.gson.Gson
import info.elaina.bili.api.user.relation.Relation
import info.elaina.bili.api.user.infomation.BiliUser
import info.elaina.bili.api.user.relation.follower.Followers
import info.elaina.bili.exception.relation.PageOutOfRangeException
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response

class NetworkUtils {

    companion object {
        fun getBiliUserByUID(uid: Int): info.elaina.bili.api.user.infomation.BiliUser {
            val response = sendHttpRequest("https://api.bilibili.com/x/space/acc/info?mid=$uid")
            val gson = Gson()
            return gson.fromJson(response, info.elaina.bili.api.user.infomation.BiliUser::class.java)
        }

        fun getUserRelationByUID(uid: Int): Relation {
            val response = sendHttpRequest("https://api.bilibili.com/x/relation/stat?vmid=$uid")
            val gson = Gson()
            return gson.fromJson(response, Relation::class.java)
        }

        fun getUserFollowersByUID(uid: Int, show: Int = 50, page: Int = 1): Followers {
            if (page > 5) {
                throw PageOutOfRangeException("Page number cannot be greater than 5")
            }
            val response = sendHttpRequest("https://api.bilibili.com/x/relation/followers?vmid=$uid&ps=$show&pn=$page")
            val gson = Gson()
            return gson.fromJson(response, Followers::class.java)
        }

        private fun sendHttpRequest(url: String): String {
            val client = OkHttpClient()

            val request: Request = Request.Builder()
                .url(url)
                .header(
                    "User-Agent",
                    "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36"
                )
                .build()

            val response: Response = client.newCall(request).execute()

            return response.body?.string() ?: ""
        }

    }

}