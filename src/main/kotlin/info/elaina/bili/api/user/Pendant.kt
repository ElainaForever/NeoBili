package info.elaina.bili.api.user

data class Pendant(
    val pid: Int,
    val name: String,
    val image: String,
    val expire: Int,
    val image_enhance: String,
    val image_enhance_frame: String
)
