package info.elaina.bili.api.user.infomation

data class Label(
    val path: String,
    val text: String,
    val label_theme: String,
    val text_color: String,
    val bg_style: Int,
    val bg_color: String,
    val border_color: String,
    val use_img_label: Boolean,
    val img_label_uri_hans: String,
    val img_label_uri_hant: String,
    val img_label_uri_hans_static: String,
    val img_label_uri_hant_static: String
)