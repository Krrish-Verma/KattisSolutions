import java.io.*;
import java.util.*;

public class AlienNumbers {
    public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int j = 0; j < n; j++)
        {

            String num = sc.next();
            String one = sc.next();
            String two = sc.next();
            HashMap<String , Integer> map1 = new HashMap<String , Integer>();
            HashMap<Integer , String> map2 = new HashMap<Integer , String>();


            int base1 = one.length();
            int base2 = two.length();

            for (int i = 0; i < one.length(); i++)
                map1.put(one.substring(i, i + 1), i);

            for (int i = 0; i < two.length(); i++)
                map2.put(i, two.substring(i, i + 1));

            long base10Num = 0;

            for (int x = num.length() - 1; x >= 0; x--)
                base10Num += map1.get(num.substring(x, x + 1)) * (long)Math.pow(base1, num.length() - x - 1);

            int exp = (int)(Math.log(base10Num) / Math.log(base2));
            String str = "";

            while (exp-- > -1)
            {
                int digit = (int)(base10Num / Math.pow(base2, exp + 1));
                str += map2.get(digit);
                base10Num -= Math.pow(base2, exp + 1) * digit;
            }

            System.out.println("Case #" + j + ": " + str);
        }

        sc.close();
    }

}
