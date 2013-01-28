package net.minecraftforge.event.block;

import net.minecraft.world.World;
import net.minecraftforge.event.Cancelable;

@Cancelable
public class BlockBurnEvent extends BlockEvent {

    public BlockBurnEvent(int x, int y, int z, World world)
    {
        super(x, y, z, world.getBlockId(x, y, z), world.getBlockMetadata(x, y, z), world);
    }

}
