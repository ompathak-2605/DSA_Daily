public class NBL7 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            if (i <= 1) continue;

            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}