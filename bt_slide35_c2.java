bt_slide35_c2
import java.util.Scanner;

public class MinOfTwoNumbers {
    public static void main(String[] args) {
        // Khởi tạo đối tượng Scanner để nhập từ bàn phím
        Scanner scanner = new Scanner(System.in);
        
        // Nhập hai số từ người dùng
        System.out.print("Nhập số thứ nhất: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Nhập số thứ hai: ");
        double num2 = scanner.nextDouble();
        
        // Gọi phương thức để tìm số nhỏ nhất và hiển thị kết quả
        double min = findMin(num1, num2);
        System.out.println("Số nhỏ nhất trong hai số " + num1 + " và " + num2 + " là: " + min);
        
        // Đóng đối tượng Scanner
        scanner.close();
    }
    
    // Phương thức tìm số nhỏ nhất trong hai số
    public static double findMin(double num1, double num2) {
        return Math.min(num1, num2);
    }
}
