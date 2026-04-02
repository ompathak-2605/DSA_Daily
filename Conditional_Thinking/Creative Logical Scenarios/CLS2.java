// Take three numbers and check if they can form a Pythagorean triplet.
import java.util.Scanner;
public class CLS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a = sc.nextInt();
        int b=sc.nextInt();
        int c= sc.nextInt();
        int max = Math.max(a, Math.max(c, b));
        if(max==a){
            if(a*a== b*b +c*c){
                System.out.println("Pythagorean triplet");
            }
            else{
                System.out.println("not a triplate");
            }
        }
        else if(max==b){
            if(b*b== a*a +c*c){
                System.out.println("Pythagorean triplet");
            }
            else{
                System.out.println("not a triplate");
            }
        }
        else{
            if(c*c== b*b +a*a){
                System.out.println("Pythagorean triplet");
            }
            else{
                System.out.println("not a triplate");
            }
        }
    }
}
