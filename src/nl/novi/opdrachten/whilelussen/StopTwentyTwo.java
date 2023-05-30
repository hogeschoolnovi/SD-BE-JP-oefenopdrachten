package nl.novi.opdrachten.whilelussen;

/**
 * Bekijk onderstaande while-lus.
 * Zorg ervoor dat de while-lus stopt op regel 22.
 */

public class StopTwentyTwo {
    public static void main(String[] tt) {
        int teller = 1;
        while(teller < 100) { // Deze regel mag niet aangepast worden.
            System.out.println("Getal: " + teller);
            // Door dit if-statement toe te voegen, stoppen we wanneer de while-loop bij 22 komt.
            // Het "break" statment zorgt dat de executie van een loop beindigd wordt.
            // De code gaat dan gewoon verder met de code die nog onder de sluit-accolade van de while loop staat.
            // Dat is anders dan een "return", want die zou de complete methode afbreken. "break" breekt enkel de loop af.
            // "break" kan ook in if-statements of switch-statements gebruikt worden.
            if(teller == 22) {
                break;
            }
            // Dit is een andere schrijfwijze voor "teller++"
            teller = teller + 1;
        }
        // Wanneer we hier nog code zetten, wordt dat uitgevoerd nadat de while-loop bij 22 is geweest (en dus break uitvoerd heeft)
    }
}
