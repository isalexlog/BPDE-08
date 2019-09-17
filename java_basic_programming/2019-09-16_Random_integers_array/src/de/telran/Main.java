package de.telran;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int a = 10;
        int b = 100;
        int c = 20;

        int[]array=new int[c];

        for(int i=0; i<array.length; i++){
            array[i]=(a+1)+(int)(Math.random()*(b-a-1));
        }

        System.out.println(Arrays.toString(array));


       /*  torments of creativity

        int[] array;
        array = new int[c];
        for (int i = 0; i <= c; i++) {
            array[i] = a + (int)  (Math.random() * (b-a));
            System.out.print(array[i] + ",");
        }


        int Random ;
        System.out.print("[");
            for (int i = 1; i <= c ; i++) {
                Random = a + (int) (Math.random() * (b-a));
                System.out.print(Random +"," );
            }
        System.out.print("]");


         */
    }


}
