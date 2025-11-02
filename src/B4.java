import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
        // String builder
        // String: "Hello world"
        //          0
//        String str = "education";
//        System.out.println(str.charAt(0));
//        // length
//        System.out.println(str.length());
//        // ky tu cuoi vi tri se la: 10
//        System.out.println(str.charAt(str.length() - 1));
        // in ra tung ky tu:
//        for (int i = 0; i < str.length(); i++) {
//            System.out.print(str.charAt(i) + " ");
//        }
        // Khai báo và gán giá trị cho 1 chuỗi bất kỳ, viết chương trình in ra chuỗi đảo ngược của chuỗi đã khai báo.
        // 'dlrow olleh' -> i--

//        for (int i = str.length() - 1; i >= 0; i--) {
//            System.out.print(str.charAt(i) + " ");
//        }
        // Khai báo và gán giá trị cho 1 chuỗi bất kỳ, viết chương trình yêu cầu người dùng nhập vào '1 ký tự bất kỳ',
        // in ra "số lần xuất hiện" của ký tự đó trong chuỗi đã khai báo.
        // "hello" -> 'l' -> count = 2
        Scanner scanner = new Scanner(System.in);
//        char kytu = scanner.next().charAt(0);
//
//        int count = 0;
//        //
//        for (int i = 0; i < str.length(); i++) {
//            if (kytu == str.charAt(i))
//                count++;
//        }
//        System.out.println(count);
        /*
        Bài 3: Đếm số nguyên âm trong chuỗi
        Mục tiêu: Kiểm tra điều kiện trên từng ký tự
        Nguyên âm: a, e, i, o, u
        Ví dụ:
        Input: "education"
        Output: 5 (e,u,a,i,o)
         */
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'u' || str.charAt(i) == 'i' || str.charAt(i) == 'o') {
//                count++;
//            }
//        }
//        System.out.println(count + " ");

        // split: chuyen string thanh array
//        String str2 = "Hello world";
//        // Hello | world
//        String[] arr = str2.split(" "); // ["Hello", "World"]
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        /*
        Bài 7: Đếm số từ trong chuỗi
        Mục tiêu: Tách chuỗi (split) + kiểm tra rỗng. Yêu cầu:
        Nhập chuỗi bất kỳ: Một từ được cách nhau bởi ít nhất 1 dấu cách
        In ra số lượng từ
        Ví dụ:
        Input: "I hate Java programming"
        Output: 4
        String str = "I hate Java programming";
        String[] arr = str.split(" ");// ["I","hate","Java", "programming"]
        System.out.println(arr.length);
         */
        // isDigit (boolean): check ky tu co phai so hay khong, isLetter (booloean): kiem tra xem co phai 1 ky tu hay khong
//        char x = 'a';
////        System.out.println(Character.isDigit(x));
//        System.out.println(Character.isLetter(x));
        /*
            BT: Khai báo và gán giá trị cho 1 chuỗi bất kỳ, viết chương trình đếm số ký tự là chữ cái,
            chữ số và ký tự đặc biệt có trong chuỗi đó và in ra màn hình.
            Input: "Hello my gmail is test123@gmail.com"
            Output:
            So ky tu la chu cai: 26
            So ly tu la chu so: 3
            So ky tu dac biet: 6
            for () -> count -> isDigit | isLetter
         */
//        String str = scanner.nextLine();
//        int countLetter = 0;
//        int countNum = 0;
//        int countSpecial = 0;
//        for (int i = 0; i < str.length(); i++) {
//            char x = str.charAt(i);
//            if (Character.isDigit(x)) {
//                countNum++;
//            } else if (Character.isLetter(x)) {
//                countLetter++;
//            } else countSpecial++;
//
//        }
//        System.out.println(countLetter); // 26
//        System.out.println(countNum); // 3
//        System.out.println(countSpecial); //
//        String s1 = "hello world";
//        System.out.println(s1.toUpperCase()); // viet hoa
//        String s2 = "HELLO WORLD";
//        System.out.println(s2.toLowerCase());
// TODO:Khai báo và gán giá trị cho 1 chuỗi bất kỳ, viết chương trình viết hoa các chữ cái đầu của các từ trong
//  chuỗi đó.
//Input: hello world
//Output: Hello World
//         Hint: split + uppercase
//        String string = scanner.nextLine(); // hello world
//        String[] arr = string.split(" "); // ["hello","world"]
//        // String.valueOf: chuyen character -> String
//        String result = "";
//        for (int i = 0; i < arr.length; i++) {
//            String str = arr[i];
//            result += String.valueOf(str.charAt(0)).toUpperCase(); // lay ky tu dau -> viet hoa len
//            for (int j = 1; j < str.length(); j++) result += str.charAt(j); // in ra cac ky tu sau
        String str = scanner.nextLine(); // a1b2c3
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(i)) System.out.print(str.charAt(i));
        }


        System.out.println(result);
    }
//        String firstStr = arr[0]; // "hello"
//        result += String.valueOf(firstStr.charAt(0)).toUpperCase(); // lay ky tu dau -> viet hoa len
//        for (int i = 1; i < firstStr.length(); i++) result += firstStr.charAt(i); // in ra cac ky tu sau
//        String secondStr = arr[1];
//        result += String.valueOf(secondStr.charAt(0)).toUpperCase();
//        for (int i = 1; i < secondStr.length(); i++) result += secondStr.charAt(i);
//        String thirdStr = arr[2];
//        result += String.valueOf(thirdStr.charAt(0)).toUpperCase();
//        for (int i = 1; i < secondStr.length(); i++) result += thirdStr.charAt(i);
//        System.out.println(result); // Hello

    /*
    Bài 11: Loại bỏ ký tự số trong chuỗi
    Mục tiêu: Dùng Character.isDigit()
    Yêu cầu: Nhập chuỗi chứa cả chữ và số
    Xoá tất cả ký tự số, chỉ giữ chữ
    Ví dụ:
    Input: "a1b2c3" -> Output: "abc"
    -> Hint: result = " " -> result += ...
     */


}


