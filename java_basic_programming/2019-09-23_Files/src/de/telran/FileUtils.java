package de.telran;

import java.io.*;

public class FileUtils {

    public static void createFile(String fileName){
        try {
            File file = new File("hello_word.txt");
            if (!file.exists())
                file.createNewFile();


            PrintWriter pw = new PrintWriter(file);
            pw.println("Everything is working");
            pw.println("Hello word");
            pw.println("And i Wont write number:" + 87);
            pw.close();

        } catch (IOException e){
            System.out.println("Error: " + e);
        }
    }

    public static  void copyBinFile(String fileName, String newFileName) throws IOException{

        try (
                FileInputStream in = new FileInputStream(fileName);
                FileOutputStream out = new FileOutputStream(newFileName);
         ){
            int c;
            while ((c = in.read()) != -1){
                out.write(c);
                System.out.println("'" + (char) c + "': " + c);
            }
        }
    }

    public static void copyTextFile(String fileName, String newFileName) throws IOException{
        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader(fileName);
            out = new FileWriter(newFileName);

            int c;
            while ((c = in.read()) != -1){
                out.write(c);
                out.write(" ");
                System.out.println("'" + (char) c + "': " + c);
            }
        } finally {
            if (in != null)
                in.close();
            if (out != null)
                out.close();
        }
    }

    public static void symbolConverterFile(String fileName, String newFileName) throws IOException{

        BufferedReader in = new BufferedReader(new FileReader(fileName));
        PrintWriter out = new PrintWriter(new FileWriter(newFileName));

        try {

            int c;

            while ((c = in.read())!= -1){
                if(Character.isLowerCase(c)){
                    c = Character.toUpperCase(c);
                }
                else {
                    c = Character.toLowerCase(c);
                }
                out.write(c);
            }

        } finally {
            in.close();
            out.close();
        }

    }


}
