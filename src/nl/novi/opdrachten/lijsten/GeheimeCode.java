package nl.novi.opdrachten.lijsten;

import java.util.ArrayList;
import java.util.List;

public class GeheimeCode {

    public static void main(String[] secret) {

        List<String> laResistanceMembers = new ArrayList<>();

        laResistanceMembers = addMembers(laResistanceMembers, "Arie");
        laResistanceMembers = addMembers(laResistanceMembers, "Sjaak");
        laResistanceMembers = addMembers(laResistanceMembers, "Henrie");
        laResistanceMembers = addMembers(laResistanceMembers, "Piet");
        laResistanceMembers = addMembers(laResistanceMembers, "LeDroitCestMoi");
        laResistanceMembers = addMembers(laResistanceMembers, "aaa");

        /*
        Opdracht 1: Hierboven zijn via de methode addMembers, leden aan de lijst toegevoegd. Pas de Methode zo aan dat
         er alleen unieke namen in voor mogen komen.
         */

        /*
        Opdracht 2: La Resistance wil niet dat de lijst met namen zo in handen komt te vallen van de bezetter. Versleutel
        Maak een methode die de lijst op de volgende manier versleuteld:
        a) Verander elke letter naar het nummer in het alfabet. Voeg na elke veranderde letter een - toe
        (behalve de laatste). Dus a wordt 1, b wordt 2 et cetera.
        Wanneer een letter een hoofdletter is, moet je beginnen met tellen bij 100. Dus A wordt 101, B wordt 102.
        Voorbeeld: Alex wordt versleuteld naar: 101-12-5-24
        b) Als de positie in de lijst een even getal is, dan moet de cijfercombinatie omgedraaid worden.
         */
        System.out.println("Encrytped list:");
        for( String s: encryptList(laResistanceMembers)) {
            System.out.println(s);
        }

        /*
        Opdracht 3:
        Schrijf een methode die de versleutelde lijst kan omzetten naar de ontsleutelde lijst.
         */
    }

    private static List<String> addMembers(List<String> members, String name) {
        boolean isUnique = true;
        for(String member : members) {
            if (name.equalsIgnoreCase(member)) {
                isUnique = false;
                break;
            }
        }
        if(isUnique) {
            members.add(name);
        }
        return members;
    }

    // Made public for VersleutelNamenLijst
    public static List<String> encryptList (List<String> members) {
        List<String> encryptedList = new ArrayList<>();

        for(String member : members) {
            encryptedList.add(encryptName(member));
        }

        for (int i = 0; i < encryptedList.size(); i++) {
            if (i % 2 == 0) {
                encryptedList.set(i, reverseEncryptedName(encryptedList.get(i)));
            }
        }

        return encryptedList;
    }

    private static String encryptName(String name) {
        StringBuilder encryptedNameBuilder = new StringBuilder();
        for (int i = 0; i < name.length(); i++) {
            String number = charToNumber(name.charAt(i));
            encryptedNameBuilder.append(number);
            if(i < name.length() - 1) {
                encryptedNameBuilder.append("-");
            }
        }
        return encryptedNameBuilder.toString();
    }

    private static String reverseEncryptedName(String encryptedName) {
        String[] splitString = encryptedName.split("-");

        String[] splitStringReversed = new String[splitString.length];

        for (int i = 0; i < splitString.length; i++) {
            splitStringReversed[splitString.length - 1 - i] = splitString[i];
        }

        return String.join("-", splitStringReversed);
    }

    private static String charToNumber(char ch) {
        char tempchar = Character.toLowerCase(ch);
        int number = tempchar - 'a' + 1;

        if(Character.isUpperCase(ch)) {
            number = number + 100;
        }
        return Integer.toString(number);
    }


}
