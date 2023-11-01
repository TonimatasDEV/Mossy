package net.tonimatasdev.mossy.commands;

import net.minestom.server.MinecraftServer;
import net.minestom.server.command.CommandSender;
import net.minestom.server.command.builder.Command;
import net.minestom.server.command.builder.CommandContext;
import net.tonimatasdev.mossy.Mossy;

/**
 * Stops the server
 */
public class StopCommand extends Command {
    public StopCommand() {
        super("stop");
        setCondition(this::condition);
        setDefaultExecutor(this::execute);
    }

    private boolean condition(CommandSender player, String commandName) {
        return true; // TODO: permissions
    }

    private void execute(CommandSender player, CommandContext arguments) {
        Mossy.save();
        MinecraftServer.stopCleanly();
    }
}
