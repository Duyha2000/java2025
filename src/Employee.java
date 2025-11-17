public class Employee {
    // cac attributes ko duoc de truy cap!
    // private
    private int id;
    private int salary;
    private int dateOfBirth;

    // getter (lay ra ) - setter (cap nhat lai)

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // public
    public void display(int id, int salary, int dateOfBirth) {
        System.out.println(id + "\n" + salary + "\n" + dateOfBirth);
    }
}
