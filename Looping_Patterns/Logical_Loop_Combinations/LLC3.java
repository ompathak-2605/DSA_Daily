// Print all numbers that are palindromes between 1–500.
public class LLC3 {
    public static void main(String[] args) {
        System.out.println("These are the pelendrom between 1 and 500");
        int temp ;
        int sum ;
        for (int i = 1; i <=500; i++) {
            temp = i;
            sum = 0;
            while(temp!=0){
                sum = sum + (temp%10)*(temp%10);
                temp = temp/10;
            }
            if(sum==i){
                System.out.println(i);
            }

        }
    }
}
