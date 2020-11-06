package nl.novi.opdrachten.lijsten;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOefening {

    public static void main(String[] uitlegList) {

        //We hebben een list die de namen van voetbalclubs bevat
        List<String> clubNames = new ArrayList<>();
        //Die vullen we alvast voor de opdracht
        clubNames.add("Ajax");
        clubNames.add("PSV");
        clubNames.add("Feyenoord");
        clubNames.add("Fc Utrecht");
        clubNames.add("Fc Groningen");
        clubNames.add("FC Twente");

        // Vraag -1: Maak een methode die al taak heeft om de list per regel uit te printen.
        printNames(clubNames);

        // Vraag 0: Maak een methode die als taak heeft om de list uit te printen: positie + inhoud.
        // Bovenstaande list zou dan dit zijn:
        // 0 - Ajax
        // 1 - PSv
        // etc...

        // Vraag 1: Maak een methode die checkt of een club al in de lijst zit en voeg deze anders toe.
        System.out.println(checkIfClubIsUnique("Ajax", clubNames));
        System.out.println(checkIfClubIsUnique("FC Knudde", clubNames));


        // Vraag 2: Maak een methode die de positie van de club in de lijst teruggeeft.
        System.out.println("Positie van Ado: " + getPositionOfClub("Ado Den Haag", clubNames));

        // Vraag 3: Maak een methode die de lijst alfabetisch sorteert. Wanneer Ajax niet op positie 0 staat, moeten de
        // clubs die voor Ajax staan verwijderd worden.
        // We voegen nog wat clubs toe om de code te kunnen testen.
        clubNames.add("AA Aachen");
        clubNames.add("AFC Amsterdam");
        clubNames.add("AFC");

        System.out.println("Opdracht 3:");
        sortListAlphabetically(clubNames);
        printNames(clubNames);

        sortAndCheckIfClubNameFirst("Ajax", clubNames);
        printNames(clubNames);



        // Vraag 4: Kun je hetzelfde doen als hierboven, maar PSV moet dan laatste zijn.
        clubNames.add("Zlotty FC");
        clubNames.add("SC Eindhoven");

        sortZToAAndCheckIfClubNameLast("PSV", clubNames);
        printNames(clubNames);


    }

    public static void sortZToAAndCheckIfClubNameLast(String clubName, List<String> clubNames) {
        sortListAlphabetically(clubNames);
        Collections.reverse(clubNames);

        int positionOfClub = getPositionOfClub(clubName, clubNames);
        while(positionOfClub != 0) {
            clubNames.remove(0);
            positionOfClub = getPositionOfClub(clubName, clubNames);
        }

        Collections.reverse(clubNames);

    }


    public static void sortAndCheckIfClubNameFirst(String clubName, List<String> clubNames) {
        sortListAlphabetically(clubNames);

        int positionOfClub = getPositionOfClub(clubName, clubNames);
        while(positionOfClub != 0) { // Zolang de club niet op positie 0 staat, voer onderstaande code uit.
            clubNames.remove(0);
            positionOfClub = getPositionOfClub(clubName, clubNames);
        }
    }

    public static void sortListAlphabetically(List<String> clubNames) {
        java.util.Collections.sort(clubNames);
    }

    public static int getPositionOfClub(String clubName, List<String> clubNames) {
        int position = -1;
        if(checkIfClubIsUnique(clubName, clubNames) == false) {
            for (int i = 0; i < clubNames.size(); i++) {
                if(clubName.equalsIgnoreCase(clubNames.get(i))) {
                    return i;
                }
            }
        }
        return position;
    }

    public static void addClubIfUnique(String newClub, List<String> clubNames) {
        if(checkIfClubIsUnique(newClub, clubNames) == true) {
            clubNames.add(newClub);
        }
    }

    public static boolean checkIfClubIsUnique(String newClub, List<String> clubNames) {
        boolean isUnique = true;
        for(String clubName : clubNames) {
            if(clubName.equalsIgnoreCase(newClub)) {
                isUnique = false;
            }
        }
        return isUnique;
    }

    public static void printNames(List<String> clubNames) {
        //System.out.println(clubNames.get(0));
        //System.out.println("Lengte van de list: " + clubNames.size());

        for (int i = 0; i < clubNames.size(); i++) {
            System.out.println(i + " - " +clubNames.get(i));
        }
        // hieronder

        /*
        for (int i = 0; i < clubNames.size(); i++) {
            System.out.println(clubNames.get(i));
        }

        System.out.println("-----------------");

        for(String clubName : clubNames) {
            System.out.println(clubName.toUpperCase());
        }
        */
    }
}
