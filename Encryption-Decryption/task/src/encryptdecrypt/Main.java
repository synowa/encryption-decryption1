package encryptdecrypt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        String mode = "enc";
        String data = null;
        String out = null;
        int key = 0;
        char[] charsFromMessage;
        String in = null;
        for (int i = 0; i < args.length - 1; i++) {
            if ("-mode".equals(args[i])) {
                mode = args[i + 1];
            } else if ("-key".equals(args[i])) {
                key = Integer.parseInt(args[i + 1]);
            } else if ("-data".equals(args[i])) {
                data = args[i + 1];
            } else if ("-in".equals(args[i])) {
                in = args[i + 1];
            } else if ("-out".equals(args[i])) {
                out = args[i + 1];
            }
        }

        if (data != null || in == null) {
            if (data == null) {
                data = "";
            }
            charsFromMessage = data.toCharArray();
        } else {
            try {
                new String(Files.readAllBytes(Paths.get(in)));
            } catch (IOException e) {
                System.out.println("Error " + e.getMessage());
            }
            charsFromMessage = ReadingFile.readFileAsString(in).toCharArray();
        }

        if ("enc".equals(mode)) {
            if (out != null) {
                File file = new File(out);
                try (FileWriter writer = new FileWriter(file, false)) {
                    for (char c : charsFromMessage) {
                        c = (char) (c + key);
                        writer.write(c);
                    }
                } catch (IOException e) {
                    System.out.println("Error " + e.getMessage());
                }
            } else {
                for (char c : charsFromMessage) {
                    c = (char) (c + key);
                    System.out.print(c);
                }
            }
        } else if ("dec".equals(mode)) {
            if (out != null) {
                File file = new File(out);
                try (FileWriter writer = new FileWriter(file, false)) {
                    for (char c : charsFromMessage) {
                        if (c - key <= 122) {
                            c = (char) (c - key);
                        } else {
                            c = (char) (c - key + 26);
                        }
                        writer.write(c);
                    }
                } catch (IOException e) {
                    System.out.println("Error " + e.getMessage());
                }
            } else {
                for (char c : charsFromMessage) {
                    if (c - key <= 122) {
                        c = (char) (c - key);
                    } else {
                        c = (char) (c - key + 26);
                    }
                    System.out.print(c);
                }
            }
        }
    }
}