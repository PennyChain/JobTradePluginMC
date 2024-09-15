package me.Liam.JobTradePlugin;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.java.JavaPlugin;

public class JobTradePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("JobTrade plugin has started!");
    }

    @Override
    public void onDisable() {
        getLogger().info("JobTrade plugin has stopped!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("jobtrade")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                openJobTradeMenu(player); // Open the custom inventory GUI
            }
            return true;
        }
        return false;
    }

    // Method to create and open the custom inventory
    public void openJobTradeMenu(Player player) {
        Inventory jobTradeMenu = Bukkit.createInventory(null, 9, "Job Trade Menu");

        // You can add items to the inventory here (e.g., placeholders or real items)

        player.openInventory(jobTradeMenu);
    }
}
