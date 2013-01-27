package net.minecraftforge.event.entity.player;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.event.Cancelable;
import net.minecraftforge.event.Event.HasResult;

@Cancelable
public class PlayerPlaceBlockEvent extends PlayerEvent 
{

    public final int blockX;
    public final int blockY;
    public final int blockZ;
    public final float xOffset;
    public final float yOffset;
    public final float zOffset;
    
    public final ForgeDirection sideHit;
    
    public final ItemStack stackUsed;
    
    public final boolean canBuild;
    public boolean isUnlimited;
    
    
    public PlayerPlaceBlockEvent(EntityPlayer player, ItemStack stack, int x, int y, int z, int side, float xOffset, float yOffset, float zOffset)
    {
        super(player);
        if (!(stack.getItem() instanceof ItemBlock)) 
        {
            throw new IllegalArgumentException("Item in ItemStack must be an ItemBlock!");
        }
        
        this.blockX = x;
        this.blockY = y;
        this.blockZ = z;
        
        this.xOffset = xOffset;
        this.yOffset = yOffset;
        this.zOffset = zOffset;
        
        this.sideHit = ForgeDirection.getOrientation(side);
        
        this.stackUsed = stack;
        
        this.canBuild = player.canPlayerEdit(x, y, z, side, stackUsed);
        this.isUnlimited = player.capabilities.isCreativeMode;
        
        
        
    }

}
