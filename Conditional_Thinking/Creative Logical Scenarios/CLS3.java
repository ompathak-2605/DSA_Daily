// Take day and month and check if it forms a valid calendar date (ignoring leap years).

import java.util.Scanner;

public class CLS3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date : ");
        int date = sc.nextInt();
        if (date < 1 || date > 31) {
            System.out.println("Invalid date");
            return;
        }
        System.out.print("Enter month : ");
        int month = sc.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Invalid Month");
            return;
        }
        if (date <= 28) {
            System.out.println("Valid");
        } else if ((date > 28 && date <= 30) && (month == 4 || month == 9 || month == 6 || month == 11)) {
            System.out.println("Valid");
        } else if ((date == 31)
                && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
