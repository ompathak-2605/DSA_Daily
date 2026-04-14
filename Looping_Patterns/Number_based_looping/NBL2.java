// Print the reverse of a given number.
public class NBL2 {
    public static void main(String[] args) {
        int num = 12345;
        int num2 =0;
        while(num!=0){
            num2 = num2*10+(num%10);
            num = num/10;
        }
        System.out.println(num2);
    }
}
