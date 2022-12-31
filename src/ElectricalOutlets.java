import java.util.*;
import java.io.*;

public class ElectricalOutlets {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++) {
            int n = sc.nextInt();
            int sum = 0;

            for(int j = 0; j < n; j++) {
                sum += sc.nextInt();
            }

            System.out.println(sum - (n - 1));


        }
    }
}
