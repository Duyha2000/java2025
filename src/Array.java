import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // https://docs.google.com/document/d/1h7Cvt9ILkPJwZCCObQE8QFSqnejyJ2b3WzRZ8Ewoh_c/edit?tab=t.0
        // Arrays:
        int a = 4, b = 5, c = 6;
//        int[] arr = {4, 5, 6, 7, 8};
        // index: start 0
//        System.out.println(arr[0]);
//        System.out.println(arr[2]);
        // Tao 1 array gồm 4 tên "Hùng" "cường" "trung" "dũng" và in ra dũng
//        String[] arr = {"Hung", "Cuong", "Trung", "Dung" };
//        System.out.println(arr[3]);
//        arr[2] = "Ha";
//        System.out.println(arr[2]);
        // change value
        // length
//        System.out.println(arr.length); // 4
        // last index: arr[length - 1]
//        String[] arr2 = new String[4]; // [- - - -]
        // 1 quy luật ->
//        arr2[0] = scanner.nextLine();
//        arr2[1] = scanner.nextLine();
//        arr2[2] = scanner.nextLine();
//        arr2[3] = scanner.nextLine();

        // Input:
//        for (int i = 0; i < arr2.length; i++) arr2[i] = scanner.nextLine();

        // output:
//        for (int i = 0; i < arr2.length; i++) System.out.println(arr2[i]);
        Scanner scanner = new Scanner(System.in);
        // In ra các phần tử > 0 của array:
        //            ->
        //        for (int i = 0; i < nums.length; i++) {
        //            if (nums[i] > 0) {
        //                System.out.println(nums[i]);
        //            }
        //        }
        //TODO: BT tính tổng:
        // B1: int sum = 0
        // b2: sum += i
        // B3: print sum ( out of loops)
//        int sum = 0;
//        int[] nums = {1, 2, 13, 30, 45};
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] % 5 == 0 && nums[i] % 3 == 0) {
//                sum += nums[i];
//            }
//        }
//        System.out.println(sum);
        //TODO: B1: int count = 0
        // B2: for loop (condition -> count++/ count += 1)
        // B3: print count (out of loops)
//        int[] arr = {5, 10, 30, 32, -3, -4, -5};
//        int count = 0;
//        int target = scanner.nextInt();
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > target && arr[i] % 5 == 0) {
//                count++;
//            }
//        }
//        System.out.println(count);
// Bài 2: Viết chương trình đếm số lượng các số hạng dương và tổng của các số hạng dương.
//        int sum = 0;
//        int count = 0;
//        int[] arr = new int[5]; // [ - - - - - ]
//        // input:
//        for (int i = 0; i < 5; i++) {
//            arr[i] = scanner.nextInt();
//        }
//
//        // logic - in
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > 0) {
//                count++;
//                sum += arr[i];
//            }
//        }
//        System.out.println(count);
//        System.out.println(sum);

// TODO: Bài 3: Viết chương trình tính trung bình cộng của cả danh sách, trung bình cộng các phần tử dương trong danh sách
//        int sum = 0;
//        int count = 0;
//        int[] arr = new int[5];
//        for (int i = 0; i < 5; i++) {
//            arr[i] = scanner.nextInt(); // [-2 3 -4 5 6]
//        }
//        // 3 5 6
//        // 14 / 3 -> tbc cua so duong
//        int sumPositive = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > 0) {
//                count++;
//                sumPositive += arr[i];
//            }
//            sum += arr[i];
//        }
//        double average = (double) sum / arr.length;
//        double averagePositive = (double) sumPositive / count;
//
//        System.out.println(average);
//        System.out.println(averagePositive);
//    -> 2
//        int count = 0;
//        int target = scanner.nextInt(); // 3
//        for (int i = 0; i < arr.length; i++) {
//            if (target == arr[i]) {
//                count++;
//            }
//        }
//        System.out.println(count);
// đếm xem có bao nhiêu số '> target' trong array và chia hết cho 5
// Bài 4: Viết chương trình Java tìm vị trí của phần tử âm đầu tiên trong danh sách.
//     arr =  [1,3,5,6,7,'-4',-7] - > print index = 5 (-4)
//        int[] arr = new int[7];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scanner.nextInt();
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < 0) {
//                // System.out.println(arr[i]); // value
//                // System.out.println(i); // index
//                break;
//            }
//        }
// Bài 5: Viết chương trình Java tìm vị trí của phần tử dương cuối cùng trong danh sách.
// [2,3,4,-5,-6,-7,8,-9] -> value 8 - index 6
//                              -> 6
//
//        int index = 0;
//        int[] arr = new int[8];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scanner.nextInt();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > 0) index = i; // 2
//        }
//        System.out.println(index);
        /*
        Exercise 3: Reverse the Array
            Description: Print the list in reverse order (from last to first).
            Example:
             [2 9 8 7 9]
 -> index     0 1 2 3 4
       Output:
             [9 7 8 9 2]
             4 3 2 1 0 (goi y: dung for voi i--)
             int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
         */

        // TODO: Bài 6: Viết chương trình tìm phần tử lớn nhất của danh sách và vị trí phần tử lớn nhất cuối cùng.
        // arr = [9,2,7,1,5] -> max = 9, min = 1
        //
        // goi y: max = arr[0] -> sau do so sanh max voi cac phan tu trong array, neu element > max -> max = element
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
//        int max = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (max < arr[i]) max = arr[i];
//        }
//        System.out.println(max);
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) min = arr[i];
        }
        System.out.println(min);
    }
}
