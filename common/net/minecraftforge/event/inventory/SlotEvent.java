package net.minecraftforge.event.inventory;

import net.minecraft.inventory.Slot;
import net.minecraftforge.event.Event;



public class SlotEvent extends Event {

    public final Slot slot;
    
    public SlotEvent(Slot slot) {
        this.slot = slot;
    }
    
}
