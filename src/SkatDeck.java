import java.util.Random;


public class SkatDeck {

    public static void main(String[] args) {
        SkatDeck deck = new SkatDeck();
        
        System.out.println(deck);

        deck.mischen();


        System.out.println(deck);
    }

    Karte[] deck = new Karte[32];

    public SkatDeck() {
        int i = 0;
        for (Karte.Farbe suit : Karte.Farbe.values()) {
            deck[i++] = new Karte(suit, Karte.Wert.SIEBEN, 0);
            deck[i++] = new Karte(suit, Karte.Wert.ACHT, 0);
            deck[i++] = new Karte(suit, Karte.Wert.NEUEN, 0) ;
            deck[i++] = new Karte(suit, Karte.Wert.ZEHN, 10);
            deck[i++] = new Karte(suit, Karte.Wert.BUBE, 2);
            deck[i++] = new Karte(suit, Karte.Wert.DAME, 3);
            deck[i++] = new Karte(suit, Karte.Wert.KOENIG, 4);
            deck[i++] = new Karte(suit, Karte.Wert.ASS, 11);
        }
    }

    public void mischen() {
        Random ran = new Random();

        for (int i = 0; i < deck.length; i++) {
            int j = ran.nextInt(i+1);
            if(i != j) {
                Karte tmp = deck[i];
                deck[i] = deck [j];
                deck[j] = tmp;
            }
        }
    }

    public int stichZuordnen(Karte k0, Karte k1, Karte k2) {
        return -1;
    }

    @Override
    public String toString() {
        String s = "";
        for(Karte card : deck) {
            s += card + " ";
        }
        return s;
    }
    
}
