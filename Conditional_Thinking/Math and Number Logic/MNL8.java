
import java.util.Scanner;

// Check if a number lies within the range [100, 999].
public class MNL8 {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = take.nextInt();
        if(num>=100 && num<=999){
            System.out.println("Num lies between 100 and 999");
        }
        else{
            System.out.println("Dosen't lie between the range");
        }

    }
}
