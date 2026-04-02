
import java.util.Scanner;


// Take an alphabet character and check if it lies between ‘a’ and ‘m’ or ‘n’ and ‘z’.
public class NM8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char c = in.next().charAt(0);
        c = Character.toLowerCase(c);
        if(!Character.isLetter(c)){
            System.out.println("Please enter a valid character.");
        }
        if(c>='a' && c<='m' ){
            System.out.println("lies between a and m");
        }
        else{
            System.out.println("lies between n and z");
        }
    }
}
