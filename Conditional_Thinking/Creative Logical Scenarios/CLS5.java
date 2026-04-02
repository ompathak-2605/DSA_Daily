// Take three numbers and check if they are in arithmetic progression.

import java.util.Scanner;

public class CLS5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i <
            3; i++) {
            System.out.println("Enter number");
            arr[i]=sc.nextInt();
        }
        if((arr[1]-arr[0])==(arr[2]-arr[1])){
            System.out.println("In ap");
        }
        else{
            System.out.println("Not in ap");
        }
        sc.close();
    }
}
