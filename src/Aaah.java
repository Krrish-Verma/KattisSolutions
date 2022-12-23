import java.io.*;
import java.util.*;

public class Aaah {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        String line1 = br.readLine();
        String line2 = br.readLine();

        if(line1.length() >= line2.length()) {
            pw.println("go");
        }
        else {
            pw.println("no");
        }



        br.close();
        pw.close();
    }

}
