import java.io.*;
import java.util.*;

public class BetterUp {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        double sum = 0;
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            int curr = sc.nextInt();
            if (curr < 0) continue;

            n++;
            sum += (double) curr;
        }

        System.out.println(sum/n);
    }
}
