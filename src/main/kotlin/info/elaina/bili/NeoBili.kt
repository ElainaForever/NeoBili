package info.elaina.bili

import info.elaina.bili.command.CommandManager
import info.elaina.bili.runnable.CommandRunnable
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger


class NeoBili {

    companion object {

        private val INSTANCE = this

        val commandManager = CommandManager()
        private val commandListener = Thread(CommandRunnable())
        val logger: Logger? = LogManager.getLogger("NeoBili")

        @JvmStatic
        fun main(args: Array<String>) {

            commandListener.start()
        }

    }
}
