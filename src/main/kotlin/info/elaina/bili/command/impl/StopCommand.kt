package info.elaina.bili.command.impl

import info.elaina.bili.NeoBili
import info.elaina.bili.command.CommandBase
import info.elaina.bili.command.CommandParameter
import kotlin.system.exitProcess

class StopCommand: CommandBase() {

    override val command: String = "stop"

    override val description: String = "保存设置并退出"

    override val params: ArrayList<CommandParameter> = arrayListOf()

    override fun onCall(args: Array<String>) {
        exitProcess(1)
    }


}