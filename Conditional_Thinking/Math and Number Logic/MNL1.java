
import java.util.Scanner;

// Take a 3-digit number and check if all digits are distinct.
public class MNL1 {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = take.nextInt();
        if(num>999 || num<100){
            System.out.println("Please enter a three digite number");
            return;
        }
        int a = num%10;
        int b = (num/10)%10;
        int c = (num/100)%10;
        if(a==b || a==c || b==c ){
            System.out.println("Digits are not distinct");
        }
        else{
            System.out.println("Digits are distinct.");
        }
    }
}
