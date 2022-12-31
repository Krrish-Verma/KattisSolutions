import java.util.*;
import java.io.*;

public class MixedFraction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true){

            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a == 0 && b == 0) break;

            int whole = a/b;
            int numerator = a % b;
            int den = b;

            System.out.println(whole + " "+ numerator +  " / " + den);



        }


    }
}
