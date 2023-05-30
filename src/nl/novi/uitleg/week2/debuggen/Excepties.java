package nl.novi.uitleg.week2.debuggen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Excepties {

    /**
     * Java heeft verschillende ingebouwde excepties, zoals:
     *
     * 1. ArithmeticException
     * 2. ArrayIndexOutOfBoundsException
     * 3. FileNotFoundException
     * 4. IOException
     * 5. NullPointerException
     * 6. StringIndexOutOfBoundException
     */

    static char[] board;

    public static void main(String[] args) {
        voorbeeldNullPointerException();
        voorbeeldStringIndexOutOfBoundException();
        voorbeeldArthmeticException();
        voorbeeldArrayIndexOutOfBoundsException();
        voorbeeldFileNotFoundException();
//        Haal de // bij onderstaande regel weg om de exceptie te gooien.
        //voorbeeldIOException();
    }

    //Haal de // weg op de exceptie te fixen.
    public static void voorbeeldNullPointerException() {
        //board = new char[9];
        System.out.println(board.length);
    }

    //Haal de // weg op de exceptie te fixen.
    public static void voorbeeldStringIndexOutOfBoundException() {
        String s = "aa";
        //if(s.length() >= 77) {
        s.charAt(77);
        //}
    }

    //Haal de // weg op de exceptie te gooien.
    public static void voorbeeldArthmeticException() {
        //int cijfer = 12 / 0;
    }

    //Haal de // weg op de exceptie te gooien.
    public static void voorbeeldArrayIndexOutOfBoundsException() {
        int[] nummer = {1,2,3};
        //System.out.println(nummer[4]);
    }

    //Haal de // weg om de exceptie te gooien.
    //Je ziet dat de code dan meteen niet compiled, omdat FileNotFoundException geen RuntimeException is
    public static void voorbeeldFileNotFoundException() {
//            FileReader fileReader = new FileReader("Test.txt");

    }

    /**
     *
     * @throws IOException wanneer de code toegang probeert te krijgen tot een bestand dat
     * al in gebruik is of als het lezen of schrijven onverwacht onderbroken wordt.
     * Met het "throws" keyword, kun je de zorg voor het afhandelen van een exception afschuiven naar de aanroeper van de methode.
     */
    public static void voorbeeldIOException() throws IOException{

    }






}
