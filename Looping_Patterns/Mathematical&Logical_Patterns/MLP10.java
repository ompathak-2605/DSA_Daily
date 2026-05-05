    //Print first n terms of a geometric progression (a, r).
    import java.util.Scanner;
    public class MLP10 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter first term (a): ");
        int a = sc.nextInt();

        System.out.print("Enter common ratio (r): ");
        int r = sc.nextInt();

        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();

       
        System.out.println("First " + n + " terms of the GP are:");

        int term = a;

        for (int i = 0; i < n; i++) {
            System.out.print(term + " ");
            term = term * r;
        }

        sc.close();
    }
}

