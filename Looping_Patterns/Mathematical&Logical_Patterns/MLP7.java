// Find the sum of all factors of a number.
public class MLP7 {
    static int factorsum(int x) {
        int sum=0;
        for (int i = 1; i <= x/2; i++) {
            if(x%i==0){
                sum +=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int x = 60;
        System.out.println("Sum of all factors is "+factorsum(x));
    }
}
