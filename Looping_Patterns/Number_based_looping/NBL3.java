// Check if a number is a palindrome.
public class NBL3 {
    public static void main(String[] args) {
        int num = 12331;
        int junk = num;
        int num2 = 0;
    while(num!=0){
        num2 = num2*10+(num%10);
            num = num/10;
    }
    if(num2==junk) System.out.println("It's a pelendrom");
    else System.out.println("Its not a pelendrom");
    }
}
