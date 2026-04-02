
import java.util.Scanner;

// Take a day number (1–7) and print the corresponding day name.
public class NM9 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();
        switch (day) {
            case 1 -> System.out.println("Sunday");
                case 2 -> System.out.println("Monday");
                case 3 -> System.out.println("Tuesday");
                case 4 -> System.out.println("Wednesday");
                case 5 -> System.out.println("Thursday");
                case 6 -> System.out.println("Friday");
                case 7 -> System.out.println("Saturday");
        
            default -> System.out.println("invalid input");
        }
        in.close();
    }
}
