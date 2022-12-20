import  java.io.*;
import java.util.*;

public class DetailedDifferences {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String s1 = br.readLine();
            String s2 = br.readLine();

            pw.println(s1);
            pw.println(s2);


            char[] first = s1.toCharArray();
            char[] second = s2.toCharArray();
            for (int j = 0; j < first.length; j++) {

                br.close();
                pw.close();
            }

        }
    }
}
