// Print digits of a number in words recursively (e.g., 123 → “one two three”).
public class NRT7 {
    static String[] word(int num, String[] letter){
        int temp = num;
        int count = 0;
        while(temp>0){
            count++;
            temp/=10;
        }
        String[] result = new String[count];
        for(int i=count-1; i>=0; i--){
            result[i] = letter[num%10];
            num/=10;
        }
        return result;
    }
    public static void main(String[] args) {
        int num = 7367329;
        String[] letter = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] result = word(num, letter);
        System.out.print("Digits of " + num + " in words are: ");
        for(String s : result){
            System.out.print(s + " ");
        }
    }
}
