bt_slide55_c2
import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {
        // Hiển thị các số chia hết cho 5 trong phạm vi từ 0 đến 20
        System.out.println("Các số chia hết cho 5 trong phạm vi từ 0 đến 20 là:");
        for (int i = 0; i <= 20; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}