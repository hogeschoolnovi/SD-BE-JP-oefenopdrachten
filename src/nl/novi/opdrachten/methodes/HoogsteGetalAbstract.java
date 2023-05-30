package nl.novi.opdrachten.methodes;

import java.util.Arrays;
import java.util.List;

/**
 * Schrijf een methode  die een List<Integer> ontvangt.
 *
 * Wanneer er twee getallen of meer in zijn:
 * Return het volgende:
 * "Het hoogste getal van de gegeven getallen is: %GETAL%"
 *
 * Je mag hier geen Collections.sort of java.streams gebruiken.
 *
 */
public class HoogsteGetalAbstract {

    public static void main(String[] args) {
        // Hier wordt de methode aangeroep met in de parameter de Arrays.asList() methode.
        // Deze methode kun je gebruiken wanneer je vooraf weet wat er in de lijst komt. Je hoeft dan niet alle waardes een voor een met List.add() to te voegen.
        highestNumber(Arrays.asList(1,2,3,4,5,6,22,333,555,7777));
    }

    // Deze methode loopt door de lijst met nummers heen.
    // Wanneer deze een getal tegen komt dat groter is dan het getal dat opgeslagen staat in de "hoogsteGetal" variabel,
    // dan wijst hij dat nummer als waarde toe aan de "hoogsteGetal" variabele.
    // Uiteindelijk wordt de hoogsteGetal waarde gereturned in een mooie String.
    public static String highestNumber(List<Integer> numbers) {
        int hoogsteGetal = 0;
        for(int number : numbers) {
            if(number > hoogsteGetal) {
                hoogsteGetal = number;
            }
        }
        return "Het hoogste getal van de gegeven getallen is: " + hoogsteGetal;
    }

}
