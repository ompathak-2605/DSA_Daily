import java.util.Scanner;

public class SC10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the character: ");
        char c = in.next().charAt(0);
        if((int)c>=48 && (int)c<=57){
            System.out.println("Its a digit");
        }
        else if((int)c>=65 && (int)c<=90){
            System.out.println("Its an uppercase letter");
        }
        else if((int)c>=97 && (int)c<=122){
            System.out.println("Its an lowercase letter");
        }
        else if(((int)c>=32 && (int)c<=47) || ((int)c>=58 && (int)c<=64) || ((int)c>=91 && (int)c<=96) || ((int)c>=123 && (int)c<=127)){
            System.out.println("It's a special character");
        }


    }
}
