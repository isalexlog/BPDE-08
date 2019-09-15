public class CircleUtils {

    public static double PI = 3.1415926;

    public static double circleLength(double radius) {
        if (radius < 0)
            return -1;
        return 2 * PI * radius;
    }

    public static double circleArea(double radius) {
        if (radius < 0)
            return -1;
        return PI * radius * radius;
    }

    public static double squareEquivalent(double radius) {
        if (radius < 0)
            return -1;
        return Math.sqrt(PI * radius * radius);
    }
}
