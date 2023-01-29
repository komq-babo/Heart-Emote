package io.github.koba.heartemote

import org.bukkit.ChatColor
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.AsyncPlayerChatEvent

class Events: Listener {

    @EventHandler
    fun onChat(event: AsyncPlayerChatEvent) {
        var string: String = event.message

        string = string.replace(":h:", "${ChatColor.RED}❤")
        string = string.replace(":rh:", "${ChatColor.DARK_RED}❤")
        string = string.replace(":oh:", "${ChatColor.GOLD}❤")
        string = string.replace(":yh:", "${ChatColor.YELLOW}❤")
        string = string.replace(":gh:", "${ChatColor.GREEN}❤")
        string = string.replace(":dgh:", "${ChatColor.DARK_GREEN}❤")
        string = string.replace(":ah:", "${ChatColor.AQUA}❤")
        string = string.replace(":dah:", "${ChatColor.DARK_AQUA}❤")
        string = string.replace(":bh:", "${ChatColor.BLUE}❤")
        string = string.replace(":dbh:", "${ChatColor.DARK_BLUE}❤")
        string = string.replace(":ph:", "${ChatColor.LIGHT_PURPLE}❤")
        string = string.replace(":dph:", "${ChatColor.DARK_PURPLE}❤")
        string = string.replace(":wh:", "${ChatColor.WHITE}❤")
        string = string.replace(":grh:", "${ChatColor.GRAY}❤")
        string = string.replace(":dgrh:", "${ChatColor.DARK_GRAY}❤")
        string = string.replace(":blh:", "${ChatColor.BLACK}❤")

        event.message = string
    }
}