package ItemsTests;

import Items.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void setUp() {
        guitarStrings = new GuitarStrings("Guitar strings", 8.00, 15.00);
    }

    @Test
    public void itemHasName() {
        assertEquals("Guitar strings", guitarStrings.getName());
    }

    @Test
    public void itemHasPriceBought() {
        assertEquals(8.00, guitarStrings.getPriceBought(), 0.0);
    }

    @Test
    public void itemHasPriceSold() {
        assertEquals(15.00, guitarStrings.getPriceSold(), 0.0);
    }

    @Test
    public void getItemMarkUp() {
        assertEquals(7.00, guitarStrings.generateMarkUp(), 0.0);
    }
}
