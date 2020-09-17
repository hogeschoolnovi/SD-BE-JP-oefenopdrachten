package nl.novi.opdrachten.methodes;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Schrijf een methode  die een List<Integer> ontvangt.
 *
 * Check in de methode of deze list 3 entries heeft.
 *
 * Wanneer dit niet zo is: return de foutmelding: "Er zijn te veel of te weinig getallen in de lijst."
 * BONUS: Kun je een foutmelding voor te veel en een foutmelding voor te weinig maken?
 *
 * Wanneer er wel drie getallen in zijn:
 * Return het volgende:
 * Een list met getallen gesorteerd van laag naar hoog.
 *
 * Je mag hier geen Collections.sort of java.streams gebruiken.
 *
 */
public class SorteerLijst {

    public static void main(String[] argeblabla) {

        List<Integer> wrongList = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 6, 7, 8));
        List<Integer> correctList = new ArrayList<>(Arrays.asList(88, 888, 909909));
        List<Integer> correctList2 = new ArrayList<>(Arrays.asList(8888, 888, 909909));
        List<Integer> correctList3 = new ArrayList<>(Arrays.asList(909909, 888, 8888));

        System.out.println(sortList(wrongList));
        System.out.println(sortList(correctList));
        System.out.println(sortList(correctList2));
        System.out.println(sortList(correctList3));

    }

    public static String sortList(List<Integer> numbers) {
        if(numbers.size() != 3) {
            return "Er zijn te veel of te weinig getallen in de lijst.";
        }
        if(numbers.get(0) > numbers.get(1)) {
            Collections.swap(numbers, 0, 1);
        }
        if(numbers.get(1) > numbers.get(2)) {
            Collections.swap(numbers, 1, 2);
            if(numbers.get(0) > numbers.get(1)) {
                Collections.swap(numbers, 0, 1);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer i : numbers) {
            stringBuilder.append(i).append(" ");
        }
        return stringBuilder.toString();
    }
}
