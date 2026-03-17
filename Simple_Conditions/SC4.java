// Check if a number is divisible by both 3 and 5.

import java.util.Scanner;

public class SC4 {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = in.nextInt();
        if(num % 5 == 0 && num % 3 == 0){
            System.out.println(num +" is divisible by both 3 and 5");
        }
        if(num % 5 == 0 && num % 3!=0){
            System.out.println(num +" is divisible by 5 but not with 3");
        }
        if(num % 5 != 0 && num % 3==0){
            System.out.println(num +" is divisible by 3 but not with 5");
        }
        if(num % 5 !=0 && num %3 !=0){
            System.out.println("Number is not divisible by 3 as well as 5");
        }

}
}
