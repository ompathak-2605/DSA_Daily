import java.util.Scanner;

public class SC10 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the character: ");
        char c = in.next().charAt(0);
        if(Character.isLowerCase(c)){
            System.out.println("Its an lowercase lette");
        }
        else if(Character.isUpperCase(c)){
            System.out.println("Its an uppercase letter");
        }
        else if(Character.isDigit(c)){
            System.out.println("Its an digite");
        }
        else if(((int)c>=32 && (int)c<=47) || ((int)c>=58 && (int)c<=64) || ((int)c>=91 && (int)c<=96) || ((int)c>=123 && (int)c<=127)){
            System.out.println("It's a special character");
        }
    }
}
