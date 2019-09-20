public class Circle extends Shape  {
    private double rad;
    private static double pi = 3.14;

    public Circle(double rad) {
        super("Circle");
        this.rad = rad;
    }

    @Override
    double calculateSquare() {
        return pi * (rad * rad);
    }
}
