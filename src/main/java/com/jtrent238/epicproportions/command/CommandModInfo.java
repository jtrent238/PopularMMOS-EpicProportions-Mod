package com.jtrent238.epicproportions.command;

import java.util.ArrayList;
import java.util.List;

import com.jtrent238.epicproportions.EpicProportionsMod;
import com.jtrent238.epicproportions.VersionChecker;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class CommandModInfo extends CommandBase
{
    private static final String __OBFID = "CL_00000570";

    public String getCommandName()
    {
        return "modinfo";
    }

    /**
     * Return the required permission level for this command.
     */
    public int getRequiredPermissionLevel()
    {
        return 0;
    }

    public String getCommandUsage(ICommandSender p_71518_1_)
    {
        return EpicProportionsMod.MODID + "commands.modinfo.usage";
    }

    public void processCommand(ICommandSender p_71515_1_, String[] p_71515_2_)
    {
        EntityPlayerMP entityplayermp = getCommandSenderAsPlayer(p_71515_1_);
        entityplayermp.attackEntityFrom(DamageSource.outOfWorld, Float.MAX_VALUE);
        p_71515_1_.addChatMessage(new ChatComponentTranslation(EpicProportionsMod.MODID +  "commands.modinfo.success", new Object[0]));
        p_71515_1_.addChatMessage(new ChatComponentText(/*/event.player.getDisplayName() + /*/"§a§l" + EpicProportionsMod.MODNAME + " " + "§2§lMade By:jtrent238"));
        p_71515_1_.addChatMessage(new ChatComponentText(/*/event.player.getDisplayName() + /*/"§6§lYou are running" + "§b§l" + " " + EpicProportionsMod.MODVERSION + " " + "§6§lof" + "§6§l" + " " + EpicProportionsMod.MODNAME + "!"));
        p_71515_1_.addChatMessage(new ChatComponentText(/*/event.player.getDisplayName() + /*/"§d§lThe Latest version is:" + "§b§l" + " " + VersionChecker.latestVersion +  "§d§l" + "!"));
    	
    }
}