package de.telran;

import java.util.concurrent.ThreadLocalRandom;

public class MathOperations {

    public static void operator (int a, int b) {

        int nums[] = new int[20];

        int randomNum = ThreadLocalRandom.current().nextInt((a + 1), b);
        
        System.out.print("[");
        for(int i =  0; i < nums.length; i++){

            nums[i] = ThreadLocalRandom.current().nextInt((a + 1), b);
            System.out.print(nums[i]);

            if(i < (nums.length-1)){
                System.out.print(", ");
            }
            else {
                System.out.println("]");
            }

        }
    }

}
