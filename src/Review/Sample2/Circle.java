package Review.Sample2;

public class Circle extends Shape {
    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    // tinh dien tich - in ra thong tin
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void printArea() {
        System.out.println(getArea());
    }

}
