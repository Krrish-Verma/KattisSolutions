import java.io.*;
import java.util.*;

public class Autori {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        for(int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))) {
                pw.print(str.charAt(i));
            }
        }



        br.close();
        pw.close();
    }

}
