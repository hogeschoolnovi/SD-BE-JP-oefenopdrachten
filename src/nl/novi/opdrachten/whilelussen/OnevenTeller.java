package nl.novi.opdrachten.whilelussen;

public class OnevenTeller {
    public static void main(String[] oneven) {
        /*
        Maak een while-lus.
        Deze while-lus moet net zo lang lopen tot en met de teller op 10 staat.
        Print alleen de oneven getallen uit!
         */
        int teller = 0;
        // Deze while loop is net als de "EvenTeller" opdracht
        while(teller < 11) {
            // (teller % 2 == 0) betekend dat "teller" even is, want als je er telkens 2 af haalt tot het niet meer kan, dan blijft er niks over
            // (teller % 2 == 1) betekend dat "teller" oneven is, want als je er telkens 2 af haalt to het niet meer kan en er blijft nog 1 over, dan is het dus een oneven getal.
            if(teller % 2 == 1) {
                System.out.println(teller);
            }
            teller++;
        }
    }
}
