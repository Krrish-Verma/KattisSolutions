import java.util.*;
import java.io.*;

public class Statistics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 0;

        while (sc.hasNextInt()) {
            count++;
            int num = sc.nextInt();

            int min =  1000000; //1 mills
            int max = -1000000; //-1 mills

            for (int i = 0; i < num; i++) {
                int store = sc.nextInt();
                min = Math.min(min, store);
                max = Math.max(max, store);
            }

            System.out.println("Case " + count + ": " + min + " " + max + " " + (max - min));
        }

        }


    }

