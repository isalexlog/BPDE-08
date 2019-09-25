package de.telran;

import java.io.IOException;

import static de.telran.FileUtils.*;

public class Main {

    public static void main(String[] args) throws IOException {
	    copyBinFile("Hello_World_Text", "Hello_World.txt");
        copyTextFile("Hello_World_Text", "hello_world2.txt");
        copyTextFilewithUpperandLowerCase("Hello_World_Text", "copyTextFilewithUpperandLowerCase.txt");
    }
}
