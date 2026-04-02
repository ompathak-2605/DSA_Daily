//  Check whether a number is a perfect square (without using the square root function).
import java.util.Scanner;
public class MNL10 {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = take.nextInt();
        int i;
        for ( i = 2; i <=(num/2); i++) {
            if(i*i == num){
                System.out.println("Yes, its a perfec square and the square root is "+i);
            }
        }
        if(i==(num/2)+1){
            System.out.println("its not a perfect square");
        }
        
    }
}
