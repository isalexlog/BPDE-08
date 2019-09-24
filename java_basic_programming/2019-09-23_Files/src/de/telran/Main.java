package de.telran;

import java.io.IOException;

import static de.telran.FileUtils.*;

public class Main {

    // Write method that read from text file and save read text
    // with the following conversion: if a symbol is in lower case,
    // convert it to upper case, and the opposite: if a symbol is in
    // upper case, convert it to lower case
    // Please assume that file contains only English letters, numbers,
    // punctuation symbols.

    public static void main(String[] args) throws IOException {
        createFile("hello_word.txt;");

        copyBinFile("hello_word.txt", "hello_world_bin.txt");
        copyTextFile("hello_world_bin.txt", "hello_world_copy.txt");
        symbolConverterFile("hello_word.txt", "hello_world_converSymbol.txt");

    }
}