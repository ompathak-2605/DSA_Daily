//  Calculate the sum of first n even numbers recursively. 
public class NRT8 {
    public static void main(String[] args) {
        int n = 5;
        int sum = sumOfEvenNumbers(n);
        System.out.println("Sum of first " + n + " even numbers is: " + sum);
    }
    public static int sumOfEvenNumbers(int n){
        if(n==0){
            return 0;
        } else {
            return 2*n + sumOfEvenNumbers(n-1);
        }
    }
}
