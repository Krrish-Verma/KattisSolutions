import java.io.*;
import java.util.*;

public class SevenWonders {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        String a = br.readLine();
        char[] arr = a.toCharArray();
        int t = 0, c = 0, g = 0;

        for (char value : arr) {

            if (value == 'T') t++;
            else if (value == 'C') c++;
            else g++;
        }
        int total = ((t * t) + (c * c) + (g * g));
        while (t > 0 && c > 0 && g > 0) {
            total += 7;
            t--;
            c--;
            g--;
        }
        pw.println(total);

        br.close();
        pw.close();
    }

}
