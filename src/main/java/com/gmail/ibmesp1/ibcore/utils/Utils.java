package com.gmail.ibmesp1.ibcore.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class Utils {

    /**
     * Displays an urgent message to the console server
     *
     * @param name Plugin name
     * @param msg Message you want to display
     */
    public static void urgentConsoleWarning(String name,String msg) {
        Bukkit.getConsoleSender().sendMessage(name + " " + ChatColor.RED + msg);
    }

    /**
     * Capitalizes the first letter of a string
     *
     * @param string String you want to capitalize
     * @return String with the first letter capitalized
     */
    public static String capitalizeFirstLetter(String string) {
        return string.substring(0, 1).toUpperCase() + string.substring(1);
    }
}
