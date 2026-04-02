// Take three numbers and print the median value (neither maximum nor minimum).

import java.util.Scanner;
public class LOCS3 {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1 = take.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = take.nextInt();
        System.out.println("Enter 3rd number");
        int num3 = take.nextInt();
        if((num1>=num2 && num2>=num3) ||(num1<=num2 && num2<=num3)){
            System.out.println(num2);       
    }
        else if((num2>=num1 && num3<=num1) || (num1>=num3 && num2>=num1)){
            System.out.println(num1);
        }
        else if((num3>=num1 && num3<=num2) || (num1>=num3 && num2<=num3)){
            System.out.println(num3);
        }
}
}
