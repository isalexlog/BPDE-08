package de.telran;
import java.util.HashSet;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        int a, b;
        int c = 100;
        var randNum = new HashSet<Integer>();

        for (b = 0; b < c; b++) {
            a = rand.nextInt(100);
            randNum.add(a);
            if (randNum.size() <= 10) {
                if (randNum.size() == 10) {
                    c = 10;
                }
                c++;
                randNum.add(a);
            }
        }
        System.out.println("Ten random numbers: " + randNum);
    }
}
