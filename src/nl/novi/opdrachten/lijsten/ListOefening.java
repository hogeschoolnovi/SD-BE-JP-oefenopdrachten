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

        // Vraag -1: Maak een methode die als taak heeft om de list per regel uit te printen.

        // We roepen hier enkel de methode aan met de juiste parameter. De methode staat onderaan gedefinieerd.
        printList(clubNames);

        // Vraag 0: Maak een methode die als taak heeft om de list uit te printen: positie + inhoud.
        // Bovenstaande list zou dan dit zijn:
        // 0 - Ajax
        // 1 - PSv
        // etc...

        // Dit is wederom slechts de aanroep van de methode met de juiste parameter. De definitie staat onderaan.
        printListWithIndex(clubNames);

        // Vraag 1: Maak een methode die checkt of een club al in de lijst zit en voeg deze anders toe.

        // In plaats van "clubnames.add" hebben we nu een methode gemaakt, zodat er geen dubbele clubs in de lijst komen.
        // De methode wordt hier aangeroepen met als parameters de clubnames-lijst en de naam van de club die we toe willen voegen.
        addClub(clubNames, "DOSC");

        // Vraag 2: Maak een methode die de positie van de club in de lijst teruggeeft.

        // De aanroep van de methode. De uitkomst (return waarde) slaan we op in de variabele "position", zodat we dit later kunnen gebruiken.
        int position = positionInList(clubNames, "DOSC");

        // Vraag 3: Maak een methode die de lijst alfabetisch sorteert. Wanneer Ajax niet op positie 1 staat, moeten de
        // clubs die voor Ajax staan verwijderd worden.
        // We voegen nog wat clubs toe om de code te kunnen testen.

        clubNames.add("AA Aachen");
        clubNames.add("AFC Amsterdam");
        clubNames.add("AFC");

        // We roepen hier als eerst onze nieuwe methode aan en daarna de printListWithIndex methode om te zien dat het werkt
        sortListAndAjaxFirst(clubNames);
        System.out.println("List after sorting and Ajax first:");
        printListWithIndex(clubNames);


        // Vraag 4: Kun je hetzelfde doen als hierboven, maar PSV moet dan laatste zijn.
        clubNames.add("Zlotty FC");
        clubNames.add("SC Eindhoven");

        System.out.println("PSV last: ");
        clubNames = sortListAndPsvLast(clubNames);
        System.out.println("List after sorting and PSV Last:");
        printListWithIndex(clubNames);

    }

    /** Deze methode ontvang een Lijst van Strings in de parameter.
     * Als eerste print deze methode de String "The clubs in the list: ".
     * Vervolgens loopt de methode door de lijst heen en print elke String (club) in die lijst.
     */
    public static void printList(List<String> clubs) {
        System.out.println("The clubs in the list: ");
        for(String club : clubs) {
            System.out.println(club);
        }
    }

    /**
     * Deze methode ontvangt een Lijst van Strings in de parameter.
     * Als eerste print deze methode de String "Clubs in list with position: ".
     * Vervolgens loopt de methode door de lijst heen en print elke String (club) met het bijbehorende index nummer.
     * Je zult misschien al hebben opgemerkt dat hier geen gebruik wordt gemaakt van een for-each (of enhanced-for) loop. maar van een klassieke for-loop.
     * Dit is omdat een for-each loop niet (makkelijk) bij de index van het item kan. Een klassieke for-loop kan dat wel, dat is namelijk de loop-variabele (in de meeste gevallen)
     */
    public static void printListWithIndex(List<String> clubs) {
        System.out.println("Clubs in list with position: ");
        for (int i = 0; i < clubs.size(); i++) {
            System.out.println(i + " : " + clubs.get(i));
        }
    }

    /**
     * Deze methode ontvangt twee parameters. Als eerst de lijst met clubnamen. Als tweede de naam van de club die we willen toevoegen.
     * Deze methode maakt gebruik van een helper methode (isUnique) om te bepalen of de nieuwe naam niet al in de lijst staat.
     * Als de nieuwe naam nog niet in de lijst staat, wordt deze toegevoegd met de List.add() methode, zoals we ook in main doen.
     */
//    Je hebt misschien al opgemerkt dat we de lijst uit de parameter wel aanpassen, maar niet returnen. Toch werkt deze code wel.
//    Dat is omdat deze methode (en de lijst ook) static is. Dit komt later in de cursus nog aan bod, maar je mag het al vast googlen als je nieuwsgierig bent.
    public static void addClub(List<String> clubs, String name) {
        if(isUnique(clubs,name)) {
            clubs.add(name);
        }
    }

    /**
     * Deze methode loopt door de lijst heen en checkt of een van de namen uit de lijst overeenkomt met de naam uit de parameter.
     * Als dat zo is, dan wordt er "false" gereturned. Als er geen match is, dan wordt "true" gereturned.
     */
    public static boolean isUnique(List<String> clubs, String name) {
        for(String club : clubs) {
            if(club.equalsIgnoreCase(name)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Deze methode vraagt als input een Lijst van String en een String en geeft als output een int.
     * Als eerst checkt de methode of de gegeven String wel in de lijst staat,
     * zo ja, dan loopt de methode door de lijst heen en checkt voor elke String in de lijst of deze overeenkomt met de String in de parameter.
     * Wanneer er een match gevonden is, returned de methode de loop-variabele. Dit is het indexnummer van de String in de lijst die overeenkomt met de String uit de parameter.
     */
    public static int positionInList(List<String> clubs, String name) {
        if(!isUnique(clubs, name)) {
            for (int i = 0; i < clubs.size(); i++) {
                if(name.equalsIgnoreCase(clubs.get(i))) {
                    return i;
                }
            }
        }
        return -1;
    }

    /**
     * Deze methode gebruikt Collections.sort() om de lijst te sorteren.
     * Het is een uitdagende, maar leuke oefening om je eigen sorteer methode te schrijven. Daar zijn op internet genoeg algoritmen voor te vinden zoals mergesort, insertionsort of bubblesort.
     * Verder loopt de methode door de lijst heen met een while-loop.
     * Deze loop verwijderd telkens het eerste item uit de lijst, zolang de index van "Ajax" niet 0 (de eerste positie in een lijst) is.
     */
    public static void sortListAndAjaxFirst(List<String> clubs) {
        Collections.sort(clubs);

        while(positionInList(clubs, "Ajax") != 0) {
            clubs.remove(0);
        }
    }

    /**
     * Deze methode doet bijna hetzelfde als de sortListAndAjaxFirst methode.
     * Als eerst vind deze methode de index van PSV, want Ajav was de eerst in de lijst, dus die heeft altijd de index 0,
     * maar PSV moete de laatste in de lijst worden, dus de index van psv is afhankelijk van wat er verder in de lijst staat.
     * Vervolgens maakt deze methode een tempList variabele aan, waarin we m.b.v een for-loop alle item uit de lijst naartoe verplaatsen, totdat we bij de index van PSV zijn.
     */
    // Je hebt misschien al opgemerkt dat deze methode WEL een lijst returned, ook al is de methode ook static, net als de addClub methode.
    // Dat komt omdat we in deze methode niet de aanpassingen doen op de lijst uit de parameter, maar juist een nieuwe lijst aanmaken en die returnen.
    public static List<String> sortListAndPsvLast(List<String> clubs) {
        Collections.sort(clubs);

        int indexPsv = positionInList(clubs, "psv");
        System.out.println("index PSV: " + indexPsv);

        List<String> tempList = new ArrayList<>();

        for (int i = 0; i < clubs.size(); i++) {
            if(i <= indexPsv) {
                tempList.add(clubs.get(i));
            }
        }
        return tempList;
    }
}
