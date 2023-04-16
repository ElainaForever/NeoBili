package info.elaina.bili.api.user.nav

data class VipLabel(
    val path: String,
    val text: String,
    val labelTheme: String,
    val textColor: String,
    val bgStyle: Int,
    val bgColor: String,
    val borderColor: String,
    val useImgLabel: Boolean,
    val imgLabelUriHans: String,
    val imgLabelUriHant: String,
    val imgLabelUriHansStatic: String,
    val imgLabelUriHantStatic: String
)
