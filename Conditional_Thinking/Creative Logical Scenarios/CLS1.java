
import java.util.Scanner;

// Take coordinates (x, y) and check if the point lies on the X-axis, Y-axis, or at the origin. 

public class CLS1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x-axis : ");
        int x = sc.nextInt();
        System.out.print("Enter y-axis : ");
        int y = sc.nextInt();
        if(x==0 && y==0){
            System.out.println("Point lies on origin");
        }
        else if(x==0){
            System.out.println("Point lies on y-axis");
        }
        else if( y==0){
            System.out.println("Point lies on x-axis");
        }
        else {
            System.out.println("Point dosen't lie on any axis");
        }
        
    }
}
