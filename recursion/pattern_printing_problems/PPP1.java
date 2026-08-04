

public class PPP1 {
    public static void main(String[] args) {
        int n = 5;
        printPattern(n);
    }
    public static void printPattern(int n) {
        if(n==0){
            return;
        }
        System.out.print("* ");
        printPattern(n-1);
        }
    }
