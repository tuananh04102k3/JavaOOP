tinh+,-,*,/
import java.util.Scanner;

public class TinhToanHaiSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số thứ nhất
        System.out.print("Nhập số thứ nhất: ");
        double soThuNhat = scanner.nextDouble();

        // Nhập số thứ hai
        System.out.print("Nhập số thứ hai: ");
        double soThuHai = scanner.nextDouble();

        // Tính tổng
        double tong = soThuNhat + soThuHai;
        System.out.println("Tổng: " + tong);

        // Tính hiệu
        double hieu = soThuNhat - soThuHai;
        System.out.println("Hiệu: " + hieu);

        // Tính tích
        double tich = soThuNhat * soThuHai;
        System.out.println("Tích: " + tich);

        // Kiểm tra nếu số thứ hai không bằng 0 trước khi tính thương để tránh lỗi chia cho 0
        if (soThuHai != 0) {
            // Tính thương
            double thuong = soThuNhat / soThuHai;
            System.out.println("Thương: " + thuong);
        } else {
            System.out.println("Không thể chia cho 0.");
        }

        scanner.close();
    }
}
