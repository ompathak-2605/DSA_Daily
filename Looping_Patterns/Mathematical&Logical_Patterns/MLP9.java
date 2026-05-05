
import java.util.Scanner;

// Print first n terms of an arithmetic progression (a, d). 
public class MLP9{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            int a = sc.nextInt();
            System.out.print("Enter the common difference: ");
            int d = sc.nextInt();
            System.out.print("Enter the number of terms required: ");
            int n = sc.nextInt();
            for (int i = 0; i <=n; i++) {
                System.out.print(a+(i*d)+" ");
            }
        }
    }
   
}