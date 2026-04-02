//  Take marks (0–100) and print the corresponding grade (A/B/C/D/F). 
import java.util.*;
public class NM3{
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = in.nextInt();
        if(marks>=90){
            System.out.println("Grade A");
        }
        if(90>marks && marks>=75){
            System.out.println("Grade B");
        }
        if(75>marks && marks>=60){
            System.out.println("Grade C");
        }
        if(60>marks && marks>=33){
            System.out.println("Grade D");
        }
        if(marks<33){
            System.out.println("Fail");
        }
    }
}
