// Find product of digits of a number recursively.

public class NRT4 {

    public static void main(String[] args) {
        int n = 2314;
        System.out.println(product(1, n));
    }

    static int product(int a, int n) {
        n = Math.abs(n);
        if (n == 0) {
            return a;
        }
        return product(a * (n % 10), n / 10);
    }
}
