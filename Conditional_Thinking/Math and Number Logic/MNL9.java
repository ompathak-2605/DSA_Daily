// Take two angles of a triangle and compute the third angle.
import java.util.Scanner;

public class MNL9 {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.println("Enter 1st angle");
        int num = take.nextInt();
        System.out.println("Enter 2nd angle");
        int num1 = take.nextInt();
        System.out.println("Third angle will be: "+(180-(num+num1)));
    }
}
