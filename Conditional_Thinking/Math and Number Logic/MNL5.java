// Check if a number is a multiple of 7 or ends with 7.
import java.util.Scanner;
public class MNL5 {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = take.nextInt();
        if(num%7==0){
            System.out.println("number is a multiple of 7");
        }
        else{
            System.out.println("number is not a multiple of 7");
        }
        if(num%10==7){
            System.out.println("number's last digite is 7");
        }
        else{
            System.out.println("number's last digite is not 7");
        }
    }
}
