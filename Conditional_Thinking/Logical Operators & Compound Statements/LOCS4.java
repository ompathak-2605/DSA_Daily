// Take 24-hour time (hours and minutes) and print whether it is AM or PM.
import java.util.Scanner;
public class LOCS4 {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.print("Enter hour: ");
        int hour= take.nextInt() ;
        System.out.print("Enter minute: ");
        int minute= take.nextInt();
        if (hour < 0 || hour > 23 || minute < 0 || minute > 59){
            System.out.println("This time is invalid");
            return;
        }
        if(hour==0 ){
            System.out.println("12 AM");
        }
        else if(hour == 12){
            System.out.println("12 PM");
        }
        else if(hour<12){
            System.out.println("AM");
        }
        else System.out.println("PM");
    }
}
