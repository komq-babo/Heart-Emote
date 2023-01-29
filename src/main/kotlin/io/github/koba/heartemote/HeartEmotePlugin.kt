package io.github.koba.heartemote

import org.bukkit.plugin.java.JavaPlugin

class HeartEmotePlugin: JavaPlugin() {

    override fun onEnable() {
        server.pluginManager.registerEvents(Events(), this)
    }

}