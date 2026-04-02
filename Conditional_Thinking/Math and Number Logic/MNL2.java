// Take a 3-digit number and determine if the middle digit is the largest, smallest, or neither.
import java.util.Scanner;
public class MNL2 {
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
        if(b>a && b>c){
            System.out.println("Middle digite is the greatest");
        }
        else if(b<a && b<c){
            System.out.println("Middle element is smallest");
        }
        else{
            System.out.println("Middle element is nigher greatest nor smallest");
        }
    }
}
