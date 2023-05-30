package nl.novi.opdrachten.lijsten;

import nl.novi.opdrachten.lijsten.helper.FileReader;

import java.io.IOException;
import java.util.List;

public class VersleutelNamenLijst {
    private static final String FILE_LOCATION = "src/nl/novi/opdrachten/lijsten/verzetsleden.txt";
    private static final String ENCRYPTED_FILE_LOCATION = "src/nl/novi/opdrachten/lijsten/secret.txt";

    /**
     * Bijgevoegd is verzetsleden.txt
     * Maak een programma dat verzetsleden.txt uitleest.
     * Versleutel de namen op dezelfde manier als in GeheimeCode.java
     * En sla de versleutelde namen op in secret.txt
     *
     */

    // Deze methode gebruikt de FileReader class uit de helper package om het bestand "verzetsleden.txt" uit te lezen.
    // Vervolgens wordt de GeheimeCode klasse gebruikt om de namen te encrypten.
    public static void main(String[] args) throws IOException {
        List<String> names = FileReader.readFile(FILE_LOCATION);

        List<String> encryptedNames = GeheimeCode.encryptList(names);
        for(String eName : encryptedNames) {
            System.out.println(eName);
        }

        FileReader.save(encryptedNames, ENCRYPTED_FILE_LOCATION);

    }
}
