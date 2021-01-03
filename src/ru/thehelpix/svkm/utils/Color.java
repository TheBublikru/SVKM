package ru.thehelpix.svkm.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import ru.thehelpix.svkm.Main;

public class Color {
    private final static Main plugin = Main.getInstance();

    public static String parse(String str){
        return ChatColor.translateAlternateColorCodes('&', str);
    }

    public static void log(String str) {
        Bukkit.getConsoleSender().sendMessage(Color.parse("&6["+plugin.getDescription().getName()+"&6] "+str));
    }
    public static String cmd(String str) {
        return parse("&6["+plugin.getDescription().getName()+"&6] "+str);
    }
}
