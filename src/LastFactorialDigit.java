import java.util.*;

public class LastFactorialDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for(int i = 0; i < cases; i++) {

            int num = sc.nextInt();
            int factor = 1;

            for (int j = 1; j <= num; j++) {
                factor = j * factor;
            }

            int last = factor % 10;

            System.out.println(last);
        }
    }
}
