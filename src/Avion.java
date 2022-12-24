import java.io.*;
import java.util.*;

public class Avion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        String res = "";
        for(int i = 1; i <= 5; i++) {
            if((br.readLine()).contains("FBI"))
                res += i + " ";
        }
        if(res.length() > 0)
            pw.println(res);
        else
            pw.println("HE GOT AWAY!");
        pw.close();


        br.close();
        pw.close();
    }

}
