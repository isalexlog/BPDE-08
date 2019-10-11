package de.telran;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("yellow");

        System.out.println(colors.contains("green"));
        System.out.println(colors.contains("black"));

        String text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry Lorem Ipsum has been the industry's standard dummy text ever since the 1500s when an unknown printer took a galley of type and scrambled it to make a type specimen book It has survived not only five centuries but also the leap into electronic typesetting remaining essentially unchanged It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum";
        //String text = "First Second Third First Second Third";
        String[] words = text.split(" ");
        
        System.out.println("Number of words in the text:" + words.length);
        
        Set<String> uniqueWords = new HashSet<>();
        
        for (String word: words) {
            uniqueWords.add(word);
        }
        
        System.out.println("Number of unique words:" + uniqueWords.size());
        
        for (String uniqueWord: uniqueWords) {
            System.out.println(uniqueWord);
        }
    }
}
