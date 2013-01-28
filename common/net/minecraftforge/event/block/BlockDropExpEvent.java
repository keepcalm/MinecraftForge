package net.minecraftforge.event.block;

import net.minecraft.world.World;
import net.minecraftforge.event.Cancelable;

@Cancelable
public class BlockDropExpEvent extends BlockEvent {

    public final int droppedExp;
    public int amountOfExpToDrop;
    
    public BlockDropExpEvent(int x, int y, int z, World world, int amount)
    {
        super(x, y, z, world.getBlockId(x, y, z), world.getBlockMetadata(x, y, z), world);
        
        this.droppedExp = amount;
        this.amountOfExpToDrop = amount;
    }

}
