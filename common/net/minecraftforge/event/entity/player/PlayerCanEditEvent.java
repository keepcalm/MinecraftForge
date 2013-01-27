package net.minecraftforge.event.entity.player;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.event.Cancelable;

@Cancelable
public class PlayerCanEditEvent extends PlayerEvent {

    public final int x;
    public final int y;
    public final int z;
    public final ForgeDirection side;
    
    public final ItemStack used;
    
    public PlayerCanEditEvent(EntityPlayer player, ItemStack using, int x, int y, int z, int face)
    {
        super(player);
        
        this.x = x;
        this.y = y;
        this.z = z;
        
        this.used = using;
        this.side = ForgeDirection.getOrientation(face);
        
        
    }

}
