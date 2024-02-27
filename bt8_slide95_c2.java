bt8_slide95_c2
import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng số nguyên
        System.out.print("Nhập số lượng số nguyên: ");
        int n = scanner.nextInt();

        // Tạo mảng để lưu các số nguyên
        int[] numbers = new int[n];

        // Nhập các số nguyên từ bàn phím và tính tổng
        int sum = 0;
        System.out.println("Nhập " + n + " số nguyên:");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập số thứ " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        // Tính trung bình cộng
        double average = (double) sum / n;

        // In ra màn hình trung bình cộng
        System.out.println("Trung bình cộng của các số nguyên đã nhập là: " + average);

        scanner.close();
    }
}
