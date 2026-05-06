// Count how many numbers between 1–500 are divisible by 7 but not by 5.
public class LLC2 {
    public static void main(String[] args) {
        for (int i = 0; i < 500; i++) {
            if(i%7==0 && i%5!=0){
                System.out.println(i);
            }
        }
    }
}
