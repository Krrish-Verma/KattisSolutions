import java.util.*;
import java.io.*;

public class Bijele {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int king = sc.nextInt();
        int queen = sc.nextInt();
        int rook = sc.nextInt();
        int bishops = sc.nextInt();
        int knights = sc.nextInt();
        int pawns = sc.nextInt();

        if(king != 1) System.out.print(1 - king + " ");
        else System.out.print(0 + " ");

        if(queen != 1) System.out.print(1 - queen + " ");
        else System.out.print(0 + " ");

        if(rook != 2) System.out.print(2 - rook + " ");
        else System.out.print(0 + " ");

        if(bishops != 2) System.out.print(2 - bishops + " ");
        else System.out.print(0 + " ");

        if(knights != 2) System.out.print(2 - knights + " ");
        else System.out.print(0 + " ");

        if(pawns != 8) System.out.print(8 - pawns + " ");
        else System.out.print(0 + " ");

    }
}
