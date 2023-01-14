import java.io.*;
import java.util.*;

public class Pauleigon {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int P = sc.nextInt();
        int O = sc.nextInt();

        if((P + O) % (n * 2) < n) System.out.println("Paul");
        else System.out.println("opponent");


    }

}
