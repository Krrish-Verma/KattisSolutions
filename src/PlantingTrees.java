import java.io.*;
import java.util.*;

public class PlantingTrees {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);


        int t = sc.nextInt();
        int[] n = new int[t];

        for (int i = 0; i < n.length; i++){
            n[i] = sc.nextInt();
        }


        Arrays.sort(n);
        int max = 0;

        for (int i = n.length - 1; i >= 0; i--)
        {
            n[i] += 1 + (n.length - i);

            if (n[i] > max)
                max = n[i];
        }

        System.out.println(max);



    }

}
