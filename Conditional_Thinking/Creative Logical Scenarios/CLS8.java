// Take an integer (1–9999) and check if the sum of its digits is greater than the product of its digits. 

import java.util.Scanner;

public class CLS8 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number");
            int a = sc.nextInt();
            if (a < 1 || a > 9999) {
                System.out.println("Please enter a valid number");
                return;
            }
            int junk = a;
            int sum = 0;
            while(a!=0){
                sum = sum + a%10;
                a = a/10;
            }
            int product = 1;
            while(junk!=0){
                product = product * (junk%10);
                junk = junk/10;
            }
            if(sum>product){
                System.out.println("Sum is greater");
            }
            else if(sum==product){
                System.out.println("both are equal");
            }
            else{
                System.out.println("Product is greater");
            }
        }
    }
}
