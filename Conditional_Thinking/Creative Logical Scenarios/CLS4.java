// Take time (hours and minutes) and print the smaller angle between the hour and minute hands
import java.util.Scanner;

public class CLS4 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter hour : ");
        int h = sc.nextInt();
        if(h<0 || h>12){
            System.out.println("Use 12 hours clock format");
            return;
        }
        if(h==12){
            h=0;
        }
        System.out.print("Enter minute : ");
        int m = sc.nextInt();
        if(m<0 || m>59){
            System.out.println("Invalid");
            return;
        }
        double angle = Math.abs(30*h-(5.5)*m);
        if(angle>180){
            angle = 360 - angle;
        }
        System.out.println("Angle will be "+angle+" Degree");
    }
}
