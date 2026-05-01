// Check if a number is a strong number (sum of factorials of digits = number). 
public class MLP8 {
    static int factorial(int a) {
        int facto = 1;
        for (int i = a; i >=1; i--) {
            facto = facto * i;
        }
        return facto;
    }
    static boolean isstrong(int b) {
        int temp = b;
        int sum = 0;

        while(temp!=0){
            int test = temp%10;
            sum = sum + factorial(test);
            temp /= 10;
        
        }
        return sum == b;
    }
    public static void main(String[] args) {
        int a = 145;
         if(isstrong(a)){
            System.out.println("its a strong number");
         }
         else{
            System.out.println("Its not");
         }
    }
}
