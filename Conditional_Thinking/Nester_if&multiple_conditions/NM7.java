/* Take two numbers and determine whether both are even, both are odd, or one is 
even and one is odd.*/

import java.util.Scanner;

public class NM7 {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        System.out.print("Enter first number :");
        int num1 = in.nextInt();
        System.out.print("Enter second number :");
        int num2 = in.nextInt();
        if(num1%2==0 && num2%2==0){
            System.out.println("Both numbers are even");
        }
        else if(num1%2==0 && num2%2!=0){
            System.out.println(num1+" is even and "+num2+" is odd");
        }
        else if(num1%2!=0 && num2%2==0){
            System.out.println(num2+" is even and "+num1+" is odd");
        }
        else if(num1%2!=0 && num2%2!=0){
            System.out.println("Both are odd");
        }
    }
}
