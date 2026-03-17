// Take a temperature value and print “Cold”, “Warm”, or “Hot” using range conditions
import java.util.Scanner;
public class SC8{
  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = in.nextInt();
        if(num<0){
            System.out.println("its in negative nigga,cover your ass");
        }
        if(0<=num && num<=20){
            System.out.println("cold");
        }
        else if(num>20 && num<32){
            System.out.println("warm");
        }
        else{
            System.out.println("hot");
        }
  }
}