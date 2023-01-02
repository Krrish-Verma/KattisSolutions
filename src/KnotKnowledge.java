import java.io.*;
import java.util.*;

public class KnotKnowledge {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        boolean missing = false;

        int n = sc.nextInt();

        int[] allKnots = new int[n];
        int[] completedKnots = new int[n - 1];


        for (int i = 0; i < n; i++) {
            allKnots[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            completedKnots[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < n; i++) {
            missing = false;
            for (int j = 0; j < n - 1; j++) {
                if ((completedKnots[j] == allKnots[i])) {
                    missing = true;
                    break;
                }
            }



            if(!missing){
                System.out.println(completedKnots[i]);
                break;
            }

        }
    }
}
