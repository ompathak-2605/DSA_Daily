// Check if a given year is a leap year. 
import java.util.Scanner;

public class SC5 {
   
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = in.nextInt();
        int temp = num;
        int test = 0;
        while(num != 0){
             num = num / 10;
             test++;
        }
        if( test == 4){
            if(temp %4 ==0){
            System.out.println("This year is a leap year");
        }
        else{
            System.out.println("Its not a leap year");
        }
        }
        else{
            System.out.println("Its not a real year");
        }
        
    }
}
