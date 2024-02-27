bt_slide90_c2
import java.util.Scanner;

public class DisplayCharactersInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ bàn phím
        System.out.print("Nhập chuỗi: ");
        String inputString = scanner.nextLine();

        // Hiển thị các ký tự trong chuỗi ra màn hình, mỗi ký tự trên một dòng
        System.out.println("Các ký tự trong chuỗi:");
        for (int i = 0; i < inputString.length(); i++) {
            char character = inputString.charAt(i);
            System.out.println(character);
        }

        scanner.close();
    }
}
