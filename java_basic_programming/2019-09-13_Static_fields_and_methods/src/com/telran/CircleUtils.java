package com.telran;

public class CircleUtils {

    private static Logger log = Logger.getLogger(CircleUtils.class);

    public static double PI = 3.1415926;

    public static double circleLength(double radius) {
        if (radius < 0) {
            throw new WrongArgumentException("Radius can not be negative");
        }
        return 2 * PI * radius;
    }

    public static double circleArea(double radius) {
        if (radius < 0) {
            throw new WrongArgumentException("Radius can not be negative");
        }
        return PI * radius * radius;
    }

    public static double squareEquivalent(double radius) {
        if (radius < 0) {
            throw new WrongArgumentException("Radius can not be negative");
        }
        return Math.sqrt(PI * radius * radius);
    }
}

