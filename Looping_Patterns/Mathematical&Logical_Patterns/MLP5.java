// Find LCM of two numbers using loops.
public class MLP5 {
    static int LCM(int a,int b){
        int max = Math.max(a, b);
        int lcm = max;
        while(true){
            if(lcm%a==0 && lcm%b==0){
                return lcm;
            }
            lcm+=max;
        }
    }

     public static void main(String[] args){
        int a = 10;
        int b = 15;
        System.out.println(LCM(a,b));

     }
}
