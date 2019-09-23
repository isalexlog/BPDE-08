package com.telran;

import java.lang.Math;
import java.util.InputMismatchException;
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
    - ask user if he wants to calculate circle length, circle area or square
    equivalent, or he wants to exit
    - ask user for the radius
    - calculate the desired value
    - use try catch to inform user that wrong argument was supplied
     */

    public static void main(String[] args) throws Exception {
        Logger log = Logger.getLogger(Main.class);


            System.out.println("Wants you wont calculate of circle: 1. length, 2. area, 3. square?");
            Scanner scanner = new Scanner(System.in);
            Integer whatCounting = scanner.nextInt();


                if(whatCounting == 1) System.out.println("You have chosen to calculate the length");
                if(whatCounting == 2) System.out.println("You have chosen to calculate the area");
                if(whatCounting == 3) System.out.println("You have chosen to calculate the square");

                int radius;

                if (whatCounting == 1 || whatCounting == 2 || whatCounting == 3) {
                    System.out.println("Write a radius: ");
                    radius = scanner.nextInt();
                }else{
                    System.out.println("Something went wrong..");
                    return;
                }
                    try {
                        switch (whatCounting) {
                            case 1:
                                log.info(circleLength(radius));
                                break;
                            case 2:
                                log.info(circleArea(radius));
                                break;
                            case 3:
                                log.info(squareEquivalent(radius));
                                break;

                        }
                    }
                    catch (WrongArgumentException e) {
                        System.out.println("Wrong argument: " + e.getMessage());
                    }
                    catch (InputMismatchException e){
                        System.out.println("Please input integer");
                    }


    }
 }
