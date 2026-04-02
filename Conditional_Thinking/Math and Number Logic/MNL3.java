// Take a 4-digit number and check if the first and last digits are equal.
import java.util.Scanner;
public class MNL3 {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = take.nextInt();
        if(num<1000 || num>9999){
            System.out.println("Please enter a fout digite number");
            return;
        }
        int a = num%10;
        int b = (num/1000)%10;
        if(a == b){
            System.out.println("First and Last digits are same");
        }
        else{
            System.out.println("First and Last digits are not same");
        }
    }
}
