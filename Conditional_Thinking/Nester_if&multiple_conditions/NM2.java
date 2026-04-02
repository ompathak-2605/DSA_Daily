import java.util.Scanner;
// If the sides form a valid triangle, determine whether it is equilateral, isosceles, or scalene.

public class NM2{
    static void check(int a,int b,int c){
        if(a+b+c != 180){
            System.out.println("Not a valid triangle");
        }
        else if(a==b && b==c){
            System.out.println("Equalateral");
        }
        else if(a!=b && b!=c){
            System.out.println("Scalene");
        }
        else if((a == b && c!= a && c!=b) || (c == b && a!= c && a!=b) || (a == c && b!= a && b!=c) ){
            System.out.println("Isoseles");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter 1st side : ");
        int a = in.nextInt();
        System.out.println("enter 2nd side : ");
        int b = in.nextInt();
        System.out.println("enter 3rd side : ");
        int c = in.nextInt();
        check(a, b, c);
    }
    }
    

