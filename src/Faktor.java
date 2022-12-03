import java.util.*;
import java.io.*;

public class Faktor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int published = sc.nextInt();
        int impact = sc.nextInt();

        System.out.println((published) * (impact - 1) + 1);


    }
}
