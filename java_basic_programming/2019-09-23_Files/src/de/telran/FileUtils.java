package de.telran;

import java.io.*;

public class FileUtils {

    public static void copyBinFile(String fileName, String newFileName) throws IOException {

        try (
                FileInputStream in = new FileInputStream(fileName);
                FileOutputStream out = new FileOutputStream(newFileName)
        ) {
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
                System.out.println("'" + (char) c + "': " + c);
            }
        }
    }

    public static void copyTextFile(String fileName, String newFileName) throws IOException {

        try (
                FileReader in = new FileReader(fileName);
                FileWriter out = new FileWriter(newFileName)
        ) {

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
                out.write(" ");
                System.out.println("'" + (char) c + "': " + c);
            }
        }
    }

    public static void conversionTextFile(String fileName, String newFileName) throws IOException {

        try (
                FileReader in = new FileReader(fileName);
                FileWriter out = new FileWriter(newFileName)
        ) {

            int c;
            while ((c = in.read()) != -1) {
                if (Character.isLowerCase(c)) {
                    c = Character.toUpperCase(c);
                } else {
                    c = Character.toLowerCase(c);
                }
                    out.write(c);
                }
            }
        }

    }




