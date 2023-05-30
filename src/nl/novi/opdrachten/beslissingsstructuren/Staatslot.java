package nl.novi.opdrachten.beslissingsstructuren;

import java.util.Scanner;

public class Staatslot {
    public static void main(String[] args) {
        Scanner gebruikersInput = new Scanner(System.in);

        System.out.println("Wat is uw leeftijd?");
        int gegevenLeeftijd = gebruikersInput.nextInt();

        // We gebruiken hier een if/else statement waarin we > (groter dan) gebruiken om te checken of de gegeven leeftijd groter is dan 17.
        // Let op dat >17 dus betekent "18 of hoger", met andere woorden "exclusief 17"
        if(gegevenLeeftijd > 17) {
            System.out.println("U mag een staatslot kopen");
        } else {
            System.out.println("Jij mag geen staatslot kopen");
        }

        // Maak hieronder een beslissingsstructuur (if/else).
        // Wanneer iemand ouder is dan 17 print het bericht: "U mag een staatslot kopen"
        // Wanneer iemand 17 jaar of jonger is, print het bericht: "Jij mag geen staatslot kopen."

    }
}
