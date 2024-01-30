bt_slide30_c2
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        // Khởi tạo đối tượng Scanner để nhập từ bàn phím
        Scanner scanner = new Scanner(System.in);
        
        // Nhập số nguyên n từ người dùng
        System.out.print("Nhập số nguyên n (n > 0): ");
        int n = scanner.nextInt();
        
        // Kiểm tra n có là số nguyên dương không
        if (n <= 0) {
            System.out.println("Vui lòng nhập số nguyên dương lớn hơn 0.");
            return; // Kết thúc chương trình nếu n không hợp lệ
        }
        
        // Gọi phương thức tính tổng các chữ số và hiển thị kết quả
        int sum = sumOfDigits(n);
        System.out.println("Tổng các chữ số của " + n + " là: " + sum);
        
        // Đóng đối tượng Scanner
        scanner.close();
    }
    
    // Phương thức tính tổng các chữ số của một số nguyên dương
    public static int sumOfDigits(int number) {
        int sum = 0;
        
        // Lặp qua từng chữ số của số nguyên dương number
        while (number > 0) {
            // Lấy chữ số cuối cùng của number và cộng vào tổng
            sum += number % 10;
            
            // Loại bỏ chữ số cuối cùng của number
            number /= 10;
        }
        
        return sum;
    }
}
