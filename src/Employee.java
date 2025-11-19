public class Employee {
    private int id;
    private String name;
    private int age;
    private String departmenrt;
    private double salary;

    public Employee(int id, String name, int age, String departmenrt, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.departmenrt = departmenrt;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", departmenrt='" + departmenrt + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartmenrt() {
        return departmenrt;
    }

    public void setDepartmenrt(String departmenrt) {
        this.departmenrt = departmenrt;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}




