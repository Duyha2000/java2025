import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine(); // a1b2c3
//        String result = "";
//        for (int i = 0; i < str.length(); i++) {
//            if (Character.isLetter(str.charAt(i))) {
//                System.out.print(str.charAt(i));
//                result += str.charAt(i);
//            }
//        }System.out.println(result);
        /*
        Bài 17: ->'Đếm'<- số câu trong đoạn văn
        Mục tiêu: Dùng tách chuỗi với ký tự '. , ? !'
        Yêu cầu:
        Tính số câu trong đoạn văn
        Ví dụ:
        Input: "Hello. How are you? I'm fine!"
        Output: 3 (. ? !)
         */
        String str = "Hello. How are you? I'm fine!";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '.' || str.charAt(i) == '?' || str.charAt(i) == '!' || str.charAt(i) == ',')
                count++;
        }
        System.out.println(count);

    }
}
