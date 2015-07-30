package tv.savageboy74.lotsofood.common;

import tv.savageboy74.lotsofood.common.util.Logger;
import tv.savageboy74.lotsofood.common.util.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.mod_id, name = Reference.mod_name, version = Reference.mod_version)
public class LotsOFood {

	@Mod.Instance(Reference.mod_id)
	public static LotsOFood instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent  event)
	{
		Logger.info(Reference.pre_init_complete_message);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent  event)
	{
		Logger.info(Reference.init_complete_message);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent  event)
	{
		Logger.info(Reference.post_init_complete_message);
	}
}
