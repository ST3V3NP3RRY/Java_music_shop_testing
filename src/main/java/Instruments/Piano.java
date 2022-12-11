package Instruments;

public class Piano extends Instrument{

    private int numberOfKeys;

    public Piano(String name, double priceBought, double priceSold, InstrumentType instrumentType, int numberOfKeys) {
        super(name, priceBought, priceSold, instrumentType);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }
}
