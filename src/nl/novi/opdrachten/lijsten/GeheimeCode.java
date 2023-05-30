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

    // Deze methode checkt als eerst of naam uit de parameter al in de lijst staat.
    // Zo ja, dan wordt de isUnique variabele op false gezet.
    // Vervolgens wordt de naam uit de parameter toegevoegd aan de lijst, maar alleen als de isUnique variabele true is.
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

    // Deze methode loopt door de lijst van de parameter heen.
    // Vervolgens voegt de methode elke String uit de parameter-lijst toe aan een nieuwe lijst,
    // maar niet voordat die String een encrypt is met behulp van een helper methode.
    // Uiteindelijk wordt er nog maals door de nieuwe lijst geloopt en wordt elke encrypted Strings met een even index omgedraaid.
    // Het statement  i % 2 == 0 wordt gebruikt om te checken of de index even is. Dit checkt namelijk of i deelbaar is door twee en dus even is.
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

    // Deze helper methode maakt als eerst een StringBuilder object.
    // Een StringBuilder is een handige tooltje om Strings te maken die met de append() methode de String opbouwt.
    // Je zou hiervoor in de plaats ook gewoon een lege String variabele kunnen maken x = "" en die telkens uitbreiden met x = x + "toevoeging"
    // Vervolgens loopen we door de characters van de String en zetten we die om naar een nummer met de charToNumber helper methode.
    // Uiteindelijk voegen we dat toe aan de stringbuilder en voegen we nog een streepje - toe en returnen we de String van de stringBuilder.toString()
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

    // Deze helper methode haalt als eerste de encryptedName String uit elkaar met de String.split() methode. We splitten hier niet op spatie, maar op -
    // Dus de String "11-12-13" wordt de array ["11", "12", "13"]
    // Daarnaast maken we ook nog een lege array aan die even lang is als de array die net gemaakt hebben met String.split()
    // Vervolgens loopen we achterwaarts door de splitStringReversed array (array[length-1-i]) heen en voorwaarts door de splitString array (array[i]) om zo de array om te draaien.
    // Uiteindelijk gebruiken we de String.join methode om de array weer tot een String te maken met streepjes - er tussen.
    // Dus ["13", "12", "11"] word "13-12-11"
    private static String reverseEncryptedName(String encryptedName) {
        String[] splitString = encryptedName.split("-");

        String[] splitStringReversed = new String[splitString.length];

        for (int i = 0; i < splitString.length; i++) {
            splitStringReversed[splitString.length - 1 - i] = splitString[i];
        }

        return String.join("-", splitStringReversed);
    }

    // Deze helper methode accepteert een char als input en returned een nummer als String (bijvoorbeeld "2", niet "twee")
    // Als eerste gaan we er van uit dat het om een lower case (geen hoofdletter) char gaat.
    // char heeft zowel een letter waarde als een cijfer waarde. De cijfer waarde van de char 'a' is bijvoorbeeld 97, de waarde van 'b' is 98, etc..
    // Wanneer we dus 'a' (97) van een char aftrekken, dan betekent dat dat de char 'a' vertaalt naar 0, 'b' vertaalt naar 1, etc...
    // Zo komen we dus aan ons nummer.
    // Vervolgens checken we nog of de char niet toch een uppercase (hoofdletter) was, zo ja dan tellen we er nog eens 100 bij op.
    // Tot slot returnen we het uitgerekende nummer als String met de Integer.toString() methode (12 wordt "12")
    private static String charToNumber(char ch) {
        char tempchar = Character.toLowerCase(ch);
        int number = tempchar - 'a' + 1;

        if(Character.isUpperCase(ch)) {
            number = number + 100;
        }
        return Integer.toString(number);
    }


}
