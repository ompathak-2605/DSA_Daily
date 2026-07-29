// Find GCD (HCF) of two numbers using Euclid’s algorithm recursively.
public class NRT5 {
    public static void main(String[] args) {
        int a = 15;
        int b = 45;
        System.out.println(HCF(a, b));
    }
    static int HCF(int a, int b) {
        if(b%a==0){
            return a;
        }
        return HCF(b%a,a);
    }
}
