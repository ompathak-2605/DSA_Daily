// Take a single digit (0–9) and print its word form (“Zero” to “Nine”). 
import java.util.Scanner;

public class LOCS7 {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = take.nextInt();
        String [] word = {"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};
        if(num>9 || num<0){
            System.out.println("Enter single digit number");
        }
        else{
            System.out.println(word[num]);
        }
    }
}
