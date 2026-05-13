package recursion.foundation_of_recursion;
// Print numbers from n down to 1 using recursion. 

import java.util.Scanner;


public class FOR2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter the upper limit");
        print(num);

    }
    static void print(int n){
        if(n<1) return;
        System.out.println(n);
        print(n-1);
    }
}
