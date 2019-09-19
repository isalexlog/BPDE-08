public class Rectangle extends Shape {
    private double aside;
    private double bside;

    public Rectangle(double aside, double bside) {
        super("Rectangle");
        this.aside = aside;
        this.bside = bside;
    }
    @Override
    double calculateSquare() {
        return aside * bside;
    }
}
