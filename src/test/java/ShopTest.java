import Instruments.Guitar;
import Instruments.InstrumentType;
import Instruments.Piano;
import Shop.Shop;
import Shop.Till;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;

    Till till;

    @Before
    public void setUp() {
        till = new Till(50.00);
        ArrayList stock = new ArrayList<>();
        shop = new Shop("Rays Music Shop", till, stock);
    }

    @Test
    public void shopHasAName() {
        assertEquals("Rays Music Shop", shop.getName());
    }

    @Test
    public void shopHasMoneyInTill() {
        assertEquals(50.00, shop.getTillMoney(), 0.0);
    }

    @Test
    public void shopCanAddMoneyToTill() {
        shop.addMoneyToTill(50.00);
        assertEquals(100.00, shop.getTillMoney(), 0.0);
    }

    @Test
    public void shopCanRemoveMoneyFromTill() {
        shop.removeMoneyFromTill(25.00);
        assertEquals(25.00, shop.getTillMoney(), 0.0);
    }

    @Test
    public void shopCanAddItemsToStock() {
        Piano piano = new Piano("Baby Grand", 1000, 1300, InstrumentType.KEYBOARDS, 88);
        till = new Till(50.00);
        ArrayList stock = new ArrayList<>();
        shop = new Shop("Rays Music Shop", till, stock);

        shop.addToStock(piano);
        assertEquals(1, shop.getStockCount());
    }

    @Test
    public void shopCanRemoveItemsFromStock() {
        Piano piano = new Piano("Baby Grand", 1000, 1300, InstrumentType.KEYBOARDS, 88);
        Guitar guitar = new Guitar("Stratocaster", 200, 300, InstrumentType.STRINGS, 6, "Fender");
        ArrayList stock = new ArrayList<>();
        stock.add(piano);
        stock.add(guitar);
        till = new Till(50.00);
        shop = new Shop("Rays Music Shop", till, stock);

        shop.removeItemFromStock(piano);
        assertEquals(1, shop.getStockCount());
    }

    @Test
    public void shopCanCalculateMarkUp() {
        Piano piano = new Piano("Baby Grand", 1000, 1300, InstrumentType.KEYBOARDS, 88);
        Guitar guitar = new Guitar("Stratocaster", 200, 300, InstrumentType.STRINGS, 6, "Fender");
        ArrayList stock = new ArrayList<>();
        stock.add(piano);
        stock.add(guitar);
        till = new Till(50.00);
        shop = new Shop("Rays Music Shop", till, stock);
        assertEquals(400.00, shop.generateMarkup(),0.0);
    }

//    @Test
//    public void shopCanFindProductByName() {
//        Piano piano = new Piano("Baby Grand", 1000, 1300, InstrumentType.KEYBOARDS, 88);
//        ArrayList stock = new ArrayList<>();
//        stock.add(piano);
//        till = new Till(50.00);
//        shop = new Shop("Rays Music Shop", till, stock);
//        assertEquals("Baby Grand", shop.findItemByName("BabyGrand"));
//    }

    @Test
    public void findInstrumentByName_true() {
        shop.shopInstruments = Arrays.asList("Piano", "Guitar", "Trumpet", "Keyboard", "Violin");
        assertEquals("Piano", shop.findItemByName("Piano"));
        System.out.println(shop.findItemByName("Piano"));
    }

    @Test
    public void findInstrumentByName_false() {
        shop.shopInstruments = Arrays.asList("Piano", "Guitar", "Trumpet", "Keyboard", "Violin");
        assertEquals("No Items currently in stock", shop.findItemByName("Saxophone"));

    }

    @Test
    public void sortPricesOfItemsInShop() {
        shop.shopPrices = Arrays.asList(100.00, 1000.00, 50.00, 10.50, 365.00, 120.00);
        assertEquals ( Arrays.asList(10.50, 50.00, 100.00, 120.00, 365.00, 1000.00), shop.sortShopPricesLowestToHighest(shop.shopPrices));
    }
}
