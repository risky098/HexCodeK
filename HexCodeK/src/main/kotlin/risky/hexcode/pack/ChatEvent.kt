package risky.hexcode.pack

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.AsyncPlayerChatEvent

class ChatEvent : Listener {
    @EventHandler
    fun PlayerChat(e: AsyncPlayerChatEvent) {
        e.message = Util.cr(e.player, e.message).toString()
        e.message = Util.format(e.player, e.message)
    }
}