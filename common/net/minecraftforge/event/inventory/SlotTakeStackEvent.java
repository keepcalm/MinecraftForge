package net.minecraftforge.event.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Slot;
import net.minecraftforge.event.Cancelable;
import net.minecraftforge.event.Event.HasResult;

@HasResult
public class SlotTakeStackEvent extends SlotEvent {

    public final EntityPlayer player;
    
    public SlotTakeStackEvent(Slot slot, EntityPlayer player)
    {
        super(slot);
        this.player = player;
    }

}
