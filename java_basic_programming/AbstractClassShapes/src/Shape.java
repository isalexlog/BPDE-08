public abstract class Shape {
    String displayName;

    public Shape(String displayName) {
        this.displayName = displayName;
    }

    abstract double calculateSquare();
}
