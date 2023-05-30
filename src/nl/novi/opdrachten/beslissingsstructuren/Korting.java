package nl.novi.opdrachten.beslissingsstructuren;

import java.util.Scanner;

public class Korting {
    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);

        System.out.println("Wat is het aankoopbedrag?");
        double aankoopBedrag = userInputScanner.nextDouble();

        // We definieren hier eerst een variabele van type String, waarin we het kortingspercentage opslaag a.d.h.v. het ingevulde aankoopbedrag.
        String korting;

        // We maken een if else if else structuur, waarin we >= (groter dan of gelijk aan) gebruiken om te checken welke korting de klant krijgt.
        // We kunnen dit if-statement ook herschrijven met >, < of <=, maar let er dan op dat je de (hardcoded) getallen uit de vergelijking dan wellicht ook moet aanpassen.
        if(aankoopBedrag >= 300.01) {
            korting = "16";
            aankoopBedrag = aankoopBedrag - aankoopBedrag * 0.16;

        } else if( aankoopBedrag >= 75) {
            korting = "10";
            aankoopBedrag = aankoopBedrag - aankoopBedrag * 0.10;
        } else {
            korting = "0";
        }

        // Als laatst printen we de uitkomsten van onze berekening (korting en aankoopBedrag) uit in een mooie String
        System.out.println("De klant krijgt " + korting + "% korting. Het aankoopbedrag is nu: " + aankoopBedrag);


        /*
        Hierboven is het aankoopbedrag ingevoerd. Het is de bedoeling dat jij de korting bepaalt en het nieuwe bedrag
        uitrekent.

        Wanneer het ingevoerde bedrag onder de 75 is, krijgt de klant geen korting. Print uit:
        "De klant krijgt geen korting. Het aankoopbedrag blijft -HIER HET BEDRAG-"

        Wanneer het ingevoerde bedrag 75,00 of hoger is, maar kleiner of gelijk aan 300.00 dan krijgt de klant 10%
        korting. Print uit:
        "De klant krijgt 10% korting. Het aankoopbedrag is nu: -HIER HET BEDRAG MET KORTING-"

        Wanneer het ingevoerde bedrag 300.01 of hoger is, krijgt de klant 16% korting. Print uit:
        "De klant krijgt 16% korting. Het aankoopbedrag is nu: -HIER HET BEDRAG MET KORTING-"
         */

    }
}
