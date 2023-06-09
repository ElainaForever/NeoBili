package info.elaina.bili.command

import info.elaina.bili.NeoBili
import info.elaina.bili.command.impl.HelpCommand
import info.elaina.bili.command.impl.LoginCommand
import info.elaina.bili.command.impl.StopCommand
import info.elaina.bili.command.impl.TokenCommand

class CommandManager {

    companion object {
        val commands = mutableListOf<CommandBase>()

    }

    init {
        registerCommand(HelpCommand())
        registerCommand(StopCommand())
        registerCommand(TokenCommand())
        registerCommand(LoginCommand())
        NeoBili.logger?.info("指令管理器初始化完成")
    }

    private fun registerCommand(command: CommandBase) {
        commands.add(command)

    }

    fun callCommand(command: String, args: Array<String>) {
        val cmd = commands.find { it.command == command }
        if (cmd != null) {
            cmd.onCall(args)
        } else {
            NeoBili.logger?.error("未知的指令，请使用help查看指令列表")
        }
    }


}