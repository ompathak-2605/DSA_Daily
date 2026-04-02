// Check voting eligibility for a given age (18+).

import java.util.Scanner;

public class NM6 {
    public static void main(String[] args) {
         System.out.println("Enter age: ");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        if( age <=0){
            System.out.println("This is invalid");
        }
        else if(age>0 && age<18){
            System.out.println("Can't vote");
        }
        else{
            System.out.println("Can vote");
        }

    }
}
