/**
 *
 */
package pcl.openprinter.items;

import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import pcl.openprinter.OpenPrinter;

/**
 * @author Caitlyn
 *
 */
public class PrinterInkBlack extends Item {

    public PrinterInkBlack() {
        super();
        maxStackSize = 1;
        this.setMaxDamage(OpenPrinter.cfg.printerInkUse);
        setNoRepair();
        setUnlocalizedName("printerInkBlack");
        setTextureName("openprinter:PrinterInkBlack");
        setCreativeTab(OpenPrinter.CreativeTab);
    }

    @Override
    public void onUpdate(ItemStack stack, World world, Entity entity, int n, boolean b) {
        if (stack.getItemDamage() >= stack.getMaxDamage()) stack.stackSize -= 1; // if this is reduced to 0, it is
                                                                                 // automatically "destroyed"
    }
}
