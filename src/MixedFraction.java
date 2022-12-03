import java.util.*;
import java.io.*;

public class MixedFraction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(sc.nextInt() != 0){

            int a = sc.nextInt();
            int b = sc.nextInt();

            int whole = a/b;
            int numerator = a % b;
            int den = b;

            System.out.println(whole + " "+ numerator +  " / " + den);



        }


    }
}
