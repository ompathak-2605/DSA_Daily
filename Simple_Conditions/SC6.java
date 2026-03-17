// Take two numbers and print the larger one.
import java.util.Scanner;

public class SC6 {
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int num1 = in.nextInt();
        System.out.print("Enter 2nd number : ");
        int num2= in.nextInt();
        if(num1==num2){
            System.out.println("Both numbers are equal");
        }
        else if(num1 > num2){
            System.out.println(num1+" is greater then "+num2);
        }
        else{
             System.out.println(num2+" is greater then "+num1);
        }
    }
}
