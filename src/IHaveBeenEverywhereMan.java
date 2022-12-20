import java.io.*;
import java.util.*;

public class IHaveBeenEverywhereMan {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        HashSet hs = new HashSet<>();

        int testCases = Integer.parseInt(br.readLine());

        for(int i = 0; i < testCases; i++){

            int n = Integer.parseInt(br.readLine());

            for(int j = 0; j < n; j++) {
                String in = br.readLine();
                hs.add(in);
            }

            System.out.println(hs.size());

            hs.clear();

        }


        br.close();
        pw.close();
    }

}
