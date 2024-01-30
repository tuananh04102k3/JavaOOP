bai3_slide93_c2
import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        // Khởi tạo đối tượng Scanner để nhập từ bàn phím
        Scanner scanner = new Scanner(System.in);
        
        // Nhập tên và năm sinh của người dùng
        System.out.print("Nhập tên của bạn: ");
        String name = scanner.nextLine();
        
        System.out.print("Nhập năm sinh của bạn: ");
        int yearOfBirth = scanner.nextInt();
        
        // Tính tuổi của người dùng
        int age = 2024 - yearOfBirth;
        
        // Hiển thị nhóm tuổi tương ứng
        if (age < 16) {
            System.out.println("Bạn " + name + " ở độ tuổi vị thành niên.");
        } else if (age >= 16 && age < 18) {
            System.out.println("Bạn " + name + " ở độ tuổi trưởng thành.");
        } else {
            System.out.println("Bạn " + name + " đã già.");
        }
        
        // Đóng đối tượng Scanner
        scanner.close();
    }
}
