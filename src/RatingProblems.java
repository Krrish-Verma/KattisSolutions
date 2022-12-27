import java.io.*;
import java.util.*;

public class RatingProblems {
    public static void main( String args[] ){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        double sum = 0.0;

        int val = 3 * (n - k);

        for(int i = 0; i < k; i++) {
            sum += sc.nextInt();
        }


        System.out.println((sum - val) / n + " " +  (sum + val) / n);
    }

}
