package recursion.foundation_of_recursion;
// Print only odd numbers from 1 to n recursively. 
import java.util.Scanner;

public class FOR3 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the upper limit");

        int num = sc.nextInt();
        print(1,num);
    }
    static void print(int i,int n){
        if(i>n) return;
        if(i%2!=0){
            System.out.println(i);
        }
        print(i+1,n);
    }
}