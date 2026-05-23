//  Find sum of digits of a number recursively.
public class FOR10 {
    public static void main(String[] args) {
        int n = 54321;
        System.out.println(value(n));
    }
    static int value (int n){
        if(n==0) return  0;
        int sum = (n%10) + value(n/10);
        return sum;
    }
}
