bt4_slide94_c2
import java.util.Scanner;

public class MonthDisplay {
    public static void main(String[] args) {
        // Khởi tạo đối tượng Scanner để nhập từ bàn phím
        Scanner scanner = new Scanner(System.in);
        
        // Nhập số nguyên từ 1 đến 12 từ người dùng
        System.out.print("Nhập số nguyên từ 1 đến 12: ");
        int monthNumber = scanner.nextInt();
        
        // Hiển thị tháng tương ứng
        String monthName = getMonthName(monthNumber);
        System.out.println("Tháng " + monthNumber + " là: " + monthName);
        
        // Đóng đối tượng Scanner
        scanner.close();
    }
    
    // Phương thức trả về tên của tháng dựa trên số nguyên đầu vào
    public static String getMonthName(int monthNumber) {
        switch (monthNumber) {
            case 1:
                return "Tháng 1";
            case 2:
                return "Tháng 2";
            case 3:
                return "Tháng 3";
            case 4:
                return "Tháng 4";
            case 5:
                return "Tháng 5";
            case 6:
                return "Tháng 6";
            case 7:
                return "Tháng 7";
            case 8:
                return "Tháng 8";
            case 9:
                return "Tháng 9";
            case 10:
                return "Tháng 10";
            case 11:
                return "Tháng 11";
            case 12:
                return "Tháng 12";
            default:
                return "Không hợp lệ";
        }
    }
}
