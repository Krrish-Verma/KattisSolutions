import java.io.*;
import java.util.*;

public class TakeTwoStones {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

            if(Integer.parseInt(br.readLine()) % 2 == 0) pw.println("Bob");
            else pw.println("Alice");



        br.close();
        pw.close();
    }

}
