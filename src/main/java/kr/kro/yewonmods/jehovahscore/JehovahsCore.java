package kr.kro.yewonmods.jehovahscore;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import kr.kro.yewonmods.jehovahscore.log.JLogger;

@Mod(modid=JehovahsCore.MODID, name=JehovahsCore.MODNAME, version=JehovahsCore.MODVER)
public class JehovahsCore {
	public static final String MODID = "jehovahscore";
	public static final String MODNAME = "Jehovah's Core";
	public static final String MODVER = "1.2.0";
	
	@Instance(value = JehovahsCore.MODID)
	public static JehovahsCore instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		JLogger.log("Pre-init started", false);
		JLogger.log("Pre-init finished", false);
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event) {
		JLogger.log("Init started", false);
		JLogger.log("Init finished", false);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		JLogger.log("Post-init started", false);
		JLogger.log("Post-init finished", false);
	}
}
