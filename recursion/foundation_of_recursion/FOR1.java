package recursion.foundation_of_recursion;

import java.util.Scanner;

public class FOR1 {
    static void print(int i, int n) {
        if (i > n) return;
        System.out.println(i);
        print(i + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        print(1, num);
    }
}