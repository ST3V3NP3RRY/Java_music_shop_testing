package Shop;

public class Till {

    private double money;

    public Till(double money) {
        this.money = money;
    }

    public double getMoneyInTill() {
        return money;
    }

    public void addMoney(double moneyToAdd) {
        this.money += moneyToAdd;
    }

    public void removeMoney(double moneyToRemove) {
        this.money -= moneyToRemove;
    }
}
