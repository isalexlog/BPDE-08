package com.telran;

public class CircleUtils {

    private static Logger log = Logger.getLogger(CircleUtils.class);

    public static double PI = 3.1415926;

    public static double circleLength(double radius) {
        return 2 * PI * radius;
    }

    public static double circleArea(double radius) {
        return PI * radius * radius;
    }

    public static double squareEquivalent(double radius) {
        if (radius < 1) {
            log.error("Radius can not be negative");
            return -1;
        }
        return Math.sqrt(PI * radius * radius);
    }
}

