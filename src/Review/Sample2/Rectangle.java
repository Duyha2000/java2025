package Review.Sample2;

// Hinh tron, hinh chu nhat

// 2 ham: tinh dien tich -> in dien tich
public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getArea() {
        return width * length;
    }

    public void printArea() {
        System.out.println(getArea());
    }
}
