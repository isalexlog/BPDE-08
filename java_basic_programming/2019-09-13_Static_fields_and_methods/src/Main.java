import logger.Logger;

import java.lang.Math;

public class Main {

    /*
    ***
    In CircleUtils add validation into every method checking if radius
    is not negative. If radius is negative, log error with with error method
    of Logger class. and then return -1.

    Create static method that
    - receives two integer parameters a and b,
    - returns random integer that is less then b and greater then a.
    Fill with the method an array of 20 integers, and print array values
    into the console into the one line.
    Line must start with '[' and end with ']'. Elements in the line must
    be separated with commas (',').
    new

    */

    public static void main(String[] args) {
        Logger log = Logger.getLogger(Main.class);

        log.info(CircleUtils.PI);
        log.info(CircleUtils.circleLength(5));
        log.info(CircleUtils.circleArea(5));
        log.info(CircleUtils.squareEquivalent(1));
        log.info(Math.sqrt(CircleUtils.PI));
    }
}
