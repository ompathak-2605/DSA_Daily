public class NBL5 {
    public static void main(String[] args) {
        int num = 123;
        int jaar = num;
        int sum = 0;
        int digit = String.valueOf(num).length();
        while(num!=0){
            int s = num%10;
            sum += Math.pow(s,digit);
            num /= 10;
        }
        if(jaar == sum) System.out.println("Armstrong");
        else System.out.println("Not armstrong");
    }
}
