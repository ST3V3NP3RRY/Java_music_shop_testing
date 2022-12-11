package Items;

public class GuitarStrings extends Item{

    public GuitarStrings(String name, double priceBought, double priceSold) {
        super(name, priceBought, priceSold);
    }

    public double generateMarkUp() {
        return getPriceSold() - getPriceBought();
    }
}
