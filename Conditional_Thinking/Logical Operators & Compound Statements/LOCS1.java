
import java.util.Scanner;

// Take a character and check if it is a letter, a digit, or neither.
public class LOCS1 {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.print("Enter the character: ");
        char c = take.next().charAt(0);
        if(Character.isAlphabetic(c)){
            System.out.println("Its a letter");
        }
        else if(Character.isDigit(c)){
            System.out.println("Its a number");
        }
        else{
            System.out.println("Its neither a digit or a letter");
        }
    }
}
