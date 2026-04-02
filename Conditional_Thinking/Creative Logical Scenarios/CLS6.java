// Take three numbers and check if they are in geometric progression.

import java.util.Scanner;

public class CLS6 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        System.out.println("Enter the numbers");
        int a = sc.nextInt();
        int b=sc.nextInt();
        int c= sc.nextInt();
        if(b*b == a*c){
            System.out.println("In geometric progression. ");
        }
        else{
            System.out.println("not in geometric progression.");
        }
    }
}
}
