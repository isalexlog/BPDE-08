package com.telran;

import java.lang.Math;

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

    new comment just to add smth to commit

    */

    public static void main(String[] args) {
        Logger log = Logger.getLogger(Main.class);

        log.info(PI);
        log.info(circleLength(5));
        log.info(circleArea(5));
        log.info(squareEquivalent(1));
        log.info(Math.sqrt(PI));

        log.info(squareEquivalent(-1));
    }
}
