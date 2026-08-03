public class NRT9 {
    public static void main(String[] args) {
        int n = 5;
        int sum = sumOfOddNumbers(n);
        System.out.println("Sum of first " + n + " odd numbers is: " + sum);
    }
    public static int sumOfOddNumbers(int n){
        if(n==0){
            return 0;
        } else {
            return (2*n - 1) + sumOfOddNumbers(n-1);
        }
    }
}
