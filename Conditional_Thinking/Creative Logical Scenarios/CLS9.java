// Take two dates (day and month) and determine which one comes first in the calendar.

import java.util.Scanner;

public class CLS9 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter 1st date");
            int d1 = sc.nextInt();
            System.out.println("Enter 1st month");
            int m1 = sc.nextInt();
            System.out.println("Enter 2nd date");
            int d2 = sc.nextInt();
            System.out.println("Enter 2nd month");
            int m2 = sc.nextInt();
            if (m1 < 1 || m1 > 12 || m2 < 1 || m2 > 12) {
                System.out.println("Invalid month");
                return;
            }
            int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if (d1 < 1 || d1 > days[m1] || d2 < 1 || d2 > days[m2]) {
                System.out.println("Invalid day");
                return;
            }
            int total1 = d1;
            for (int i = 1; i < m1; i++) {
                total1 += days[i];
            }

            int total2 = d2;
            for (int i = 1; i < m2; i++) {
                total2 += days[i];
            }

            if (total1 < total2) {
                System.out.println("Date 1 comes first");
            } else if (total1 > total2) {
                System.out.println("Date 2 comes first");
            } else {
                System.out.println("Same date");
            }
        }
    }
}
