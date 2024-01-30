bt_slide47_c2
import java.util.Scanner;

public class SumUntilThreshold {
    public static void main(String[] args) {
        // Khởi tạo đối tượng Scanner để nhập từ bàn phím
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int number;
        
        // Nhập các số nguyên và tính tổng cho đến khi tổng vượt quá 100
        while (sum <= 100) {
            // Nhập số nguyên từ người dùng
            System.out.print("Nhập số nguyên: ");
            number = scanner.nextInt();
            
            // Cộng số nhập vào vào tổng
            sum += number;
        }
        
        // Hiển thị tổng của các số đã nhập
        System.out.println("Tổng của các số đã nhập là: " + sum);
        
        // Đóng đối tượng Scanner
        scanner.close();
    }
}
