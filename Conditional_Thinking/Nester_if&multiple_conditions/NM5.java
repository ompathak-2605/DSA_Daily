
import java.util.Scanner;

/*
Take the hour of the day (0–23) and print “Good Morning”, “Good Afternoon”, “Good 
Evening”, or “Good Night”.
 */ 
public class NM5 {
    public static void main(String[] args) {
        System.out.println("Enter time: ");
        Scanner in = new Scanner(System.in);
        int time = in.nextInt();
        if(time>=4 && time<=11){
            System.out.println("Good Morning");
        }
        else if(time>11 && time<=15){
            System.out.println("Good Afternoon");
        }
        else if(time>15 && time<=18){
            System.out.println("Good Evening");
        }
        else if((time>18 && time<=23) || (time>=0 && time<=3)){
            System.out.println("Good Night");
        }
    }
}
