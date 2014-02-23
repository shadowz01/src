package shadowz01.crycraft.Items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemMastersWand extends Item{

	public ItemMastersWand(int par1) {
		super(par1);

	}

	public void registerIcons(IconRegister par1)
	{
		itemIcon = par1.registerIcon("crycraft:masterswand");
	}

	  public boolean isFull3D()
	    {
	        return true;
	    }

}
