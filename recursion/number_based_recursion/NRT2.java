// Reverse a number recursively.
public class NRT2 {
    public static void main(String[] args) {
        int num = 12345;
        System.out.println(reverse(0,num));
    }
    static int reverse(int a ,int n){
        if(n==0) return a;
        int r = reverse(10*a+n%10, n/10);
        return r;
    }
}
