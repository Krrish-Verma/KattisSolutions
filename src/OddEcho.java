import java.util.*;
import java.io.*;

public class OddEcho {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i+=2)
        {
            String words = sc.nextLine();
            System.out.println(words);

        }

    }
}
