package nl.novi.opdrachten.lijsten.helper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    public static List<String> readFile(String fileLocation) {
        List<String> names = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new java.io.FileReader(fileLocation));
            names = readAllLines(bufferedReader);

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return names;
    }

    private static List<String> readAllLines(BufferedReader bufferedReader)  throws IOException {
        List<String> names = new ArrayList<>();
        String line;
        while((line = bufferedReader.readLine()) != null) {
            names.add(line.trim());
        }
        return  names;
    }

    public static void save(List<String> encryptedNames, String fileLocation) throws IOException {
        FileWriter writer = null;
        File file = new File(fileLocation);
        if(!file.exists()) {
            file.createNewFile();
        }
        try {
            writer = new FileWriter(fileLocation);
            for (String encryptedName : encryptedNames) {

                writer.write(encryptedName + "\r\n");
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            writer.close();
        }
    }
}
