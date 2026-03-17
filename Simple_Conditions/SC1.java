
import java.util.Scanner;

// Take a number and print whether it’s positive, negative, or zero.

public class SC1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = in.nextInt();
        if(num < 0){
            System.out.println("Number is negative");
        }
        if(num > 0){
            System.out.println("Number is positive");
        }
        if(num == 0){
            System.out.println("Number is 0");
        }
    }
}