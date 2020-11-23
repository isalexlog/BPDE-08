package de.telran;

import java.io.*;

public class FileUtils {

    public static void copyBinFile(String fileName, String newFileName) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream(fileName);
            out = new FileOutputStream(newFileName);

            int c;
            while ((c = in.read()) != - 1) {
                out.write(c);
            }
        } finally {
            if (in != null)
                in.close();
            if (out != null)
                out.close();
        }
    }

    public static void copyTextFile(String fileName, String newFileName) throws IOException {
        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader(fileName);
            out = new FileWriter(newFileName);

            int c;
            while ((c = in.read()) != - 1) {
                out.write(c);
                System.out.println("'" + (char) c + "': " + c);
            }
        } finally {
            if (in != null)
                in.close();
            if (out != null)
                out.close();
        }
    }

    public static void copyTextFileUpperAndLower(String fileName, String newFileName) throws IOException {

        try (
                FileReader in = new FileReader(fileName);
                FileWriter out = new FileWriter(newFileName);
                ){


            int c;
            while ((c = in.read()) != - 1) {
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
}