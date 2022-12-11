package Shop;

import Instruments.Piano;
import behaviours.ISell;

import java.util.ArrayList;
import java.util.List;

public class Shop{

    public List<String> shopInstruments;

    public List<Double> shopPrices;

    private String name;

    private Till till;

    private ArrayList<ISell> stock;

    public Shop(String name, Till till, ArrayList<ISell> stock) {
        this.name = name;
        this.till = till;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public double getTillMoney() {
        return this.till.getMoneyInTill();
    }

    public void addMoneyToTill(double moneyToAdd) {
        this.till.addMoney(moneyToAdd);
    }

    public void removeMoneyFromTill(double moneyToRemove) {
        this.till.removeMoney(moneyToRemove);
    }

    public int getStockCount() {
        return this.stock.size();
    }

    public void addToStock(Piano item) {
        this.stock.add(item);
    }

    public void removeItemFromStock(Piano item) {
        this.stock.remove(item);
    }

    public double generateMarkup() {
        int profit = 0;
        for (ISell item : this.stock) {
            profit += item.generateMarkUp();
        }
        return profit;
    }

    public String findItemByName(String nameToFind) {
        return shopInstruments
                .stream()
                .filter(name -> name.equals(nameToFind))
                .findFirst()
                .orElse("No Items currently in stock");
    }

    public List<Double> sortShopPricesLowestToHighest(List<Double> shopPrices) {
        return this.shopPrices
                .stream()
                .sorted()
                .toList();
    }
}
