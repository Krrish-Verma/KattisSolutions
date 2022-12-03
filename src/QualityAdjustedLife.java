import java.util.*;
import java.io.*;

public class QualityAdjustedLife {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double sum = 0.0;

        for(int i = 0; i < n; i++) {

            double a = sc.nextDouble();
            double b = sc.nextDouble();

            sum += a * b;

        }

        System.out.println(sum);


    }
}
