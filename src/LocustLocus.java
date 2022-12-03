import java.util.Scanner;

public class LocustLocus {
    public static int getSmallestYear(int year, int c1, int c2) {
        int smallestYear = year;
        int commonMultiple = c1;
        while (commonMultiple % c2 != 0) {
            commonMultiple += c1;
        }

        if (commonMultiple + smallestYear < 2022) {
            while (commonMultiple + smallestYear < 2022) {
                smallestYear += commonMultiple;
            }
        } else {
            smallestYear += commonMultiple;
        }

        return smallestYear ;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int k = in.nextInt();

        int smallestYear = Integer.MAX_VALUE;
        for (int i = 0; i < k; i++) {
            int year = in.nextInt();
            int c1 = in.nextInt(), c2 = in.nextInt();

            if (getSmallestYear(year, c1, c2) < smallestYear) {
                smallestYear = getSmallestYear(year, c1, c2);
            }
        }

        System.out.println(smallestYear);
    }
}
