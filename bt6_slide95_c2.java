bt6_slide95_c2
import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên dương từ bàn phím
        System.out.print("Nhập số nguyên dương: ");
        int number = scanner.nextInt();

        // Kiểm tra nếu số nhập vào là âm thì yêu cầu nhập lại
        while (number <= 0) {
            System.out.print("Vui lòng nhập lại số nguyên dương: ");
            number = scanner.nextInt();
        }

        // Tính giai thừa của số
        long factorial = calculateFactorial(number);

        // In ra kết quả
        System.out.println("Giai thừa của " + number + " là: " + factorial);

        scanner.close();
    }

    // Phương thức tính giai thừa
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
