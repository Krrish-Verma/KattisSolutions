import java.util.*;
import java.io.*;

public class GCVWR {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int g = sc.nextInt();
        int t = sc.nextInt();

        int n = sc.nextInt();
        int weight = g - t;
        int items = 0;
        for(int i = 0; i < n; i++) {
            int input = sc.nextInt();
            items += input;
        }

        System.out.println( (int) (0.9 * weight) - items);

    }
}
