class Karte {

    public enum Farbe {
        KARO("♦️"), HERZ("♥️"), PIK("♠️"), KREUZ("♣️");
        String symbol;
        Farbe(String sym) { symbol = sym; }
        public String toString() { return symbol; }
    }

    public enum Wert {
        EINS("1"), ZWEI("2"), DREI("3"), VIER("4"), FUENF("5"), SECHS("6"), SIEBEN("7"), ACHT("8"), NEUEN("9"), ZEHN("10"), BUBE("B"), DAME("D"), KOENIG("K"), ASS("A");
        String symbol;
        Wert(String sym) { symbol = sym; }
        public String toString() { return symbol; }
    }

    public final Farbe farbe;

    public final Wert wert;

    public final int augen;

    public Karte(Farbe farbe, Wert wert, int augen) {
        this.farbe = farbe;
        this.wert = wert;
        this.augen = augen;
    }

    @Override
    public String toString() {
        return farbe.symbol + wert.symbol;
    }

}