package net.minecraftforge.event.block;

import net.minecraft.world.World;
import net.minecraftforge.event.Event;

public class BlockEvent extends Event {

    public final int blockX;
    public final int blockY;
    public final int blockZ;
    public final int blockID;
    public final int blockMeta;
    
    public final World world;
    
    public BlockEvent(int x, int y, int z, int id, int meta, World world) {
        
        this.blockX = x;
        this.blockY = y;
        this.blockZ = z;
        this.blockID = id;
        this.blockMeta = meta;
        
        this.world = world;
        
    }
    
}
