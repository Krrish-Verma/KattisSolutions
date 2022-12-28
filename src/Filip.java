import java.io.*;
import java.util.*;

public class Filip {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int first = a / 100;
        int second = (a % 100) / 10;
        int third = (a % 10);
        int reverse = ((third * 100) + (second * 10) + first);


        int first2 = b / 100;
        int second2 = (b % 100) / 10;
        int third2 = (b % 10);
        int reverse2 = ((third2 * 100) + (second2 * 10) + first2);


        System.out.println(Math.max(reverse, reverse2));

    }

}
