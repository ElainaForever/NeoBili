package info.elaina.bili.command.impl

import info.elaina.bili.command.CommandBase
import info.elaina.bili.command.CommandParameter
import info.elaina.bili.command.ParameterType

class LoginCommand: CommandBase() {
    override val command: String = "login"
    override val description: String = "登录到哔哩哔哩"
    override val params: ArrayList<CommandParameter> = arrayListOf()

    init {
        registerParameter("phone", ParameterType.STRING, "手机号", true)
        registerParameter("password", ParameterType.STRING, "密码", true)
    }
    
    override fun onCall(args: Array<String>) {
    }

}