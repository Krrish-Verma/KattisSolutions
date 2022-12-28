import java.io.*;
import java.util.*;

public class KnightPacking {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        if(n % 2 == 0) pw.println("Second");
        else pw.println("First");

        br.close();
        pw.close();
    }

}
