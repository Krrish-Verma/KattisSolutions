import java.io.*;
import java.util.*;

public class FiftyShadesOfPink {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i = 0; i < n; i++) {

            String str = br.readLine().toLowerCase();


            if(str.contains("pink") || str.contains("rose")) {
                count++;
            }



        }

        if(count > 0) pw.println(count);
        else pw.println("I must watch Star Wars with my daughter");

        br.close();
        pw.close();
    }

}
