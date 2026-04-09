public class BL10 {
    public static void main(String[] args) {
        int n = 1234;
        int p =1;
        while(n!=0){
            p = p*(n%10);
            n = n/10;
        }
        System.out.println(p);
    }
}
