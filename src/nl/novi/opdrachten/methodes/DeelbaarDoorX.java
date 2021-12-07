package nl.novi.opdrachten.methodes;

/**
 * Schrijf een methode die twee Integers ontvangt.
 * De eerste parameter heet 'number', de tweede 'divisible'
 *
 * Het is de bedoeling dat je checkt of 'number' deelbaar is door 'divisible'
 *
 * Wanneer het deelbaar is, return het volgende:
 * Het getal: %HIER GETAL% is deelbaar door %HIER DIVISIBLE%.
 * Wanneer het niet deelbaar is:
 * Het getal: %HIER GETAL% is niet deelbaar door %HIER DIVISIBLE%. Verlaag of verhoog het getal
 * %HET GETAL WAARMEE HET VERHOOGT OF VERLAAGD MOET WORDEN%
 *
 * VOORBEELD:
 *
 * De methode ontvangt de getallen 13 en 3, dan zou het resultaat moeten zijn:
 * Het getal: 13 is niet deelbaar door 3. Verlaag het getal met 1.
 *
 * VOORBEELD 2:
 * De methode ontvangt de getallen 14 en 3, dan zou het resultaat moeten zijn:
 * Het getal: 14 is niet deelbaar door 3. Verhoog het getal met 1.
 *
 */

public class DeelbaarDoorX {

    public static void main(String[] args) {
        System.out.println(isDivisible(12, 3));
        System.out.println(isDivisible(15, 5));
        System.out.println(isDivisible(13, 3));
        System.out.println(isDivisible(14, 3));
        System.out.println(isDivisible(14, 4));
    }

    private static String isDivisible(int number, int divisible) {
        if(number % divisible == 0) {
            return number + " is deelbaar door " + divisible;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Het getal ").append(number).append(" is niet deelbaar door: ").append(divisible)
                .append(".\r\n");

        int restNumber = number % divisible;
        double deling = (double) restNumber/divisible;

        if(deling < 0.50) {
            stringBuilder.append("Verlaag het getal met ").append(restNumber);
        } else {
            stringBuilder.append("Verhoog het getal met ").append(divisible-restNumber);
        }
        return stringBuilder.toString();
    }

}
