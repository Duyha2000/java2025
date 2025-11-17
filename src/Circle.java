public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    /*
        TODO:     Methods:
        calculateArea() - Returns the 'area of the circle.'
        calculatePerimeter() - Returns the perimeter of the circle.
     */
    public double calculateArea() {
        return 2 * Math.PI * radius;

    }

    public double calculatePerimeter() {
        return radius * radius * Math.PI;
    }


}
