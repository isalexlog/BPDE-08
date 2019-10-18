package de.telran;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    List<String> names = new ArrayList<>();
	    names.add("Ivan");
        names.add("Maria");
        names.add("Stephan");
        names.add("John");
        names.add("Amalia");

        List<String> newListOfNames = exceptNamesWithLengthFour(names);
        System.out.println(newListOfNames);
    }

    public static List<String> exceptNamesWithLengthFour(List<String> names) {
        List<String> newListOfNames = new ArrayList<>();
        for (String string : names) {
            if(string.length() > 4)
                newListOfNames.add(string);
        }
        return newListOfNames;
    }
}
