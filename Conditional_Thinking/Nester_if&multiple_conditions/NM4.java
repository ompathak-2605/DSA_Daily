
import java.util.Scanner;

// Check if one of two given numbers is a multiple of the other.

public class NM4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number :");
        int num1 = in.nextInt();
        System.out.print("Enter second number :");
        int num2 = in.nextInt();
        if(num1==0 || num2==0){
            System.out.println("Input cannot be 0");
        }
        else if(num1%num2 == 0){
            System.out.println(num1 + " is a multiple of "+num2);
        }
        else if(num2%num1 == 0){
            System.out.println(num2 + " is a multiple of "+num1);
        }
        else{
            System.out.println("no number is multiple of eachother.");
        }

    }
}
