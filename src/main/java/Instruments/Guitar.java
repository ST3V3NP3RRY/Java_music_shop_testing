package Instruments;

public class Guitar extends Instrument{

    private int numberOfStrings;

    private String manufacturer;

    public Guitar(String name, double priceBought, double priceSold, InstrumentType instrumentType, int numberOfStrings, String manufacturer) {
        super(name, priceBought, priceSold, instrumentType);
        this.numberOfStrings = numberOfStrings;
        this.manufacturer = manufacturer;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
