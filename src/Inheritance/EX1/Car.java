package Inheritance.EX1;

// ✔️ Car: getter setter toString constructor
//name — tên xe
//releaseYear - năm sản xuất
//seats — số ghế
public class Car extends Vehicle {
    private int seats;

    public Car(String name, int releaseYear, int seats) {
        super(name, releaseYear); // super: thừa hưởng thuộc tính của cha
        this.seats = seats;
    }
    // ko can phai lam getter setter cua name, releaseYear

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    // toString:
    @Override
    public String toString() {
        return super.toString() + seats;
    }
}
