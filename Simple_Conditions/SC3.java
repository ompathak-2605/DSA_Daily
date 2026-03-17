// Check if a number is divisible by 5.

import java.util.Scanner;

public class SC3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = in.nextInt();
        if(num % 5 == 0){
            System.out.println("Number is divisible by 5");
        }
        else{
            System.out.println("Number is not divisible by 5");
        }
    }
}
