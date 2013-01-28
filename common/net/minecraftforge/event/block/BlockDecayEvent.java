package net.minecraftforge.event.block;

import net.minecraft.world.World;
import net.minecraftforge.event.Cancelable;

@Cancelable
public class BlockDecayEvent extends BlockEvent {

    public BlockDecayEvent(int x, int y, int z, World world)
    {
        super(x, y, z, world.getBlockId(x, y, z), world.getBlockMetadata(x, y, z), world);
    }

}
