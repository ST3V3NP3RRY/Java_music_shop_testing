package Instruments;

public enum InstrumentType {

    WOODWIND("Woodwind"),
    STRINGS("Strings"),
    PERCUSSION("Percussion"),
    ORCHESTRA("Orchestra"),
    KEYBOARDS("Keyboards");

    private final String instrumentType;

    InstrumentType(String instrumentType) {
        this.instrumentType = instrumentType;
    }

    public String getInstrumentType() {
        return instrumentType;
    }
}
