// Print Fibonacci series up to n terms recursively.  
public class FOR9 {
    public static void main(String[] args) {
        int n = 10;
        fibo(n,0,1);
    }
    static void fibo(int n,int a, int b){
        if(n==0) return ;
        System.out.print(a+" ");
        fibo(n-1,b,a+b);
        
    }
}
