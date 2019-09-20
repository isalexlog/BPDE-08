public class Quadrat extends Shape {
    private double aside;

    public Quadrat(double aside) {
        super("Quadrat");
        this.aside = aside;
    }

    @Override
    double calculateSquare() {
        return aside * aside;
    }
}
