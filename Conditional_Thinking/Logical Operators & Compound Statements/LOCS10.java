//  Take a password string and check basic rules (length ≥ 8 and contains at least one digit). 

import java.util.Scanner;

public class LOCS10 {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in); 
        System.out.print("Enter the password: ");
        String pass = take.nextLine();
        boolean islong = pass.length()>=8;
        boolean hasdigit = false;
        for (int i = 0; i <= pass.length(); i++) {
            if(Character.isDigit(pass.charAt(i))){
                hasdigit=true;
                break;
            }
        }
        if(islong && hasdigit){
            System.out.println("Valid password");
        }
        else{
            System.out.println("Invalid Password");
        }
    }
}
