import java.io.*;
import java.util.*;

public class JanitorTroubles {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        double s = (a + b + c + d)/2.0;

        System.out.println(Math.sqrt( (s - a) * (s - b) * (s - c) * (s - d) ));


    }

}
