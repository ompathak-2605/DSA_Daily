import java.util.Scanner;

public class LLC10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int sum = 0;

            for (int i = 1; i <= 5; i++) {
                System.out.println("Enter number " + i + ":");
                int num = sc.nextInt();

                if (num == 0) {
                    System.out.println("Zero skipped!");
                    continue;       
                }

                sum += num;
            }

            System.out.println("Sum of non-zero numbers: " + sum);
        }
    }
}