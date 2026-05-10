// Find the smallest and largest digit in a given number. 
import java.util.Scanner;

public class LLC5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        while(num!=0){
            int temp = num%10;
            if(temp<=smallest){
                smallest=temp;
            }
            if(temp>=largest){
                largest = temp;
            }
            num = num/10;
        }
        System.out.println("Smallest and largest digits are "+smallest+ " , "+largest);
        sc.close();
    }
}
