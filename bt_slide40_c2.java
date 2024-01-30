bt_slide40_c2
import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        // Khởi tạo đối tượng Scanner để nhập từ bàn phím
        Scanner scanner = new Scanner(System.in);
        
        // Nhập số nguyên từ 1 đến 7 từ người dùng
        System.out.print("Nhập số nguyên từ 1 đến 7: ");
        int dayNumber = scanner.nextInt();
        
        // Hiển thị tên ngày tương ứng
        String dayName = getDayOfWeek(dayNumber);
        System.out.println("Ngày thứ " + dayNumber + " trong tuần là: " + dayName);
        
        // Đóng đối tượng Scanner
        scanner.close();
    }
    
    // Phương thức trả về tên của ngày trong tuần dựa trên số nguyên đầu vào
    public static String getDayOfWeek(int dayNumber) {
        String dayName;
        switch (dayNumber) {
            case 1:
                dayName = "Chủ nhật";
                break;
            case 2:
                dayName = "Thứ hai";
                break;
            case 3:
                dayName = "Thứ ba";
                break;
            case 4:
                dayName = "Thứ tư";
                break;
            case 5:
                dayName = "Thứ năm";
                break;
            case 6:
                dayName = "Thứ sáu";
                break;
            case 7:
                dayName = "Thứ bảy";
                break;
            default:
                dayName = "Không hợp lệ";
                break;
        }
        return dayName;
    }
}
