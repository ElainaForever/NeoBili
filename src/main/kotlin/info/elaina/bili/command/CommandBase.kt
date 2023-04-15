package info.elaina.bili.command

abstract class CommandBase {

    abstract val command: String

    abstract val description: String

    abstract val params: ArrayList<CommandParameter>
    abstract fun onCall(args: Array<String>)

    fun registerParameter(subParameter: String, type: ParameterType, description: String, required: Boolean) {
        val param = CommandParameter(subParameter, type, description, required)
        params.add(param)
    }



}