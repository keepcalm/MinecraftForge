package net.minecraftforge.event.block;

import net.minecraft.world.World;
import net.minecraftforge.event.Cancelable;

@Cancelable
public class NotePlayEvent extends BlockEvent {

    public static enum Instrument {
        HARP(0),
        BD(1),
        SNARE(2),
        HAT(3),
        BASS_ATTACK(4);
        
        public int id;
        
        private Instrument(int id) {
            this.id = id;
        }
        
        public static Instrument getInstrumentById(int id) {
            switch(id) {
            case 1:
                return BD;
            case 2:
                return SNARE;
            case 3:
                return HAT;
            case 4:
                return BASS_ATTACK;
            default:
                return HARP;
            }
        }
    }
    
    public Instrument instrument;
    public byte note;
    
    
    public NotePlayEvent(int x, int y, int z, World world, byte note, int instrument)
    {
        super(x, y, z, world.getBlockId(x, y, z), world.getBlockMetadata(x, y, z), world);
        
        this.instrument = Instrument.getInstrumentById(instrument);
        this.note = note;
    }

}


