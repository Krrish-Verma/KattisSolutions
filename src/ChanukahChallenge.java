import java.io.*;
import java.util.*;

public class ChanukahChallenge {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

          for(int i = 1; i <= n; i++) {
            sc.nextInt();

            int num = sc.nextInt();
            int candles = 0;

            for(int j = 2; j < num + 2; j++) {
                candles += j;
            }

            System.out.println(i + " " + candles);

        }


    }

}
