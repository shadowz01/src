package shadowz01.crycraft;

import shadowz01.crycraft.Items.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialLiquid;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;
import shadowz01.crycraft.misc.*;

@Mod(modid = "The ModiumVentures Mod", name = "The ModiumVentures Mod", version = "V.1_00.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class Crycraft
{
	//CreativeTabs
	public static CreativeTabs CreativeTabCryCraft;
	public static Item CryCraftTabIcon;
	
	//Blocks
	public static Block cryFluid;
	
	
	//Items
	public static Item PlatinumIngot;
	public static Item CopperIngot;
	public static Item TinIngot;
	public static Item MastersWand;
	public static Item CriesIngot;
	public static Item BronzeIngot;
	
	
	//Tools and Armor
	
	
@EventHandler
public void init(FMLPreInitializationEvent event)
{
	
	
	
	//CreativeTabs
	CreativeTabCryCraft = (new CreativeTabCryCraft(CreativeTabs.getNextID(), "400"));
	CryCraftTabIcon = (new ItemCryCraftTabIcon(3000).setUnlocalizedName("Cry Craft Tab Icon"));
	
	//Blocks
	
	
	
	//Fluids
	
	//Items
	
	PlatinumIngot = (new ItemPlatinumIngot(1001).setUnlocalizedName("Platinum Ingot").setCreativeTab(this.CreativeTabCryCraft));
	CopperIngot = (new ItemCopperIngot(1003).setUnlocalizedName("Copper Ingot").setCreativeTab(this.CreativeTabCryCraft));
	TinIngot = (new ItemTinIngot(1005).setUnlocalizedName("Tin Ingot").setCreativeTab(this.CreativeTabCryCraft));
	CriesIngot = (new ItemCriesIngot(1007).setUnlocalizedName("Cries Ingot").setCreativeTab(this.CreativeTabCryCraft));
	BronzeIngot = (new ItemBronzeIngot(1008).setUnlocalizedName("Bronze Ingot").setCreativeTab(this.CreativeTabCryCraft));
	
	
	
	MastersWand = (new ItemMastersWand(1110).setUnlocalizedName("Masters Wand").setCreativeTab(this.CreativeTabCryCraft));
	/*
	 * To be added:
	 
	*/
	//Tools and Armor
	
	
	
}


@EventHandler
public void load(FMLInitializationEvent event)
{
	addNames();
	addOreDictionary();
	addRecipes();
	
}


public void addNames()
{
	LanguageRegistry.addName(PlatinumIngot, "Platinum Ingot");
	LanguageRegistry.addName(CopperIngot, "Copper Ingot");
	LanguageRegistry.addName(TinIngot, "Tin Ingot");
	LanguageRegistry.addName(CriesIngot, "Cries Ingot");
	LanguageRegistry.addName(BronzeIngot, "Bronze Ingot");
	LanguageRegistry.addName(MastersWand, "Master's Wand");
}
public void addOreDictionary()
{
	OreDictionary.registerOre("ingotPlatinum", PlatinumIngot);
	OreDictionary.registerOre("ingotTin", TinIngot);
	OreDictionary.registerOre("ingotCopper", CopperIngot);
	OreDictionary.registerOre("ingotBronze", BronzeIngot);
	
}
public void addRecipes()
{
	
}




public Crycraft()
{

	
} 
}