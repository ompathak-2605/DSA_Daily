
// Count the number of digits in a number recursively.
public class NRT1 {
    public static void main(String[] args) {
        int num = 628927;
        System.out.println(count(num));
    }
    static int count( int n){
        if(n==0) return 0;
        
        return 1 + count(n/10);
    }
}
