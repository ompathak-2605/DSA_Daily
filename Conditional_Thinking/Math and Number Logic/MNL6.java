// Take coordinates (x, y) and determine which quadrant the point lies in.
import java.util.Scanner;
public class MNL6 {
    @SuppressWarnings("UnnecessaryReturnStatement")
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.println("Enter the x coordinate");
        int x = take.nextInt();
        System.out.println("Enter the y coordinate");
        int y = take.nextInt();
        if(y==0 || x==0){
            System.out.println("The point dosen't lie in any quadrent");
            return ;
        }
        else if(x>0 && y>0){
            System.out.println("1st quadrent");
        }
        else if(x<0 && y>0){
            System.out.println("2nd quadrent");
        }
        else if(x<0 && y<0){
            System.out.println("3rd quadrent");
        }
        else if(x>0 && y<0){
            System.out.println("4th quadrent");
        }

    }
}
