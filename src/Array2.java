import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
//        for (int i = 0; i < array.length; i++) array[i] = sc.nextInt();
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0) array[i] += 3;
//            else array[i] += 2;
//        }
//
//        for (int ele : array) System.out.print(ele + " ");
//        # BT6:
//        Viết chương trình yêu cầu người dùng nhập vào số phần tử của mảng, sau đó nhập từng phần tử có trong mảng sao
//        cho tất cả các phần tử được nhập phải là số lẻ, nếu không thì yêu cầu nhập lại phần tử đó.
//                Gợi ý: dùng count, while(True), break (neu thoa man dieu kien)
//-> 'Mỗi lần nhập số lẻ count ++'; 'nhập chẵn reset count = 0'
// 'count = 5' thoát vòng lặp = break và in ra các số trong array
        int[] array = new int[5];
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int number;
        while (true) {
            System.out.println("Nhập vao 1 so: ");
            number = sc.nextInt();
            // 7
            if (number % 2 != 0) {
                // gă số nhập vào array
                array[count] = number; // arr[1] = 7
                count++;  // array[0] = 3 , count = 1
            } else {
                count = 0;
                System.out.println("K duoc nhap so chan, reset count = 0");
            }
            if (count == 5) {
                break;
            }
        }
        for (int ele : array) System.out.print(ele + " ");
    }
}
