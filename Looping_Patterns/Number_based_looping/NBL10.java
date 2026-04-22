import java.util.Scanner;

public class NBL10 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        int sum = 0;
        System.out.print(a +" "+b+" ");
        for (int i = 1; i <=num; i++) {
           int c = a + b;
           System.out.print(c+" "); 
           sum = sum + c;
            a = b;
            b = c;
        }
        System.out.println("""
                           
                           Total sum is"""+sum);
    }
}
