package de.telran;

import java.io.*;

public class FileUtils {
    public static void copyBinFile (String fileName, String newFileName) throws IOException {

        try (FileInputStream in = new FileInputStream(fileName); FileOutputStream out = new FileOutputStream(newFileName)) {

            int c;
            while ((c = in.read()) != -1) {
                if (Character.isUpperCase(c)) {
                    c = Character.toLowerCase(c);
                } else {
                    c = Character.toUpperCase(c);
                }
                out.write(c);
                System.out.println("'" + (char) c + "': " + c);
            }
        }
    }

    public static void copyTextFile(String fileName, String newFileName) throws IOException {

        try (FileReader in = new FileReader(fileName); FileWriter out = new FileWriter(newFileName)) {

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
                out.write(" ");
                System.out.println("'" + (char) c + "': " + c);
            }
        }
    }
}
