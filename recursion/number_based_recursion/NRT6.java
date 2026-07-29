// Convert a number to binary recursively. 
public class NRT6 {

    static void binary(int n) {
        if (n == 0)
            return;

        binary(n / 2);
        System.out.print(n % 2);
    }

    public static void main(String[] args) {
        int num = 13;
        System.out.print("Binary of " + num + " is ");
        binary(num);
    }
}