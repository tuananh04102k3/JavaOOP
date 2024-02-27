bt_slide81_c2
import java.util.Scanner;

public class MaxValueInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số hàng và số cột của ma trận
        System.out.print("Nhập số hàng của ma trận: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        // Nhập các phần tử cho ma trận
        System.out.println("Nhập các phần tử cho ma trận:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("Nhập phần tử ở vị trí [%d][%d]: ", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Tìm và hiển thị phần tử lớn nhất trong ma trận
        int maxValue = matrix[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong ma trận là: " + maxValue);

        scanner.close();
    }
}
