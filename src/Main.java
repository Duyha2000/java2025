import java.util.Scanner;

// https://docs.google.com/document/d/1ESB8fY-5GSJi65RTXlDRnXS7UQlVXVzip07nS6JCVIc/edit?tab=t.0#heading=h.28tx88f7t32x
// https://docs.google.com/document/d/1n4n52y7RjgHDgp8qLMpNg1Fqi0CQp2zodFrFjWFNrOk/edit?tab=t.0
public class Main {
    public static void main(String[] args) {
        // data type: int, double, String, char, boolean
//        int a = 4;
//        int b = 5;
        // sout -> tab
//        System.out.println(a); // output
        // Input trong java:
        // Khai bao scanner (class Scanner)

        // a + b;
//        int a = scanner.nextInt(); // input integer
//        int b = scanner.nextInt();
//        System.out.println(a + b);

        // Nhập vào a,b là chiều dài chiều rộng hình chữ nhật, tính chu vi - > diện tích
/*
        int a = scanner.nextInt();
        int b = scanner.nextInt(); // int
        double c = scanner.nextDouble();
        String x = scanner.nextLine(); // next() : "hello" "morning"
        char d = scanner.nextLine().charAt(0); // 'h' 'e' 'l' 'l' 'l' intput character
        boolean isDark = scanner.nextBoolean();
        int perimeter = 2 * (a + b);
        int area = a * b;
        System.out.println(perimeter);
        System.out.println(area);
        // Nhập vào 1 cạnh là bán kính hình troòn (double) -> tính chu vi, diện tích hình tròn
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double perimeter = Math.PI * (2 * a);
        double area = Math.PI * (a * a);
        System.out.println(area);
        System.out.println(perimeter);
        Operator: + - * % (module) / (divide)
 */
//        System.out.println(31 % 4); // module -> 3 (dư)
//        System.out.println(31 / 4); // divided by
        // 39 % 5 = 4

        // even number: 2 4 6 8 10 (chia hết cho 2) -> chia cho 2 số dư = 0
        // Nhập vào 1 số check số ấy >0 hay ko, có thì in ra positive, negative
        // + 1 truong hop nua -> = 0
        // Notes: đầu -> if, cuoois else, else if
        // '==' dùng ở if
        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        if (a > 0) {
//            System.out.println("Positive");
//        } else if (a == 0) {
//            System.out.println("Zero");
//        } else {
//            System.out.println("Negative");
//        }

        /*
            Problem 2: Compare the salaries of two people: Input the salaries of two people from the keyboard. Compare and print:
            "person1" if the first person has a higher salary.
            "person2" if the second person has a higher salary. Requirements:
            Use if/else.
int per1 = scanner.nextInt();
        int per2 = scanner.nextInt();
        if (per1 > per2) {
            System.out.println("person1");
        } else if (per1 == per2) {
            System.out.println("equals");
        } else {
            System.out.println("person2");
        }
         */
        /*
            Problem 3: Grade classification: Input an integer score and classify the grade:
            "Weak" if score <= 50.
            "Average" if 50 < score <= 60. -> and && or ||
            "Good" if 60 < score <= 75.
            "Very Good" if 75 < score <= 90.
            "Excellent" if the score is > 90.
        int score = scanner.nextInt();
        if (score <= 50) {
            System.out.println("Weak");
        } else if (score <= 60) {
            System.out.println("Average");
        } else if (score <= 75) {
            System.out.println("Good");
        } else if (score <= 90) {
            System.out.println("Very good");
        } else
            System.out.println("Excellent");
         */
        /*
            'Problem 5: Print the name of the day of the week. Input 'an integer' from 0 to 6 and print the corresponding day name:'
            0: "Sunday".
            1: "Monday".
            2: "Tuesday".
            3: "Wednesday".
            4: "Thursday".
            5: "Friday".
            6: "Saturday".
            Requirements:
            Use if/else if/else.
             int a = scanner.nextInt();
        if (a == 0) {
            System.out.println("Sunday");
        } else if (a == 1) {
            System.out.println("Monday");
        } else if (a == 2) {
            System.out.println("Tuesday");
        } else if (a == 3) {
            System.out.println("Wednesday");
        } else if (a == 4) {
            System.out.println("Thursday");
        } else if (a == 5) {
            System.out.println("Friday");
        } else if (a == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid input! Please retry ");
        }
         */
        /*
            Problem 4: Check if a year is a leap year: Input an integer year from the keyboard and determine if it's a leap year.
            Print: "Year <year> is a leap year!" if it is.
            Print: "Year <year> is not a leap year!" if it isn’t.
            Rules: A year is a leap year if it is divisible by 4 but not divisible by 100, 'or' it is divisible by 400.
            ||
             int year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " a leap year");
        } else {
            System.out.println("not a leap year");
        }
         */

        /*
        Problem 6: Perform basic arithmetic: Input two integers a and b and a character c from
        the keyboard representing an arithmetic operation (+, -, *, /). Calculate and print the result. Example:
        If a = 7, b = 9, and c = '+', print: 16.
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        char c = scanner.nextLine().charAt(0);
        if (c == '+') {
            System.out.println(a + b);
        } else if (c == '-') {
            System.out.println(a - b);
        } else if (c == '*') {
            System.out.println(a * b);
        } else if (c == '/') {
            System.out.println(a / b);
        } else
            System.out.println("Invalid");
         */
        /*
                Problem 9: Calculate discount percentage based on category and quantity:
                Discount Rules:
                +Categories A, B, C:
                Less than 2 items: 0% discount.
                2 to 5 items: 15% discount.
                6 to 10 items: 25% discount.
                More than 10 items: 30% discount.
                +Category D:
                1% discount per item, up to a maximum of 50 items (50% discount). -> 30 items 30% [60 -> 50]
                Input:
                category: A string indicating the product category ("A", "B", "C", or "D").
                quantity: An integer representing the number of items.
         */

        char category = scanner.next().charAt(0);
        int quantity = scanner.nextInt();
        int discount = 0;
        if (category == 'A' || category == 'B' || category == 'C') {
            if (quantity < 2) {
                discount = 0;
            } else if (quantity < 5) {
                discount = 15;
            } else if (quantity < 10) {
                discount = 25;
            } else
                discount = 30;
        } else if (category == 'D') {
            if (quantity < 50) {
                discount = quantity;
            } else {
                discount = 50;
            }
        } else {
            System.out.println("Invalid input! Please try again!");
        }
        System.out.println(discount);


    }
}