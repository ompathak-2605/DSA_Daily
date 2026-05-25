// Check if a number is a palindrome using recursion.
public class NRT3 {
    public static void main(String[] args) {
        int num = 82737;
        if(palindrom(num)) System.out.println("Its a palindrom");
        else System.out.println("Its not a palindrom");
    }
    static int reverse(int a ,int n){
        if(n==0) return a;
        int r = reverse(10*a+n%10, n/10);
        return r;
    }
    public static boolean palindrom(int n){
        if(n<0) return false;
        return n==reverse(0, n);
        
    }
}