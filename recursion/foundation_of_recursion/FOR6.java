package recursion.foundation_of_recursion;
// Print factorial of a number recursively.
public class FOR6 {
    public static void main(String[] args) {
        int num =5;
        System.out.println(facto(num));
    }
    static int facto(int n){
        if(n==1 || n==0) return 1;
        return n*facto(n-1);    
        
    }
}
