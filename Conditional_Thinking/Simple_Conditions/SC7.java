// Take three numbers and print the largest.

import java.util.Scanner;

public class SC7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int num1 = in.nextInt();
        System.out.print("Enter 2nd number : ");
        int num2= in.nextInt();
        System.out.print("Enter 3rd number : ");
        int num3= in.nextInt();
        int g = Math.max(num1,Math.max(num2, num3));
       System.out.println(g);
    }
}
