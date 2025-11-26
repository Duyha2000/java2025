package Inheritance.EX1;

// TODO: https://docs.google.com/document/d/1DpywP0xvdCDxOjAXpuKZX3lqEvT4wrhdp6RO_TxhuNY/edit?tab=t.0
/*

==
✔️ Car: getter setter toString constructor
name — tên xe
releaseYear - năm sản xuất
seats — số ghế
==
✔️ Motorbike
name — tên xe
releaseYear - năm sản xuất
engineSize — dung tích động cơ (ví dụ 150cc)

class cha -> diem chung (name, releaseYear)
 */
public class Vehicle {
    private String name;
    private int releaseYear;

    public Vehicle(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }
}
