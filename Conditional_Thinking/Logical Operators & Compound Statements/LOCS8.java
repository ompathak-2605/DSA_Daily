// Take a weekday number (1–7) and determine if it is a weekday or weekend.
import java.util.Scanner;

public class LOCS8 {
    @SuppressWarnings("UnnecessaryReturnStatement")
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = take.nextInt();
        if(num<1 || num > 7){
            System.out.println("Invalid weekday");
            return;
        }
        if( num<=5){
            System.out.println("Weekday");
        }
        else{
            System.out.println("Weekend");
        }
    }
}
