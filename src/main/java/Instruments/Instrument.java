package Instruments;

import Items.Item;
import behaviours.ISell;
import behaviours.IPlay;

public class Instrument extends Item implements ISell, IPlay {

    private InstrumentType instrumentType;

    public Instrument(String name, double priceBought, double priceSold, InstrumentType instrumentType) {
        super(name, priceBought, priceSold);
        this.instrumentType = instrumentType;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public double generateMarkUp() {
        return getPriceSold() - getPriceBought();
    }

    public String play(String sound) {
        return "The " + this.getName() + " plays this sound, " + sound;
    }
}
