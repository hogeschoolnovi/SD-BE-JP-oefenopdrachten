package nl.novi.opdrachten.whilelussen;

public class Teller {
    public static void main(String[] args) {
        int teller = 0;
        /*
        Maak een while-lus.
        Deze while-lus moet net zo lang lopen tot en met de teller op 10 staat.
        Elke keer wanneer de teller wordt opgehoogd moet deze uitgeprint worden.
         */

        // Deze while-loop blijft loopen zolang "teller" kleiner is dan 11
        while(teller < 11) {
            // de waarde van teller wordt geprint
            System.out.println(teller);
            // De waarde van teller wordt verhoogt met 1
            // Doen we dat niet, dan krijgen we een eindeloze loop.
            teller++;
        }
    }
}
