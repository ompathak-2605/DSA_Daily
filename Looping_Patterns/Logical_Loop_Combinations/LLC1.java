// Print all numbers whose sum of digits is even (1–100).
public class LLC1 {
    public static void main(String[] args) {
        System.out.println("All numbers whose digit sum is even is ");
        int sum = 0;
        int temp ;
        for (int i = 1; i <=100; i++) {
            temp=i;
            while(temp!=0){
                sum = sum + i%10;
                temp = temp/10;
            }
            if(sum%2==0){
                System.out.println(i);
            }
        }
    }
}
