import java.util.Scanner;

public class CLS10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter year: ");
            int year = sc.nextInt();

            if (year <= 0) {
                System.out.println("Invalid year");
                return;
            }

            int century = (year + 99) / 100;

            System.out.println(century + getSuffix(century) + " century");
        }
    }

    static String getSuffix(int c) {
        if (c % 100 >= 11 && c % 100 <= 13) return "th";

        return switch (c % 10) {
            case 1 -> "st";
            case 2 -> "nd";
            case 3 -> "rd";
            default -> "th";
        };
    }
}