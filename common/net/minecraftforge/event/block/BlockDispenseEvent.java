package net.minecraftforge.event.block;

import net.minecraft.dispenser.IBehaviorDispenseItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class BlockDispenseEvent extends BlockEvent {

    public final ItemStack originalDispense;
    public ItemStack toDispense;
    
    public Vec3 velocity;
    
    public final IBehaviorDispenseItem dispenseMethod;
    
    
    
    public BlockDispenseEvent(int x, int y, int z, World world, ItemStack dispensed, Vec3 velocity, IBehaviorDispenseItem dispensBehaviour)
    {
        super(x, y, z, world.getBlockId(x, y, z), world.getBlockMetadata(x, y, z), world);
        
        this.originalDispense = dispensed.copy();
        this.toDispense = dispensed;
        
        this.velocity = velocity;
        this.dispenseMethod = dispensBehaviour;
    
    }

}
