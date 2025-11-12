public class Method {
    public static void main(String[] args) {
        // Gọi hàm
//        print();
//        int x = sum(5);
//        System.out.println(x);
//        int y = sum(10);
//        System.out.println(y);
//        int x = sum(4);
//        System.out.println(x);
//        int x = factorial(5);
//        System.out.println(x);
//        double x = area(4);
//        System.out.println(x);
//        double y = circumference(4);
//        System.out.println(y);

//        if (isEven(10)) {
//            System.out.println("So chan");
//        } else {
//            System.out.println("So le");
//        }
//        if (check(76)) {
//            System.out.println("Dung");
//        } else {
//            System.out.println("Sai");
//        }
//        if (isPrimeNumber(11)) {
//            System.out.println("Prime");
//        } else System.out.println("Not a prime number ");
//        if (isPerfectnumber(28))
//            System.out.println("Is Perfect number");
//        else System.out.println("Not a Perfect number");
//        int x = GCD(48, 60);
//        int y = maxPrime(12);
//        System.out.println(y); // Largest prime factor: 3
        int x = power(2, 3);
        System.out.println(x); // 8 = 2^3 = 2 * 2 * 2
        // so lan lap se dua vao opponent
    }

    static int power(int base, int opponent) {
        int multiply = 1;
        for (int i = 1; i <= opponent; i++) multiply *= base;

        return multiply;
    }

    //TODO: Exercise 6: Calculate Power of a Number
    //Problem: Calculate the power of a base number raised to an exponent.
    //Example:
    //Input: Enter base: 2 Enter exponent: 3
    //Output: Result: 8

//    static boolean isPerfectnumber(int n) {
//        int sum = 0;
//        for (int i = 1; i < n; i++) {
//            if (n % i == 0) sum += i;
//        }
//        // tim ra duoc tong cac uoc cua n = 14
//        // n nhap vao la 14
//        // sum = n -> return true
//        return sum == n;
//    }

    static int GCD(int a, int b) {
        int GCD = 1;
        for (int i = 1; i < a || i < b; i++) {
            if (a % i == 0 && b % i == 0) GCD = i; // Gan de gia tri: GCD = 12
        }
        return GCD; // 12
    }

    // '12' = 2 * 2 * 3 -> In ra so nguyen to lon nhat thoa man dieu kien
    // Print 3
    // Hint: no phai la so nguyen to va la uoc cua 12 -> for( if ( 2 dieu kien))
    static boolean isPrimeNumber(int n) {
        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // Tim ra cho anh uoc lon nhat cua 12:
    static int maxPrime(int x) {
        int maxPrime = 2;// so nguyen to nho nhat
        for (int i = 1; i < x; i++) {
            if (isPrimeNumber(i) && x % i == 0) maxPrime = i; // [2 3 6]
        }
        return maxPrime;
    }

    /*
    Exercise 11: Find the Greatest Common Divisor (GCD) and Largest Prime Factor
    Problem: Find the greatest common divisor (GCD) of two numbers, decompose it into prime factors, and display the largest prime factor.
    Example:
    Input: Enter the first number: 48 Enter the second number: 60
    Output: GCD of 48 and 60 is: 12 Prime factor decomposition of 12: 2 * 2 * 3 Largest prime factor: 3
    -> Tim uoc chung lon nhat cua 2 so a va b:
    // 48: 1 2 3 4 6 8 [12] 24
    // 60: 1 2 3 4 5 6 10 [12] 15 20 30 60
    // GCD: 12 (2 so 48 va 60 cung chia het cho so lon nhat la 12 -> 12 la uoc chung lon nhat cua 2 so nay)


    TODO:    Exercise 8: Check Perfect Number
    Problem: Check if a positive integer n is a perfect number (a number whose divisors' sum equals the number itself).
    Example:
    Input: Enter a positive integer n: 6
    Output:  6 is a perfect number (1 + 2 + 3 = 6)

    Input: Enter a positive integer n: 10
    Output:  10 is a not perfect number (1 + 2 + 5 = 8 != 10)

    TODO: Exercise 4: Prime Number Check
    Problem: Check if a positive integer n is a prime number.
    Example:
    Input: Enter a positive integer n: 11
    Output: 11 is a prime number: True
    -> So nguyen to la so chi chia het cho 1 va chinh no, khong chia het cho so nao trong khoang tu 2 -> n-1

    Vi du: 8: [1 2 4 8] -> K phai so nguyen to (vi so 8 chia het cho 2 va 4)
          11: [1 11] -> La so nguyen to ( vi so 11 khong chia het cho so nao tu 2 cho den 10)

     */
    // Nhap vao 1 so xem so day co > 0 va chia het cho 5 va 7 hay khong, co in ra true, khong in ra false
    static boolean check(int n) {
        return n > 0 && n % 5 == 0 && n % 7 == 0;
    }


//    static boolean isEven(int n) {
//        // return true - false
//        if (n % 2 == 0) {
//            return true;
//        }
//        return false;
//    }
    // TODO: Exercise 7: 'Check' Even or Odd Number
    //Problem: Check if a positive integer n is even or odd.
    //Example:
    //Input: Enter a positive integer n: 10
    //Output: 10 is an even number


    // TODO: Viet 1 ham in ra cac so tu 1 den 5
    static void print() {
        for (int i = 0; i <= 5; i++) {
            System.out.print(i + " ");
        }
    }


    static int factorial(int n) {
        int multi = 1;
        for (int i = 1; i <= n; i++) {
            multi *= i;
        }
        return multi;
    }

    static double area(double R) {
        return R * R * Math.PI;
    }

    static double circumference(double R) {
        return 2 * R * Math.PI;
    }

// 1 + 2 + 3 = 6
//    static int sum(int n) {
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum += i;
//        }
//        return sum;
//    }
//
//    static int sum(int n) {
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum += i * i;
//        }
//        return sum;
//    }
        /*
        Exercise 3: Calculate Area and Circumference of a Circle
        Problem: Calculate the area and circumference of a circle with a given radius.
        Example:
        Input: Enter the radius of the circle: 7
        Output: Circle Area: 153.94 ( pi * R * R )
        Circle Circumference: 43.96 ( 2* pi * R)

        Exercise 2: Calculate the Factorial
        Problem: Enter a positive integer n, calculate its factorial, and find the sum of its digits.
        Example:
        Input: Enter a positive integer n: 5
        Output: Factorial of 5 is 120 (1 * 2 * 3 * 4 * 5)



        Exercise 1: Calculate the Sum of Consecutive Natural Squares
        Problem:
        Example:
        Input: Enter a positive integer n: 4
        Output: The sum of squares from 1 to 4 is: 30 ( 1^2+2^2+3^2+4^2 = 30)

        Exercise 0: Calculate the Sum from 1 to n
        Problem: Enter a positive integer n and calculate the sum of numbers from 1 to n.
        Example:
        Input: Enter a positive integer n: 10
        Output: The sum from 1 to 10 is: 55
     */



    /*
    void: print value
    boolean/int/double: tinh toan gia tri -> can return ve 1 gia tri

            // https://meet.google.com/jce-rsds-pnh
        // https://docs.google.com/document/d/130YMvQO2tqBXioqX3mvP7hk9l58QUsWZmrhXUXrG_h4/edit?tab=t.0#heading=h.b945vx857czl
        // In ra cac so tu 1 -> 5
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i);
//        }
//
//        for (int i = 1; i <= 7; i++) {
//            System.out.println(i);
//        }
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }
        // Java -> lap trinh khac
        // 1 ngoi nha
//        display(5);
//        display(7);
//        display(10);

        // code trong java chay trong main() -> muốn kết qua tra ve duoc thi phai goi method
        // call method -> goi ham
//        System.out.println(sum15());
    Exercise 3: Calculate Area and Circumference of a Circle
    Problem: Calculate the area and circumference of a circle with a given radius.
    Example:
    Input: Enter the radius of the circle: 7
    Output: Circle Area: 153.94 ( pi * R * R )
    Circle Circumference: 43.96 ( 2* pi * R)
     */


    // Tinh tong cac so chan tu 1 -> 15
//    static int sum15() {
//        int sum = 0;
//        for (int i = 1; i <= 15; i++) {
//            if (i % 2 == 0)
//                sum += i;
//        }
//        return sum;
//    }
//
//
//    // tra ve gia tri la gi: 1 so nguyen -> int
//    static int sumNumber() {
//        int sum = 0;
//        for (int i = 0; i <= 5; i++) {
//            sum += i;
//        }
//        return sum; // return -> sum
//    }
//
//    // Method: ko viet code trong main (de sua) -> giam so dong code lap lai
//    static void display(int n) {
//        for (int i = 1; i <= n; i++) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//    }


    // tinh tong cac so tu 1 -> 5

    // Cac buoc lam bai tap method:
    // B1: Viet 1 ham va xac dinh cac phan nhu sau:
    // B1.1: xax dinh return type( gia tri ma no se tra ve): void, int , double, float
    // B1.2: method name: ten ham
    // B1.3: (int n, m) -> parameter: tham so
    // B1.4: viet code ben trong method -> return o dong cuoi cung gia tri

    // B2: call method trong ham main()


}
