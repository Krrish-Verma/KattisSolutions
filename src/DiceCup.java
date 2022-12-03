import java.util.*;
import java.io.*;

public class DiceCup {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        if(n > m) {
            int temp = n;
            n = m;
            m = temp;
        }

        for(int i = n + 1; i < m + 2; i++) {
            System.out.println(i);
        }


    }
}
