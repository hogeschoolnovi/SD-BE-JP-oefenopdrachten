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
        highestNumber(Arrays.asList(1,2,3,4,5,6,22,333,555,7777));
    }

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
