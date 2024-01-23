ktrasochanorle
import java.util.Scanner;

public class KiemTraChanLe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số từ người dùng
        System.out.print("Nhập một số nguyên: ");
        int soNhapVao = scanner.nextInt();

        // Kiểm tra xem số nhập vào là chẵn hay lẻ
        if (soNhapVao % 2 == 0) {
            System.out.println("Số " + soNhapVao + " là số chẵn.");
        } else {
            System.out.println("Số " + soNhapVao + " là số lẻ.");
        }

        scanner.close();
    }
}
