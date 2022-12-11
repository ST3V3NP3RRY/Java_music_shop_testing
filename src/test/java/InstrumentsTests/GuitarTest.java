package InstrumentsTests;

import Instruments.Guitar;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() {
        guitar = new Guitar("Stratocaster", 200, 300, InstrumentType.STRINGS, 6, "Fender");
    }

    @Test
    public void guitarHasName() {
        assertEquals("Stratocaster", guitar.getName());
    }

    @Test
    public void guitarHasPriceBought() {
        assertEquals(200, guitar.getPriceBought(), 0.0);
    }

    @Test
    public void guitarHasPriceSold() {
        assertEquals(300, guitar.getPriceSold(), 0.0);
    }

    @Test
    public void guitarHasInstrumentType() {
        assertEquals(InstrumentType.STRINGS, guitar.getInstrumentType());
    }

    @Test
    public void guitarHasNumberOfStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void guitarHasManufacturer() {
        assertEquals("Fender", guitar.getManufacturer());
    }

    @Test
    public void getGuitarMarkUp() {
        assertEquals(100, guitar.generateMarkUp(), 0.0);
    }

    @Test
    public void guitarCanPlaySound() {
        assertEquals("The Stratocaster plays this sound, Twang", guitar.play("Twang"));
    }
}
