package com.jtrent238.epicproportions;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.IOUtils;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;
import net.minecraft.event.ClickEvent;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatStyle;



public class VersionChecker implements Runnable
{
    public static boolean isLatestVersion = false;
    public static String latestVersion = "";

    /* (non-Javadoc)
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() 
    {
        InputStream in = null;
        try 
        {
            in = new URL("https://raw.githubusercontent.com/jtrent238/PopularMMOS-EpicProportions-Mod/master/version_file").openStream();
        } 
        catch 
        (MalformedURLException e) 
        {
            
            e.printStackTrace();
        } 
        catch (IOException e) 
        {
            
            e.printStackTrace();
        }

        try 
        {
            latestVersion = IOUtils.readLines(in).get(0);
        } 
        catch (IOException e) 
        {
            
            e.printStackTrace();
        } 
        finally 
        {
            IOUtils.closeQuietly(in);
        }
        System.out.println("Latest mod version = " + latestVersion);
        isLatestVersion = EpicProportionsMod.MODVERSION.equals(latestVersion);
        System.out.println("Are you running latest version = "+isLatestVersion);
    }
    
    public boolean isLatestVersion()
    {
     return isLatestVersion;
    }
    
    public String getLatestVersion()
    {
     return latestVersion;
    }



@SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
public void onEvent(PlayerTickEvent event)
{
  
    if (!EpicProportionsMod.haveWarnedVersionOutOfDate && event.player.worldObj.isRemote 
          && !EpicProportionsMod.versionChecker.isLatestVersion())
    {
        ClickEvent versionCheckChatClickEvent = new ClickEvent(ClickEvent.Action.OPEN_URL, 
              "http://www.planetminecraft.com/mod/popularmmos-epicproportions-mod-season-9/");
        ChatStyle clickableChatStyle = new ChatStyle().setChatClickEvent(versionCheckChatClickEvent);
        ChatComponentText versionWarningChatComponent = 
              new ChatComponentText("§4§l" + "Your EpicProportions Mod is not latest version!  Click here to update.");
        versionWarningChatComponent.setChatStyle(clickableChatStyle);
        event.player.addChatMessage(versionWarningChatComponent);
        EpicProportionsMod.haveWarnedVersionOutOfDate = true;
    }
  
}
}