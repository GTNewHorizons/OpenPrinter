package pcl.openprinter.client;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import pcl.openprinter.ContentRegistry;

public class CreativeTab extends CreativeTabs {

    public CreativeTab(String unlocalizedName) {
        super(unlocalizedName);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem() {
        return Item.getItemFromBlock(ContentRegistry.printerBlock);
    }
}
