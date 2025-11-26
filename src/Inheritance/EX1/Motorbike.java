package Inheritance.EX1;

// ✔️ Motorbike
//name — tên xe
//releaseYear - năm sản xuất
//engineSize — dung tích động cơ (ví dụ 150cc)
// code bi trung lap thuoc tinh

// Motorbike - Car => Vehicle ()
// method
// OOP
public class Motorbike extends Vehicle {
    private int engineSize;

    public Motorbike(String name, int releaseYear, int engineSize) {
        super(name, releaseYear); // super: thừa hưởng thuộc tính của cha
        this.engineSize = engineSize;
    }

    // Override -> ke thua tu thang cha (ko mang tac dung ve code) -> annotation (chu thich)
    // super la ke thua method cua thang cha!
    @Override
    public String toString() {
        return super.toString() + engineSize;
    }
}
