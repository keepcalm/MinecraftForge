package net.minecraftforge.event.entity.player;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntitySign;
import net.minecraftforge.event.Cancelable;

@Cancelable
public class PlayerChangeSignEvent extends PlayerEvent {
    
    public final String[] oldLines;
    public String[] newLines;
    
    public final int signX;
    public final int signY;
    public final int signZ;
    
    public final boolean isEditable;
    

    public PlayerChangeSignEvent(EntityPlayer player, int x, int y, int z, String[] lines, boolean isEditable)
    {
        super(player);
        
        if (!player.worldObj.blockHasTileEntity(x, y, z) || !(player.worldObj.getBlockTileEntity(x, y, z) instanceof TileEntitySign)) {
            throw new IllegalArgumentException("Trying to change a TE that isn't a sign!");
        }
        
        TileEntitySign te = (TileEntitySign) player.worldObj.getBlockTileEntity(x, y, z);
        this.oldLines = te.signText;
        
        this.signX = x;
        this.signY = y;
        this.signZ = z;
        
        this.isEditable = isEditable;
        this.newLines = lines;
        
    }

}
