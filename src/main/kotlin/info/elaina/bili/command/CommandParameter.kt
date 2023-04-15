package info.elaina.bili.command

data class CommandParameter(
    val subParameter: String,
    val type: ParameterType,
    val description: String,
    val required: Boolean)