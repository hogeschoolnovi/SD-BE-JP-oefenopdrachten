package nl.novi.opdrachten.methodes;

/**
 * Schrijf een methode die een Integer ontvangt.
 * Wanneer het getal deelbaar is door 5, laat hem de volgende tekst returnen:
 * 'deelbaar door vijf'
 * Wanneer het getal niet deelbaar is door vijf:
 * 'ondeelbaar door vijf'
 */


public class DeelbaarDoorVijf {

    public static void main(String[] sammieKijkOmhoog) {
        int chosenNumber = 44;

        // We gebruiken hier het "remainder" teken % om te kijken of het deelbaar is door 5
        // omdat we de hardcoded waarde 44 gebruiken, geeft IntelliJ ook al de waarschuwing dat de uitkomst altijd false is.
        if(chosenNumber % 5 == 0) {
            System.out.println("Deelbaar door vijf.");
        } else {
            System.out.println("Ondeelbaar door vijf.");
        }
    }
}
