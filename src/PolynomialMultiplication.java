import java.io.*;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class PolynomialMultiplication {

    public static int term(int[] p1, int[] p2, int t) {
        return IntStream.rangeClosed(0, t).map(i -> p1[i] * p2[t - i]).sum();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            int[] p1 = new int[600], p2 = new int[600];

            int d1 = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i <= d1; i++) p1[i] = Integer.parseInt(st.nextToken());

            int d2 = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i <= d2; i++) p2[i] = Integer.parseInt(st.nextToken());

            int dSum = d1 + d2;
            pw.print(dSum + "\n" + term(p1, p2, 0));

            for (int i = 1; i <= dSum; i++) pw.print(" " + term(p1, p2, i));

            pw.println();
        }




        br.close();
        pw.close();
    }
}