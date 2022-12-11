package InstrumentsTests;

import Instruments.InstrumentType;
import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp() {
        piano = new Piano("Baby Grand", 1000, 1300, InstrumentType.KEYBOARDS, 88);
    }

    @Test
    public void pianoHasName() {
        assertEquals("Baby Grand", piano.getName());
    }

    @Test
    public void pianoHasPriceBought() {
        assertEquals(1000, piano.getPriceBought(), 0.0);
    }

    @Test
    public void pianoHasPriceSold() {
        assertEquals(1300, piano.getPriceSold(), 0.0);
    }

    @Test
    public void pianoHasInstrumentType() {
        assertEquals(InstrumentType.KEYBOARDS, piano.getInstrumentType());
    }

    @Test
    public void pianoHasNumberOfKeys() {
        assertEquals(88, piano.getNumberOfKeys());
    }

    @Test
    public void pianoGetMarkUp() {
        assertEquals(300, piano.generateMarkUp(), 0.0);
    }

    @Test
    public void pianoCanPlaySound() {
        assertEquals("The Baby Grand plays this sound, tinkle tinkle", piano.play("tinkle tinkle"));
    }
 }
