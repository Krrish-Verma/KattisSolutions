import java.io.*;
import java.util.*;

public class Oddities {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int testCases = Integer.parseInt(br.readLine());

        for(int i =0; i < testCases; i++) {
            int n = Integer.parseInt(br.readLine());

            if(n % 2 == 0) pw.println(n + " is even");
            else pw.println(n + " is odd");

        }


        br.close();
        pw.close();
    }

}
