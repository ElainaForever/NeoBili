package info.elaina.bili.command.impl

import info.elaina.bili.NeoBili
import info.elaina.bili.api.user.nav.NavLogin
import info.elaina.bili.command.CommandBase
import info.elaina.bili.command.CommandParameter
import info.elaina.bili.command.ParameterType
import info.elaina.bili.utils.network.NetworkUtils

class TokenCommand: CommandBase() {
    override val command: String = "token"
    override val description: String = "使用token的方式登录(SESSDATA)"
    override val params: ArrayList<CommandParameter> = arrayListOf()

    init {
        registerParameter("SESSDATA", ParameterType.STRING, "Token", true)
    }

    override fun onCall(args: Array<String>) {
        if (args.isEmpty()) {
            NeoBili.logger?.error("未输入Token")
            return
        }
        NeoBili.logger?.info("正在使用Token登录...")
        val data = NetworkUtils.getUserDataByToken(args[0])
        NeoBili.logger?.info(data.toString())
        if (data.data.isLogin) {
            NeoBili.logger?.info("登录成功")
            NeoBili.logger?.info("用户名: ${data.data.uname}")
            NeoBili.logger?.info("UID: ${data.data.mid}")
            NeoBili.logger?.info("Token: ${args[0]}")
            NeoBili.logger?.info("登录成功")
        } else {
            NeoBili.logger?.error("登录失败")
        }
    }

}