package info.elaina.bili.utils.network

import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody

class HttpUtils {

    companion object {
        @JvmStatic
        fun get(url: String): String {
            val client = OkHttpClient()
            val request = Request.Builder()
                .url(url)
                .build()
            val response = client.newCall(request).execute()
            return response.body?.string() ?: ""
        }

        @JvmStatic
        fun get(url: String, cookie: String): String {
            val client = OkHttpClient()
            val request = Request.Builder()
                .url(url)
                .addHeader("Cookie", "SESSDATA=${cookie}")
                .build()
            val response = client.newCall(request).execute()
            return response.body?.string() ?: ""
        }

        @JvmStatic
        fun post(url: String, form: String): String {
            val client = OkHttpClient()
            val request = Request.Builder()
                .url(url)
                .post(form.toRequestBody())
                .build()
            val response = client.newCall(request).execute()
            return response.body?.string() ?: ""
        }

        @JvmStatic
        fun post(url: String, form: String, cookie: String): String {
            val client = OkHttpClient()
            val request = Request.Builder()
                .url(url)
                .addHeader("Cookie", "SESSDATA=${cookie}}")
                .post(form.toRequestBody())
                .build()
            val response = client.newCall(request).execute()
            return response.body?.string() ?: ""
        }
    }

}