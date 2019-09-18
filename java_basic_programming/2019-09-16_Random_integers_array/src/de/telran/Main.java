package de.telran;

import java.util.Arrays;
import java.util.Random;

public class Main {

    /*
    I'm making this comment to demonstrate how to keep
    up-to-date branches in the fork repository
     */
    public static void main(String[] args) {
        int[] arrayOfInt = new int[20];
        for (int i = 0; i < arrayOfInt.length; i++) {
            arrayOfInt[i] = randomNumber(100, 200);
        }
        System.out.println(Arrays.toString(arrayOfInt));
    }

    public static int randomNumber(int a, int b) {
        int diff = b - a;
        Random random = new Random();
        int c = random.nextInt(diff + 1);
        c += a;
        return c;
    }
}
