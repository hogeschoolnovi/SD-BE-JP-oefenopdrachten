package nl.novi.opdrachten.whilelussen;

public class Snoepjes {

    public static void main (String[] snoepjes) {
        int aantalSnoepjes = 22;

        // Deze code is uitgecommentarieerd, omdat de code niet compileert zonder dat er aanpassingen plaatsvinden.

        // Het toegevoegde conditionele statement is "aantalSnoepjes > 0"
        // De while loop blijft dus loopen zolang aantalSnoepjes groter dan 0 is
        while(aantalSnoepjes > 0) {
            System.out.println("Er zijn nog " + aantalSnoepjes + " snoepjes over. Tijd om er nog een op te eten.");

            // Hier wordt de waarde van aantalSnoepjes elke iteratie met 1 verlaagt, waardoor de waarde uiteindelijk <0 zal zijn
            aantalSnoepjes--;

        }
        // Wanneer de waarde van aantalSnoepjes 0 is, dus niet meer groter dan 0, zal de while-loop eindigen en wordt de rest van de code uitgevoerd
        System.out.println("De snoepjes zijn op.");
    }
}
