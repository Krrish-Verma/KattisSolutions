import java.util.*;
import java.io.*;

public class Trik {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = 0;
        String moves = sc.next();

        for (int i = 0; i < moves.length(); i++)
        {
            if (moves.charAt(i) == 'A' && num != 2)
                num = 1 - num;

            if (moves.charAt(i) == 'B' && num != 0)
                num = - num + 3;

            if (moves.charAt(i) == 'C' && num != 1)
                num = -num + 2;
        }

        System.out.println(num + 1);





    }
}
