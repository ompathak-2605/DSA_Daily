// Take income and age, and check if eligible for tax (age > 18 and income > 5 L).
import java.util.Scanner;

public class LOCS5 {
    public static void main(String[] args) {

        Scanner take = new Scanner(System.in);

        System.out.print("Enter the age: ");
        int age = take.nextInt();

        if (age < 0) {
            System.out.println("Invalid age");
            return;
        }

        System.out.print("Enter the income: ");
        int income = take.nextInt();

        if (age > 18 && income > 500000) {
            System.out.println("Eligible for tax");
        } else {
            System.out.println("Not eligible for tax");
        }
    }
}