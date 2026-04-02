/*  Take a month number (1–12) and print the number of days in that month (ignore leap 
years). */
import java.util.Scanner;

public class NM10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n<1 || n>12)
            System.out.println("Invalid Input");
        else{
            int r = switch(n){
            case 1,3,5,7,8,10,12 -> 31;
            case 4,6,9,11 -> 30;
            case 2 -> 28;
            default -> -1;
        };
        System.out.println("Days are "+r);
        }
        
    }
}
