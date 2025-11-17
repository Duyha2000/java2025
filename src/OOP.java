import java.util.Scanner;

public class OOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();
        ComplexNumber c1 = new ComplexNumber(n1, n2); // real c1 + real c2
        ComplexNumber c2 = new ComplexNumber(n3, n4);
        double totalReal = c1.getReal() + c2.getReal();
        double totalImag = c1.getImag() + c2.getImag();

        System.out.println(totalReal + " + " + totalImag + "i");
    }

    // int hot = sc.nextInt();
    //        int cold = sc.nextInt();
    //        Temperature temperature = new Temperature(hot, cold);
    //        temperature.checkIcyhot();
    //   Circle s1 = new Circle(4.1);
    //        s1.setRadius(5.1);
    //        System.out.println(s1);
    //        // in ra dien tich - in ra chu vi
    //        System.out.println(s1.calculatePerimeter());
    //        System.out.println(s1.calculateArea());
    // Person s1 = new Person("Ha", "Nguyen", 19);
    //        s1.setLastName("Nguyen Viet");
    //        System.out.println(s1);
    //  Book s1 = new Book("Hello", "Viet Ha", "True", 30000.45);
    //        s1.setAuthor("Ha Viet");
    //        System.out.println(s1);
    //
    //        Book s2 = new Book("Hi", "Viet Ha", "False", 30000.45);
    //        System.out.println(s2);
// https://docs.google.com/document/d/1qy5h1qtBPgGwGrsEiU4WPrS_CPPkN2va1QSpBCU21fE/edit?tab=t.0#heading=h.w4efy0otw58h
    // 12A -> 40 hoc sinh -> thong tin (ten + tuoi + dia chi)

    // In ra thong tin cua 1 hoc sinh trong lop 12A  (ten + tuoi + dia chi) -> tao 3 bien roi viet 1 ham in ra gia tri
//    static void display(String name, int age, String diachi) {
//        System.out.println(name + " " + age + " " + diachi);
//    }

    //  Tao ra 1 class Employee gom co 3 thuoc tinh (id, salary va dateOfBirth va in ra thong tin cua nhan vien day!
    // in ra gia tri -> goi ham display trong main()

    // Tao 1 class Rectangle (chieu dai, chieu rong)

    // sua gia tri cua chieu dai - chieu rong sau day in ra gia tri ngoai man hinh

    // constructor: gia tri mac dinh
    //        Rectangle r1 = new Rectangle(5, 9);
//        r1.setChieuDai(9);
//        r1.setChieuRong(4);
//        System.out.println(r1.getChieuDai() + " " + r1.getChieuRong());
//        Employee a = new Employee(); // Dia chi, ten, can cuoc cong dan
//        // a.id = 1303030303;  sua gia tri can cuoc cua em
//        a.setId(1303030303);
//        System.out.println(a.getId());
    //        a.display(4906, 30000, 1990);
//        Employee a2 = new Employee();
//        a2.display(4906, 30000, 1990);
// Object: 1 doi tuong ( 1 con nguoi, con cho con meo 1 cai but)
//        Student s = new Student();
//        s.display("Ha", 18, "HCM");
//        Student s2 = new Student();
//        s2.display("Trung", 20, "HN");
//        Student s3 = new Student();
//        s3.display("H", 2, "HA");
//        s2.age = 18;
//        s2.diachi = "HCM";
//        s2.name = "Ha";
    // 1 hoc sinh
//        String name = "Nguyen Viet Ha";
//        int age = 19;
//        String diachi = "Hai Phong";
//        display(name, age, diachi);
    // 1 hoc sinh -> khoi tao ra 3 bien (name, age, diachi)
//        String name ="Duc Trung";
//        String realAge = "20";
//        String address = "HCM";
// K duoc dat ten bien giong nhau -> code nhin rat rac
}
