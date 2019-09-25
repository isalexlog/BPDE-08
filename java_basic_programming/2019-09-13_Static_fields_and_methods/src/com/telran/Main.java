package com.telran;

import java.util.Scanner;
import static com.telran.CircleUtils.*;

public class Main {

/*
    HW 2019-09-20
    1.Create WrongArgumentException class and throw this exception
    if argument is not valid. Please extend RuntimeException and
    use you own error message.

    2. throw this exception in all CircleUtils Methods

    3. Modify main in the following way:
    - ask user if he wants to calculate circle length, circle area or square equivalent, or he wants to exit
    - ask user for the radius
    - calculate the desired value
    - use try catch to inform user that wrong argument was supplied
*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to calculate a circle length, circle area, square equivalent, or do you want to exit? " +
                "(1 - circle length, 2 - circle area, 3 - square equivalent, 4 - exit): ");
        int number = scanner.nextInt();
        try {
            switch (number) {
                case 1:
                    System.out.println("Please enter radius: ");
                    System.out.println(circleLength(scanner.nextDouble()));
                    break;
                case 2:
                    System.out.println("Please enter radius: ");
                    System.out.println(circleArea(scanner.nextDouble()));
                    break;
                case 3:
                    System.out.println("Please enter radius: ");
                    System.out.println(squareEquivalent(scanner.nextDouble()));
                case 4:
                    break;
                default:
                    System.out.println("You have entered the wrong number. There is no such method.");
            }
        } catch (WrongArgumentException e) {
            System.out.println("You have entered inappropriate radius value");
        }
    }
}
