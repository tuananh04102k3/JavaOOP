sosanh2so
import java.util.Scanner;

public class SoSanhHaiSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số thứ nhất
        System.out.print("Nhập số thứ nhất: ");
        double soThuNhat = scanner.nextDouble();

        // Nhập số thứ hai
        System.out.print("Nhập số thứ hai: ");
        double soThuHai = scanner.nextDouble();

        // So sánh các số và in ra kết quả
        System.out.println(soThuNhat + " == " + soThuHai + ": " + (soThuNhat == soThuHai));
        System.out.println(soThuNhat + " != " + soThuHai + ": " + (soThuNhat != soThuHai));
        System.out.println(soThuNhat + " > " + soThuHai + ": " + (soThuNhat > soThuHai));
        System.out.println(soThuNhat + " < " + soThuHai + ": " + (soThuNhat < soThuHai));
        System.out.println(soThuNhat + " >= " + soThuHai + ": " + (soThuNhat >= soThuHai));
        System.out.println(soThuNhat + " <= " + soThuHai + ": " + (soThuNhat <= soThuHai));

        scanner.close();
    }
}
