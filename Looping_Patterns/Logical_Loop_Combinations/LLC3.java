// Print all numbers that are palindromes between 1–500.
public class LLC3 {
    public static void main(String[] args) {
        System.out.println("These are the pelendrom between 1 and 500");
        for (int i = 1; i <=9; i++) {
            System.out.println(i);
         }
         for (int j = 1; j <=9; j++) {
             System.out.println(11*j);
         }

         for (int k = 1; k <=4; k++) {

             for (int l = 0; l < 9; l++) {
                 int digit = (100*k)+(10*l)+k;
                 if(digit<500){
                    System.out.println(digit);
                 }
             }
         }
    }
}
