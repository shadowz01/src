package shadowz01.crycraft; // fx. package Lollipop.Main
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
public final class CreativeTabCryCraft extends CreativeTabs //change CreativeTabNAME into fx. TabLollipop
{
public CreativeTabCryCraft(int par1, String par2Str) //also change CreativeTabNAME into the SAME as above
{
super(par1, par2Str);
}

@SideOnly(Side.CLIENT)
public int getTabIconItemIndex()
{
return Crycraft.CryCraftTabIcon.itemID; //Change it to whatever icon you want to use ingame fx. Item.ingotIron.itemID
}

public String getTranslatedTabLabel()
{
return "Cry Craft"; //this is the name when you hover over it ingame so fx. "Lollipop"
}
}