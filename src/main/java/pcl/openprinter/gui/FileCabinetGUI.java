package pcl.openprinter.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

import org.lwjgl.opengl.GL11;

import pcl.openprinter.OpenPrinter;
import pcl.openprinter.tileentity.FileCabinetContainer;
import pcl.openprinter.tileentity.FileCabinetTE;

public class FileCabinetGUI extends GuiContainer {

    private String name = "";

    public FileCabinetGUI(InventoryPlayer inventoryPlayer, FileCabinetTE tileEntity) {
        // the container is instanciated and passed to the superclass for handling
        super(new FileCabinetContainer(inventoryPlayer, tileEntity));
        this.xSize = 175;
        this.ySize = 195;
        if (tileEntity.hasDisplayName()) {
            name = tileEntity.getDisplayName();
        }
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int param1, int param2) {
        if (name.length() > 0) {
            mc.fontRenderer.drawString(name, (this.xSize - mc.fontRenderer.getStringWidth(name)) / 2, 4, 4210752);
        } else {
            mc.fontRenderer.drawString(StatCollector.translateToLocal("gui.string.filecabinet"), 65, 4, 4210752);
        }
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) {
        // draw your Gui here, only thing you need to change is the path
        ResourceLocation texture = new ResourceLocation(OpenPrinter.MODID, "textures/gui/filecabinet.png");
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.renderEngine.bindTexture(texture);
        int x = (width - xSize) / 2;
        int y = (height - ySize) / 2;
        this.drawTexturedModalRect(x, y, 0, 0, xSize, ySize);
    }
}
