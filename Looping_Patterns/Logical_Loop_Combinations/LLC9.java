// Print the sum of all odd digits and even digits separately in a number.

import java.util.Scanner;

public class LLC9 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number");
            int n = sc.nextInt();
            int temp = n;
            int oddsum = 0;
            int evensum =0;
            int lastdigit ;
            while (temp != 0) {
                lastdigit = temp % 10;
                if (lastdigit % 2 == 0) {
                    evensum += temp % 10;
                }
                else {
                    oddsum += temp % 10;
                }
                temp = temp / 10;
            }
            System.out.println("Odd number sum is:" + oddsum);
            System.out.println("Odd number sum is:"+evensum);

        }
    }
}
