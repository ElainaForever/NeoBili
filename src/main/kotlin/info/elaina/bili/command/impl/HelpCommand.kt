package info.elaina.bili.command.impl

import info.elaina.bili.NeoBili
import info.elaina.bili.command.CommandBase
import info.elaina.bili.command.CommandManager
import info.elaina.bili.command.CommandParameter
import info.elaina.bili.command.ParameterType

class HelpCommand: CommandBase() {

    override val command: String = "help"

    override val description: String = "显示所有的指令"

    override val params: ArrayList<CommandParameter> = ArrayList()

    init {
        registerParameter("command", ParameterType.STRING, "显示某条指令的用法", false)
    }

    override fun onCall(args: Array<String>) {
        if (args.isEmpty()) {
            NeoBili.logger?.info("指令列表:")
            for (command in CommandManager.commands) {
                NeoBili.logger?.info("${CommandManager.commands.indexOf(command) + 1}. ${command.command} - ${command.description}")
            }
            return
        }
        val cmd = CommandManager.commands.find { it.command == args[0] }
        val commandParams = cmd?.params
        var paramsString = ""
        for (param in commandParams!!) {
            paramsString += "<${param.subParameter}: ${param.type.name}${if(param.required) " - required" else ""}> "
        }

        NeoBili.logger?.info("指令用法: ${cmd.command} $paramsString - ${cmd.description}")

    }



}
