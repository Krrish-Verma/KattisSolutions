import java.util.*;
import java.io.*;

public class JumboJavelin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int tot = 1 - n;

        for(; n > 0; n--){
            tot += sc.nextInt();
        }


        System.out.println(tot);

    }

}
