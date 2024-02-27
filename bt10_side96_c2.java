bt10_side96_c2
import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ bàn phím
        System.out.print("Nhập chuỗi (không quá 80 ký tự): ");
        String inputString = scanner.nextLine();

        // Kiểm tra độ dài chuỗi
        if (inputString.length() > 80) {
            System.out.println("Chuỗi nhập vào quá dài.");
            return;
        }

        // Nhập ký tự từ bàn phím
        System.out.print("Nhập một ký tự bất kỳ: ");
        char characterToCount = scanner.next().charAt(0);

        // Đếm số lần xuất hiện của ký tự trong chuỗi
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == characterToCount) {
                count++;
            }
        }

        // In ra kết quả
        System.out.println("Số lần xuất hiện của ký tự '" + characterToCount + "' trong chuỗi là: " + count);

        scanner.close();
    }
}
