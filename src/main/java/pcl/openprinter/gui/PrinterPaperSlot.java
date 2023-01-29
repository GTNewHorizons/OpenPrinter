package pcl.openprinter.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

import pcl.openprinter.items.PrinterPaperRoll;

public class PrinterPaperSlot extends Slot {

    public PrinterPaperSlot(IInventory par1iInventory, int par2, int par3, int par4) {
        super(par1iInventory, par2, par3, par4);
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean isItemValid(ItemStack itemstack) {

        if (itemstack.getItem() instanceof PrinterPaperRoll) {
            return true;
        } else if (itemstack.getItem().equals(Items.paper)) {
            return true;
        } else if (itemstack.getItem().equals(Items.name_tag)) {
            return true;
        }
        return false;
    }

    /**
     * Called when the player picks up an item from an inventory slot
     */
    @Override
    public void onPickupFromSlot(EntityPlayer par1EntityPlayer, ItemStack par2ItemStack) {
        this.onCrafting(par2ItemStack);
        super.onPickupFromSlot(par1EntityPlayer, par2ItemStack);
    }
}
