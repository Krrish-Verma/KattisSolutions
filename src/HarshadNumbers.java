import java.io.*;
import java.util.*;

public class HarshadNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        while(!checkHarshadNumber(num)){
            num++;

        }
        pw.println(num);

        br.close();
        pw.close();
    }

    public static boolean checkHarshadNumber(int num) {

        int sum = 0;
        int store = num;

        while(num > 0){
            sum += num % 10;
            num /= 10;

        }
        return (store % sum == 0);

    }



}
