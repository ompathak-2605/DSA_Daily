// Find HCF (GCD) of two numbers using loops.
public class MLP4 {
    static int HCF(int a, int b){
        int result = 1;
        for (int i = 1; i <=Math.min(a, b); i++) {
            if(a%i ==0 && b%i==0){
                result = i;
            }  
        }
        return result;
    }
    public static void main(String[] args) {
        int a = 12;
        int b = 30;
        System.out.println("HCF OF "+a+" AND "+b+" IS "+HCF(a, b));

    }
}
