package com.gmail.ibmesp1.ibcore.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class Utils {
    public void urgentConsoleWarning(String name,String msg) {
        Bukkit.getConsoleSender().sendMessage(name + " " + ChatColor.RED + msg);
    }

    public String capitalizeFirstLetter(String string) {
        return string.substring(0, 1).toUpperCase() + string.substring(1);
    }
}