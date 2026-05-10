// Print all numbers from 1–n whose binary representation has an even number of 1s. 
import java.util.Scanner;

public class LLC6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit :");
        int n = sc.nextInt();
        System.out.println("These are the numbers which have even numbers of 1s in binary");
        int count = 0;
        for (int i = 0; i <=n; i++) {
            int temp = i;
            while(temp!=0){
            if(temp%2==1) count++;
            temp= temp/2;
        }
        if(count%2==0){
            System.out.println(i);
        }
        count = 0;
        }
        

    }
}
