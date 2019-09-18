package de.telran;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] a = new int[20];
        int low = 10;
        int high = 100;



        //new comment
        for(int i = 0; i < a.length; i++){
            a[i] = getRandom(low, high);
            System.out.println(Arrays.toString(a));

        }

    }

    public static int getRandom (int low, int high){
        Random r = new Random();
        return r.nextInt(high-low) + low;
    }


}
