package com.telran;

import java.lang.Math;
import java.util.Scanner;

import static com.telran.CircleUtils.*;

public class Main {

    /*
    In com.telran.CircleUtils add validation into every method checking if radius
    is not negative. If radius is negative, log error with with error method
    of Logger class. and then return -1.

    Create static method that
    - receives two integer parameters a and b,
    - returns random integer that is less then b and greater then a.
    Fill with the method an array of 20 integers, and print array values
    into the console into the one line.
    Line must start with '[' and end with ']'. Elements in the line must
    be separated with commas (',').

    */

    /*
    HW 2019-09-20
    1.Create WrongArgumentException class and throw this exception
    if argument is not valid. Please extend RuntimeException and
    use you own error message.

    2. throw this exception in all CircleUtils Methods

    3. Modify main in the following way:
    - ask user if he wants to calculate circle length, circle area or square
    equivalent, or he wants to exit
    - ask user for the radius
    - calculate the desired value
    - use try catch to inform user that wrong argument was supplied

     */

    public static void main(String[] args) {
        Logger log = Logger.getLogger(Main.class);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your request: 1 - length, 2 - area, 3 - square equivalent, any other key to exit");
        int choice = scanner.nextInt();

        int radius = 0;
        if (choice == 1 || choice == 2 || choice == 3) {
            System.out.println("Please give me a radius");
            radius = scanner.nextInt();
        }

        switch (choice) {
            case 1:
                try {
                    log.info(circleLength(radius));
                }
                catch (WrongArgumentException e) {
                    System.out.println("Wrong argument: " + e.getMessage());
                }
                break;
            case 2:
                try {
                    log.info(circleArea(radius));
                }
                catch (WrongArgumentException e) {
                    System.out.println("Wrong argument: " + e.getMessage());
                }
                break;
            case 3:
                try {
                    log.info(squareEquivalent(radius));
                }
                catch (WrongArgumentException e) {
                    System.out.println("Wrong argument: " + e.getMessage());
                }
                break;
            default:
                System.out.println("Bye!");
                break;
        }
    }
}
