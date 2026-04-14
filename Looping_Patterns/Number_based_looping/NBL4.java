//  Find the sum of digits of a number.
public class NBL4 {
    public static void main(String[] args) {
        int num =53892;
        int sum =0;
        while(num!=0){
            sum = sum + (num%10);
            num = num / 10;
        }
        System.out.println("Sum of the digits is : "+sum);
    }
}
