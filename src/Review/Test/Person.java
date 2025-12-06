package Review.Test;

public class Person {
    private int age; // attributes / properties
    private String gender;

    public Person(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }

    // Override: annotation (chu thich) -> ke thua method cua class cha
    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
