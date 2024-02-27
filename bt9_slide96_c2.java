bt9_slide96_c2
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ bàn phím
        System.out.print("Nhập chuỗi: ");
        String inputString = scanner.nextLine();

        // Đếm số ký tự thường, số ký tự hoa và số ký tự số trong chuỗi
        int lowercaseCount = 0;
        int uppercaseCount = 0;
        int digitCount = 0;

        for (int i = 0; i < inputString.length(); i++) {
            char character = inputString.charAt(i);
            if (Character.isLowerCase(character)) {
                lowercaseCount++;
            } else if (Character.isUpperCase(character)) {
                uppercaseCount++;
            } else if (Character.isDigit(character)) {
                digitCount++;
            }
        }

        // In ra kết quả
        System.out.println("Số ký tự thường trong chuỗi là: " + lowercaseCount);
        System.out.println("Số ký tự hoa trong chuỗi là: " + uppercaseCount);
        System.out.println("Số ký tự số trong chuỗi là: " + digitCount);

        scanner.close();
    }
}
