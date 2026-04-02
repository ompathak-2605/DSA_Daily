
import java.util.Scanner;


class Triangle{
    int a;
    int b;
    int c;

    public Triangle(int a,int b,int c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    
    public boolean check(){
        return((a+b>c) && (a+c>b) && (b+c>a));
    }
}
public class NM1{
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p = input.nextInt();
        int q = input.nextInt();
        int r = input.nextInt();
        Triangle t = new Triangle(p,q,r);
        if(t.check()){
            System.out.println("triangle");
        }
        else{
            System.out.println("not triangle");
        }
    }
}