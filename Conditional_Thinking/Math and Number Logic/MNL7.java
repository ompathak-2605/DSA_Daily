// Check if an amount can be evenly divided into 2000, 500, and 100 currency notes.
import java.util.Scanner;
public class MNL7 {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.println("Enter the amount");
        int num = take.nextInt();
        if(num<0){
            System.out.println("Enter a possitive number");
            return;
        }
        if(num%100==0){
            int cur2000 = num/2000;
            num = num%2000;
            int cur500 = num/500;
            num = num%500;
            int cur100 = num/100;
            System.out.println("Yes, this amount can be evenly spread in 2000,500 and 100 currency notes like this...");
            System.out.println("Rupees 2000 notes = "+cur2000);
            System.out.println("Rupees 500 notes = "+cur500);
            System.out.println("Rupees 100 notes = "+cur100);
         }
         else{
            System.out.println("No, the amount cannot be evenly spread");
         }
    }
}
