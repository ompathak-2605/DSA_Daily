// Take electricity units consumed and calculate the bill as per slabs (using if-else).

import java.util.Scanner;

public class LOCS9 {
    public static void main(String[] args) {
       Scanner take = new Scanner(System.in); 
        System.out.print("Enter the unit : ");
        int num = take.nextInt();
        if(num<0){
            System.out.println("Use electricity man...!");
            return;
        }
        int bill;
        if(num<=100){
            bill = num*5;   // taking 5 rupee unif for bellow 100
        }
        else if( num<=200 ){
            bill = (100*5)+(num-100)*7;
        }
        else{
            bill = (100*5)+(100*7)+(num-200)*10;
        }
        System.out.println("Bill amount is "+bill+" rupees");
    }
}
