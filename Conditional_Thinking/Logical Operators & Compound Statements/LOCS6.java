// Take two numbers and check if both are positive and their sum is less than 100.

import java.util.Scanner;

public class LOCS6 {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = take.nextInt();
        System.out.print("Enter second number : ");
        int num2 = take.nextInt();
        if(num1>0 && num2>0){
            System.out.println("both numbers are possitive");

            if((num1+num2) < 100){
                System.out.println("Sum is less then 100");
            }
            else{
                System.out.println("Sum is greater then 100");
            }
        }
        else{
            System.out.println("Both numbers are not possitive");
        }
    }
}
