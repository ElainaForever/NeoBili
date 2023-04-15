package info.elaina.bili.runnable

import info.elaina.bili.NeoBili

class CommandRunnable : Runnable {

    override fun run() {
        while (true) {
            val input = readLine()
            if (input != null) {
                val args = input.split(" ")
                val command = args[0]
                val params = args.drop(1).toTypedArray()
                // call command
                NeoBili.commandManager.callCommand(command, params)
            }
        }
    }
}