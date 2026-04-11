// Count the number of digits in a given number. 

class NBL1 {
    public static void main(String[] args) {
        int num = 123567;
        int count = 0;
        while(num!=0){
            count++;
            num = num/10;
        }
        System.out.println(count);
    }
    
}