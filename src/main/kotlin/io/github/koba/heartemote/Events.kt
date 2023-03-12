package io.github.koba.heartemote

import org.bukkit.ChatColor
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.AsyncPlayerChatEvent

class Events: Listener {

    @EventHandler
    fun onChat(event: AsyncPlayerChatEvent) {
        var string: String = event.message

        string = string.replace(":h:", "${ChatColor.RED}❤${ChatColor.WHITE}")
        string = string.replace(":rh:", "${ChatColor.DARK_RED}❤${ChatColor.WHITE}")
        string = string.replace(":oh:", "${ChatColor.GOLD}❤${ChatColor.WHITE}")
        string = string.replace(":yh:", "${ChatColor.YELLOW}❤${ChatColor.WHITE}")
        string = string.replace(":gh:", "${ChatColor.GREEN}❤${ChatColor.WHITE}")
        string = string.replace(":dgh:", "${ChatColor.DARK_GREEN}❤${ChatColor.WHITE}")
        string = string.replace(":ah:", "${ChatColor.AQUA}❤${ChatColor.WHITE}")
        string = string.replace(":dah:", "${ChatColor.DARK_AQUA}❤${ChatColor.WHITE}")
        string = string.replace(":bh:", "${ChatColor.BLUE}❤${ChatColor.WHITE}")
        string = string.replace(":dbh:", "${ChatColor.DARK_BLUE}❤${ChatColor.WHITE}")
        string = string.replace(":ph:", "${ChatColor.LIGHT_PURPLE}❤${ChatColor.WHITE}")
        string = string.replace(":dph:", "${ChatColor.DARK_PURPLE}❤${ChatColor.WHITE}")
        string = string.replace(":wh:", "${ChatColor.WHITE}❤${ChatColor.WHITE}")
        string = string.replace(":grh:", "${ChatColor.GRAY}❤${ChatColor.WHITE}")
        string = string.replace(":dgrh:", "${ChatColor.DARK_GRAY}❤${ChatColor.WHITE}")
        string = string.replace(":blh:", "${ChatColor.BLACK}❤${ChatColor.WHITE}")

        event.message = string
    }
}
