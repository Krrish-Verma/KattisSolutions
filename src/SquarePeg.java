import java.io.*;
import java.util.*;

public class SquarePeg {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int peg = sc.nextInt();
        int hole = sc.nextInt();
        if (peg <= Math.sqrt(2*(hole*hole))) {
            System.out.println("fits");
        } else {
            System.out.println("nope");
        }


    }

}
