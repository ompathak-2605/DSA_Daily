// Take a 3-digit number and check if the sum of the first and last digit equals the middle digit.

import java.util.Scanner;

public class CLS7 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number");
            int a = sc.nextInt();
            if (a < 100 || a > 999) {
                System.out.println("Please enter a valid 3-digit number");
                return;
            }
            if (a % 10 + a / 100 == (a % 100) / 10) {
                System.out.println("Sum is equal to the middle digit");
            } else {
                System.out.println("Not equal");
            }
        }
    }
}
