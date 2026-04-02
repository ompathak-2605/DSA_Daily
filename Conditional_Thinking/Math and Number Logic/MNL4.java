// Check whether a given integer is single-digit, double-digit, or multi-digit. 
import java.util.*;
public class MNL4 {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = take.nextInt();
        int temp = 0;
        while(num!=0){
            num = num/10;
            temp +=1;
        }
        if(temp>1){
        System.out.println("The number has "+temp+" digits");
        }
        else{
        System.out.println("The number has "+temp+" digit");

        }
    }
}
