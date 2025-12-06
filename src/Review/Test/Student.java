package Review.Test;

public class Student extends Person {
    private int scores;

    // Person
    public Student(int age, String gender, int scores) {
        super(age, gender); // ke thua
        this.scores = scores;
    }


    @Override
    public String toString() {
        return "Student{" +
                "scores=" + scores +
                '}' + super.toString();
    }
}
