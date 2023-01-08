import java.io.*;
import java.util.*;

public class YinYang {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int w = 0, k = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'W') w++;
            else k++;
        }

        //update this with ternary operators later -_-
        if(k == w) pw.println(1);
        else pw.println(0);

        br.close();
        pw.close();
    }

}
