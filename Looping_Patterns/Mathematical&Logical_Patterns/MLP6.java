// Print all factors of a given number. 
public class MLP6 {
    static void factor(int x) {
        System.out.println("Factors of "+x+" are:");
        for (int i = 1; i <=x/2; i++) {
            if(x%i==0){
                System.out.println(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        int a = 50;
        factor(a);
    }
}
