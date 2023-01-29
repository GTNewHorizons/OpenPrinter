/**
 *
 */
package pcl.openprinter.items;

import net.minecraft.item.Item;

import pcl.openprinter.OpenPrinter;

/**
 * @author Caitlyn
 *
 */
public class ItemPaperShreds extends Item {

    public ItemPaperShreds() {
        super();
        maxStackSize = 64;
        setCreativeTab(OpenPrinter.CreativeTab);
        setUnlocalizedName("shreddedPaper");
        setTextureName(OpenPrinter.MODID + ":shreddedPaper");
    }
}
