// Print a square of stars recursively (n×n). 
public class PPP2 {
    public static void printPattern(int n) {
        if (n <= 0) {
            return;
        }
        printRow(n);
        System.out.println();
        printPattern(n - 1);
    }

    private static void printRow(int n) {
        if (n <= 0) {
            return;
        }
        System.out.print("* ");
        printRow(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        printPattern(n);
    }
}
