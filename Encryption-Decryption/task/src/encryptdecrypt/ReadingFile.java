package encryptdecrypt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadingFile {
    public static String readFileAsString(String roadToTreasure) {
        try {
            return new String(Files.readAllBytes(Paths.get(roadToTreasure)));
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
            return "";
        }
    }
}