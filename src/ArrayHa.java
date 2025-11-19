import java.util.ArrayList;
import java.util.Scanner;

public class ArrayHa {
    public static void main(String[] args) {
        //Tạo một ArrayList chứa tên 5 học sinh. In toàn bộ danh sách ra màn hình.
//        ArrayList<String> students = new ArrayList<>(Arrays.asList("ha", "viet", "huy", "quynh", "giang"));
////        students.add("ha");
////        students.add("viet");
////        students.add("huy");
////        students.add("hoang");
////        students.add("hieu");
//        for (String student : students) System.out.print(student + " ");
        // ArrayList:
        // 1 danh sach -> luu tru cac bien co cung kieu du lieu
//        int [] scores  = {1,2,3,4,5};
//        int [] arr2 = new int[5]; // Khi khoi tao array -> cho no kich thuoc
        // ArrayList: xoa ky tu t -> viet t lai -> enter
//        ArrayList<Integer> scores = new ArrayList<>();

        // them phan tu: 'add'
//        scores.add(5);
//        scores.add(8);
//        scores.add(11);
//        scores.add(14);

        // in ra cac phan tu trong arraylist:
        // C1: for index
//        for (int i = 0; i < scores.size(); i++) {
//            System.out.print(scores.get(i) + " ");
//        }
        // for each:
//        for (Integer score : scores) {
//            System.out.print(score + " ");
//        }
        // TODO: Bài 1 – Thêm và in danh sách
        // TODO: Bài 2 – Tìm phần tử: cho ArrayList số nguyên. Kiểm tra xem số x có tồn tại hay không.
        // [1,2,3,4,5] -> Input x = 3 -> In ra yes || input x = 6 -> in ra no
//        Scanner scanner = new Scanner(System.in);
//        int x = scanner.nextInt();
        // In ra trong vong lap for -> in ra nhieu lan -> sai ket qua
//        boolean isCheck = false;
//        for (Integer number : numbers) {
//            if (number == x) {
//                isCheck = true;
//                break;
//            }
//        }
//        if (isCheck == true) System.out.println("yes");
//        else System.out.println("No");
        // contains: chua gia tri:
//        if (numbers.contains(x)) System.out.println("Yes");
//        else System.out.println("No");
//TODO:        Bài 3 – Đếm số chẵn
//        Cho ArrayList số nguyên. In ra số lượng phần tử là số chẵn.
//        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
//        int count = 0;
//        for (Integer number : numbers) {
//            if (number % 2 == 0) {
//                count++;
//            }
//        }
//        System.out.println(count);

        /*
        7. Hồ sơ xét tuyển
        Đơn xin xét tuyển theo mẫu
        1 Bản sao (công chứng) bằng tốt nghiệp THPT hoặc giấy chứng nhận tốt nghiệp tạm thời.
        1 Bản sao (công chứng) học bạ THPT/ bổ túc THPT
        1 Bản sao (công chứng) chứng minh nhân dân
        2 hình 3x4
        'Nguyen Le Quoc Ca' + '...' -> |40-50tr| -> 20tr

        Bài 7 – Đảo ngược ArrayList
        Dao nguoc cac so trong array
        Input:  9 5 3 4 1
                0 1 2 3 4
        Output: 1 4 3 5 9
                4 3 2 1 0
         */
//        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(9, 5, 3, 4, 1));
//        for (int i = numbers.size() - 1; i >= 0; i--)
//            System.out.print(numbers.get(i) + " ");
//        Collections.reverse(numbers); // reverse: dao nguoc
//        for (Integer number : numbers) System.out.print(number + " ");
//        Bài 8 – Ghép 2 ArrayList
//        Cho 2 ArrayList -> gộp các so 2 array nay vao array thu 3
        // Array1:  1,3 ,5,7
        // Array2: 4 6 8 9
        // Array3: 1 3 5 7 4 6 8 9
//        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 3, 5, 7));
//        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(4, 6, 8, 9));
//        ArrayList<Integer> numbers3 = new ArrayList<>();
        // day cac so array1 -> array3
        // day cac so array2 -> array3
        // addAll: them tat ca cac phan tu trong array
//        numbers3.addAll(numbers1);
//        numbers3.addAll(numbers2);
//        for (Integer number : numbers3)
//            System.out.print(number + " ");

        // xoa phan tu trong arrayList: clear | remove
        // numbers2.remove(2);  8
        // Xoa cac phan tu < 0 trong 1 array 5 phan tu {1,3,-4,-5,9}
//        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, -3, 4, -5, 9));
//        ArrayList<Integer> positives = new ArrayList<>(); // luu tru phan tu so duong
//
//        for (Integer number : numbers) {
//            if (number >= 0) {
//                positives.add(number);
//            }
//        }
//        for (Integer num : positives) {
//            System.out.println(num);
//        }
        // Bài 10 – Quản lý sinh viên (easy)
        //Tạo class Student gồm name, age.
        //
        //Cho ArrayList<Student> chứa nhiều sinh viên. Hãy:
        //1. Thêm sinh viên ( 3 thang)
        //2. Tìm sinh viên theo tên
        //3. In danh sách sinh viên có tuổi ≥ 18
//        ArrayList<Student> students = new ArrayList<>();
        // Tao 1 thang hoc sinh moi
//        students.add(new Student("ha", 19));
//        students.add(new Student("huy", 20));
//        students.add(new Student("hoang", 23));
        // In ra 3 hoc sinh trong students:
//        for (Student student : students)
//            System.out.println(student);
        // In ra ten Ha cho anh:
//        System.out.println(students.get(0).getName());

        // Nhap ten 1 sinh vien va check xem ten day trong ArrayList hay ko
        // Co in yes -> ko in no
        // VD: Nhap Ha -> Yes | Nhap Quynh -> No
//        boolean isCheck = false;
        Scanner sc = new Scanner(System.in);
        // Nhap ten hoc sinh muon tim:
//        String name = sc.nextLine();
//        // student(
//        // == -> equals
//        for (Student student : students) {
//            if (Objects.equals(student.getName(), name)) {
//                isCheck = true;
//                break;
//            }
//        }
//        if (isCheck) System.out.println("yes");
//        else System.out.println("no");

//        for (Student student : students) {
//            if (student.getAge() >= 20)
//                System.out.println(student.getName());
//        }

        /*
Problem 2: Employee Management System
Objective: Create a program to manage employees using a class called Employee and an ArrayList. Perform operations such as adding employees, displaying employee details, and finding employees based on criteria.
Step 1: Create the Employee class
The Employee class should have the following attributes:
int id - The employee ID.
String name - The employee's name.
int age - The employee's age.
String department - The department the employee works in.
double salary - The employee's salary.
Add the following methods:
A constructor to initialize all attributes.
A toString() method to return a formatted string of the employee's details.
Step 2: Create the Main program
Use an ArrayList to store objects of type Employee. The program should perform the following operations:
1. Add 2 new employees.
2. Display all employees.
3. Calculate the average salary of all employees.
         */
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(4906, "duy", 20, "Clean dishes", 20.999));
        employees.add(new Employee(4926, "ha", 19, "Waiter", 17.999));
//        for (Employee employee : employees)
//            System.out.println(employee);
        double totalSalaries = 0, average;
        for (Employee employee : employees) {
            totalSalaries += employee.getSalary();
        }
        average = totalSalaries / employees.size();
        System.out.println(average);

    }
}
