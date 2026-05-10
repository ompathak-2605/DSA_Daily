import java.util.Scanner;

public class LLC8 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number");
            int n = sc.nextInt();
            System.out.println("Factorials from 1 to "+n+" are");
            System.out.println(1);
            long factorial = 1;
            for (int i = 2; i <=n; i++) {
                factorial = factorial*i;
                System.out.println(factorial);
            }
        }
    }
}
