/**
 *
 */
package pcl.openprinter;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import cpw.mods.fml.common.network.IGuiHandler;
import pcl.openprinter.tileentity.PrinterContainer;
import pcl.openprinter.tileentity.PrinterTE;

/**
 * @author Caitlyn
 *
 */
public class CommonProxy implements IGuiHandler {

    public void registerRenderers() {}

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity te = world.getTileEntity(x, y, z);
        if (te != null && te instanceof PrinterTE) {
            PrinterTE icte = (PrinterTE) te;
            return new PrinterContainer(player.inventory, icte);
        } else {
            return null;
        }
    }
}
