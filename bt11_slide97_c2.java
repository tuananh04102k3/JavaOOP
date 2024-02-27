bt11_slide97_c2
import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng phần tử của mảng
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();

        // Tạo mảng A có n phần tử
        int[] A = new int[n];

        // Nhập các phần tử cho mảng A từ bàn phím
        System.out.println("Nhập các phần tử của mảng A:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            A[i] = scanner.nextInt();
        }

        // Sắp xếp mảng A theo thứ tự tăng dần
        Arrays.sort(A);

        // In ra mảng A ban đầu
        System.out.println("Mảng A ban đầu:");
        printArray(A);

        // In ra mảng A đã sắp xếp theo thứ tự tăng dần
        System.out.println("Mảng A đã sắp xếp theo thứ tự tăng dần:");
        printArray(A);

        scanner.close();
    }

    // Phương thức in ra một mảng
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
