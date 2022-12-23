import java.io.*;
import java.util.*;

public class Timeloop {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i <= n; i++) {
            pw.println(i + " Abracadabra");
        }

        br.close();
        pw.close();
    }

}
