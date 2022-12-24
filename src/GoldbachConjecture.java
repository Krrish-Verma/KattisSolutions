import java.util.ArrayList;
import java.util.Scanner;
//ChatGPT's code lol
public class GoldbachConjecture {
    // Check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = sc.nextInt();

        for (int i = 0; i < numCases; i++) {
            int x = sc.nextInt();
            ArrayList<int[]> sums = new ArrayList<>();

            // Find all the ways x can be represented as a sum of two primes
            for (int j = 2; j <= x / 2; j++) {
                if (isPrime(j) && isPrime(x - j)) {
                    sums.add(new int[]{j, x - j});
                }
            }

            // Print the number of unique ways x can be represented as a sum of two primes
            System.out.println( x + " has "+ sums.size() + " representation(s)");

            // Print the sums in increasing order of the first addend
            sums.sort((a, b) -> a[0] - b[0]);
            for (int[] sum : sums) {
                System.out.println(sum[0] + "+" + sum[1]);
            }

            // Print a blank line after each test case
            System.out.println();
        }
    }
}
