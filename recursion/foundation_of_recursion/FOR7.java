package recursion.foundation_of_recursion;
// Calculate power of a number (xⁿ) using recursion.
public class FOR7 {
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(power(x, n));
        
    }
    static int power(int x , int n){
        if( n==0) return 1;
        int pow = x * power(x, n-1);
        return pow;
    }
}