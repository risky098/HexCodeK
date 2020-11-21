package risky.hexcode

import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin
import risky.hexcode.pack.ChatEvent

class Main : JavaPlugin() {
    var prefix = "§b[HexCode] §f: "

    override fun onEnable() {
        Bukkit.getLogger().info(prefix + "플러그인이 활성화 되었습니다.")
        Bukkit.getLogger().info(prefix + "사용 버전 (1.16)")
        Bukkit.getLogger().info(prefix + "기능추가 및 오류보고 연락처: 이준명#1139")
        Bukkit.getPluginManager().registerEvents(ChatEvent(), this)
    }
}