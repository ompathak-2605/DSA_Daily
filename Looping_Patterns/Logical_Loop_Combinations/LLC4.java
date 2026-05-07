// Print numbers between 1–100 whose digits add up to a multiple of 3. 
public class LLC4 {
    public static void main(String[] args) {
        for (int i = 1; i <=100; i++) {
            if(i%3==0){
                System.out.println(i);
            }
        }
    }
}
