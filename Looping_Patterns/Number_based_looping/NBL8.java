// Check if a number is prime or not.
import java.util.Scanner;

public class NBL8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean r = true;
        for (int i = 2; i <=Math.sqrt(num); i++) {
            if(num%i == 0){
            r = false;
            }
        }
        if(r) System.out.println("Its prime");
        else System.out.println("Not prime");
    }
}