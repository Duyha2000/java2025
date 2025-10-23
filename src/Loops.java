public class Loops {
    public static void main(String[] args) {
        // https://docs.google.com/document/d/1ESB8fY-5GSJi65RTXlDRnXS7UQlVXVzip07nS6JCVIc/edit?tab=t.0#heading=h.28tx88f7t32x
        // https://meet.google.com/pcf-ofbc-cnh
        // https://docs.google.com/document/d/1ESB8fY-5GSJi65RTXlDRnXS7UQlVXVzip07nS6JCVIc/edit?tab=t.0

        // '1 -> 5' -> 1 2 3 4 5
        // for( khoi tao; dieu kien; step){
        // }
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i);
//        }
        // print even number tu '0 -> 10'
//        for (int i = 0; i <= 10; i++) {
//            if (i % 2 == 0) System.out.println(i);
//        }
        // In ra các số từ 5 -> -5 (5 4 3 2 1 0 -1 -2 -3 -4 -5)
//        for (int i = 5; i > -6; i--) {
//            System.out.print(
//            i + " ");
//        }

        // Tính tổng các số từ 0 -> 5
        //TODO: BT tính tổng:
        // B1: int sum = 0
        // b2: sum += i
        // B3: print sum ( out of loops)
        /*
        int sum = 0;
        for (int i = 0; i <= 5; i++) {
        //            System.out.println(i);
            sum += i; // sum = sum + i
        }
        System.out.println(sum);
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = n; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
         Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        // for i
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
        int sum = 0;

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if (i % 5 == 0 && i % 7 == 0)
                sum += i;
        }
        System.out.println(sum);
        // Đếm tu 0 -> 20 co bao nhieu so -> so le
        //TODO: B1: int count = 0
        // B2: for loop (condition -> count++/ count += 1)
        // B3: print count (out of loops)
        int count = 0;
        for (int i = 0; i <= 20; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }
        System.out.println(count);
        int a = scanner.nextInt(); // fixed
        int b = scanner.nextInt(); // fixed
        int x = scanner.nextInt(); // fixed
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (i % x == 0) {
                count++;
            }
        }
        System.out.println(count);
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int multi = 1;
        for (int i = 1; i <= m; i++) {
            multi = multi * i;
        }
        System.out.println(multi);

        int n = scanner.nextInt(); // 12
        int count = 0;
        // 1 -> 12
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        System.out.println(count);
          int a = scanner.nextInt(); // a = 2
        int b = scanner.nextInt(); // b = 3 -

        int multi = 1;
        // i = 0 , 1 , 2
        for (int i = 0; i < b; i++) {
            // something here
            multi = multi * a; // 2 * 2 * 2 = 8
        }
        System.out.println(multi);
        */


        // for: from -> to
        // B1: khoi tao i
        // while(condition){
        // i++
        // }
//        int count = 0;
//        int a = scanner.nextInt(); // 1
//        int b = scanner.nextInt(); // 10
//        int x = scanner.nextInt();
//        while (a <= b) {
//            if (a % x == 0) {
//                count++;
//            }
//            a++;
//        }
//        System.out.println(count);
//        int sum = 0;
//        int n = scanner.nextInt();
//        int i = 1;
//        while (i <= n) {
//            if (i % 5 == 0 && i % 7 == 0) sum += i;
//            i++;
//        }
//        System.out.println(sum);

        // break: dung
        // In ra số đầu tiên chia hết cho 3 từ 1 -> N
//        int n = scanner.nextInt();
//        for (int i = 1; i <= n; i++) {
//            if (i % 3 == 0) {
//                System.out.println(i);
//                break;
//            }
//        }

        // in ra so dau tien chia het cho 3 hoac 7 tu a den b
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        while (a <= b) {
//            if (a % 3 == 0 || a % 7 == 0) {
//                System.out.println(a);
//                break;
//            }
//            a++;
//        }

        // in ra 3 số đầu tiên chia hết cho 3 và 5 từ 1 -> 100
        // output: 15 30 45
        // 'count' - 'break'
//        int count = 0;
//        for (int i = 1; i < 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println(i);
//                count++;
//            }
//            if (count == 3) {
//                break;
//            }
//
//        }

        // age:
//        int age;
//        while (true) {
//            System.out.println("Input age!!!");
//            age = scanner.nextInt();
//            if (age >= 0 && age <= 120) {
//                break;
//            }
//            System.err.println("Pls input valid age ");
//        }
//        System.out.println(age);

        // Nhập vào 1 số nguyen và in ra giá trị số áaasy - dừng lại khi số đấy < 0
        // input : 3 4 5 6 2 [-5]
//        int i;
//        while (true) {
//            System.out.println("Nhap 1 so nguyen:");
//            i = scanner.nextInt();
//            System.out.println(i);
//            if (i < 0) {
//                System.out.println("Good bye!!!");
//                break;
//            }
//        }
//        int answer = 57; //
//        int guess;
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.println("Nhập số bạn muốn đoán: ");
//            guess = scanner.nextInt();
//            if (guess > answer) {
//                System.out.println("Too high");
//            } else if (guess < answer) {
//                System.out.println("Too low");
//            } else {
//                System.out.println("Good bye!");
//                break;
//            }
//        }

        // Nhập username và input -> login sucessful

        // username và password string > 8 chars
//        String username;
//        String password;
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.println("Input username and password:");
//            username = scanner.nextLine();
//            password = scanner.nextLine();
//            if (username.length() > 8 && password.length() > 8) {
//                System.out.println("GoodBye!");
//                break;
//            } else {
//                System.out.println("Please try again");
//            }
//        }
        int n = 1;
        // while -> n = 1
        while (true) {
            if (n % 3 == 0 && n % 5 == 0 && n % 7 == 0) {
                System.out.println(n); // 1 so duy nhat
                break;
            }
            n++;
        }
    }
}