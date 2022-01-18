package de.paintabletoast.system.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class PaintableToastCommand implements CommandHandler {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage("&bBukkitLabs &8: &fPaintableToast ist der &bEntwickler &fdieses Plugins! &fBei Fragen melde dich bei seinem Discord! &bPaintableToast#1234");
        return false;
    }
}
