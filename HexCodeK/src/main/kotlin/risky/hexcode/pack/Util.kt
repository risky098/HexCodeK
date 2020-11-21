package risky.hexcode.pack

import net.md_5.bungee.api.ChatColor
import org.bukkit.entity.Player
import java.util.regex.Pattern

object Util {
    private val pn = Pattern.compile("(?<!\\\\)(#[a-fA-F0-9]{6})")
    fun format(p: Player?, s: String): String {
        var s = s
        val mch = pn.matcher(s)
        while (mch.find()) {
            val color = s.substring(mch.start(), mch.end())
            s = s.replace(color, "" + ChatColor.of(color))
        }
        return s
    }

    fun cr(p: Player?, s: String?): String? {
        var s = s
        s = ChatColor.translateAlternateColorCodes('&', s)
        return s
    }

    fun cr(s: String?): String {
        return ChatColor.translateAlternateColorCodes('&', s)
    }
}