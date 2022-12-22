
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class LineThemUp {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        ArrayList<String> names = new ArrayList<>();

        for (int i = 0; i < n; i++) names.add(br.readLine());

        ArrayList<String> sorted = new ArrayList<>(names);
        Collections.sort(sorted);

        if (sorted.equals(names)) pw.println("INCREASING");
        else {
            Collections.reverse(sorted);
            if (sorted.equals(names)) pw.println("DECREASING");
            else pw.println("NEITHER");
        }

        br.close();
        pw.close();
    }
}