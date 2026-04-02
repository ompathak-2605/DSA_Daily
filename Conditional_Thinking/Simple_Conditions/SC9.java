// Take a character and check if it’s a vowel or consonant.
import java.util.Scanner;
public class SC9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the alphabet: ");
        char temp = Character.toLowerCase(in.next().charAt(0));
        if(temp == 'a' || temp =='e' || temp =='i' || temp == 'o' || temp =='u'){
            System.out.println("Entered letter is vowel");
         }
         else{
            System.out.println("Entered letter is consonent");
         }
    }
}
