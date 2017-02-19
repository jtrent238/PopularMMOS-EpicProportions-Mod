package com.jtrent238.epicproportions.command;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import com.jtrent238.epicproportions.browser.Browser;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class CommandChangelog extends CommandBase
{
    private static final String __OBFID = "CL_00000570";

    public String getCommandName()
    {
        return "EPMChangeLog";
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
        return "commands.EPMChangeLog.usage";
    }

    public void processCommand(ICommandSender p_71515_1_, String[] p_71515_2_)
    {

        //p_71515_1_.addChatMessage(new ChatComponentTranslation("TEST", new Object[0]));
        
        
        try {
        	Browser.main();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
        
    }
}