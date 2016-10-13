package com.jtrent238.epicproportions;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigHandler 
{
   private static Object ENTITY_ID_0;
private static Configuration configuration;
public static Object CATEGORY_GENERAL;

public static void init(File configFile) 
   {
      Configuration config = new Configuration(configFile);
      
      config.load();
      
      ENTITY_ID_0 = configuration.getInt("EntityBomby.class", Configuration.CATEGORY_GENERAL, 0, 0, 50, "Entity ID's (ONLY CHANGE IF YOU KNOW WHAT YOUR DOING! DELETE THE CONFIG IF YOU GET ANY ERRORS AS OF RESULT!.");
      
      config.save();
   }
}
