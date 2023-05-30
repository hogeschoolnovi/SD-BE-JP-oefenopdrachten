package nl.novi.opdrachten.whilelussen;

public class EvenTeller {
    public static void main(String[] even) {
        /*
        Maak een while-lus.
        Deze while-lus moet net zo lang lopen tot en met de teller op 10 staat.
        Print alleen de even getallen uit!
         */
        int teller = 0;
        // De while loop blijft itereren zolang teller niet gelijk is aan 11
        // Een andere manier om hetzelfde resultaat te bereiken is (teller < 11)
        while(teller != 11) {
            // We gebruiken hier de remainder (%) om te kijken of "teller" deelbaar is door 2 (en dus even is)
            if(teller % 2 == 0) {
                System.out.println(teller);
            }
            // Vergeet niet teller te verhogen, anders krijg je een endless loop
            teller ++;
        }
    }
}
