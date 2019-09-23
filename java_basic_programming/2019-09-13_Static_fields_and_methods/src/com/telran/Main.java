package com.telran;

import java.lang.Math;
import java.util.Scanner;

import static com.telran.CircleUtils.*;

public class Main {


    public static void main(String[] args) {
        Logger log = Logger.getLogger(Main.class);

        log.info(PI);
        log.info(circleLength(5));
        log.info(circleArea(5));
        log.info(squareEquivalent(1));
        log.info(Math.sqrt(PI));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your request: 1 - length, 2 - area, 3 - square equivalent, or any other way to exit");
        int number = scanner.nextInt();

        try {
            switch (number) {
                case 1:
                    System.out.println("Please enter a radius: ");
                    System.out.println(circleLength(scanner.nextDouble()));
                    break;
                case 2:
                    System.out.println("Please enter a radius: ");
                    System.out.println(circleArea(scanner.nextDouble()));
                    break;
                case 3:
                    System.out.println("Please enter a radius: ");
                    System.out.println(squareEquivalent(scanner.nextDouble()));
                case 4:
                    break;
                default:
                    System.out.println("Oops!Wrong argument, please try again!");
            }
        } catch (WrongArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

