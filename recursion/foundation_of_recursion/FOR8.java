
// Find nth Fibonacci number recursively. 
public class FOR8 {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(fibo(n));
    }
    static int fibo(int n){
        if(n<=0) return 0;
        if(n==1) return 1;
        return fibo(n-1) + fibo(n-2); 
        
    }
}
