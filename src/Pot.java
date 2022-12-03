import java.util.*;
import java.io.*;

public class Pot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        sc.nextLine();
        for(int i = 0; i < n; i++){

            String num = sc.nextLine();

            int result = (int) (Math.pow(Integer.parseInt(num.substring(0, num.length() - 1)), (Integer.parseInt(num) % 10 )));
            sum += result;





        }
        System.out.println(sum);


    }
}
