package org.strassburger.lifestealz.commands;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.strassburger.lifestealz.util.GuiManager;

public class HeartBankCommand implements CommandExecutor {

	@Override
	public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage(Component.text("You must be a player to use this command.").color(NamedTextColor.RED));
			return true;
		}

		Player player = (Player) sender;

		GuiManager.openHeartBankGUI(player);
		return true;
	}
}
